package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class FFDAOImpl extends DAOBase implements FFDAO
{
	private static final String CREATE_FF_SQL = "INSERT INTO [FF] VALUES(?,?)";
	private static final String DELETE_FF_SQL = "DELETE FROM [FF] WHERE FID=?, FFID=?";
	private static final String GET_FF_BYTID_SQL = "SELECT * FROM [FF] WHERE FID=?, FFID=?";
	@Override
	public void insertFF(FF ff)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_FF_SQL);
			pstm.setString(1,ff.getFID());
			pstm.setString(2,ff.getFFID());
			int row = pstm.executeUpdate();
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateFF(FF ff)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FF_SQL);
			pstm.setString(1,ff.getFID());
			pstm.setString(2,ff.getFFID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_FF_SQL);
			pstm.setString(1,ff.getFID());
			pstm.setString(2,ff.getFFID());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFF(String fid, String ffid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FF_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,ffid);
			int row = pstm.executeUpdate();
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void release(Connection co, PreparedStatement ps, ResultSet rs)
	{
		if(rs!=null)
		{
			try
			{rs.close();}
			catch(Exception e)
			{e.printStackTrace();}
		}
		if(ps!=null)
		{
			try
			{ps.close();}
			catch(Exception e)
			{e.printStackTrace();}
		}
		if(co!=null)
		{
			try
			{co.close();}
			catch(Exception e)
			{e.printStackTrace();}
		}
	}
	
	public FF getFF(String fid, String ffid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_FF_BYTID_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,ffid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				FF ff = new FF(rset.getString("FID"),rset.getString("FFID"));
				return ff;
			}
			pstm.close();
			conn.close();
			rset.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			this.release(conn,pstm,rset);
		}
		return null;
	}
	public List<FF> getFFByC(String sql)
	{
		List<FF> ffs = new ArrayList<FF>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				FF ff = new FF(rset.getString("FID"),rset.getString("FFID"));
				ffs.add(ff);
				//return ff;
			}
			pstm.close();
			conn.close();
			rset.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			this.release(conn,pstm,rset);
		}
		return ffs;
	}
}
