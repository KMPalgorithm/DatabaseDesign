package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class FTDAOImpl extends DAOBase implements FTDAO
{
	private static final String CREATE_FT_SQL = "INSERT INTO [FT] VALUES(?,?,?)";
	private static final String DELETE_FT_SQL = "DELETE FROM [FT] WHERE TID=?, TID=?";
	private static final String GET_FT_BYTID_SQL = "SELECT * FROM [FT] WHERE TID=?, TID=?";
	@Override
	public void insertFT(FT ft)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_FT_SQL);
			pstm.setString(1,ft.getFID());
			pstm.setString(2,ft.getTID());
			pstm.setInt(3,ft.getTC());
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
	public void updateFT(FT ft)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FT_SQL);
			pstm.setString(1,ft.getFID());
			pstm.setString(2,ft.getTID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_FT_SQL);
			pstm.setString(1,ft.getFID());
			pstm.setString(2,ft.getTID());
			pstm.setInt(3,ft.getTC());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFT(String fid, String tid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FT_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,tid);
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
	
	public FT getFT(String fid, String tid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_FT_BYTID_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,tid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				FT ft = new FT(rset.getString("FID"),rset.getString("TID"),rset.getInt("TC"));
				return ft;
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
	public List<FT> getFTByC(String sql)
	{
		List<FT> fts = new ArrayList<FT>();
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
				FT ft = new FT(rset.getString("FID"),rset.getString("TID"),rset.getInt("TC"));
				fts.add(ft);
				//return ft;
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
		return fts;
	}
}
