package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class LtoFDAOImpl extends DAOBase implements LtoFDAO
{
	private static final String CREATE_LtoF_SQL = "INSERT INTO [LtoF] VALUES(?,?)";
	private static final String DELETE_LtoF_SQL = "DELETE FROM [LtoF] WHERE LID=? AND FID=?";
	private static final String GET_LtoF_BYTID_SQL = "SELECT * FROM [LtoF] WHERE LID=? AND FID=?";
	@Override
	public void insertLtoF(LtoF ltof)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_LtoF_SQL);
			pstm.setString(1,ltof.getLID());
			pstm.setString(2,ltof.getFID());
			int row = pstm.executeUpdate();
			System.out.println("Apply Changes on" + row + "rows Successltoflly");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateLtoF(LtoF ltof)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_LtoF_SQL);
			pstm.setString(1,ltof.getLID());
			pstm.setString(2,ltof.getFID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_LtoF_SQL);
			pstm.setString(1,ltof.getLID());
			pstm.setString(2,ltof.getFID());
			System.out.println("Apply Changes on" + row + "rows Successltoflly");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteLtoF(String fid, String sid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_LtoF_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,sid);
			int row = pstm.executeUpdate();
			System.out.println("Apply Changes on" + row + "rows Successltoflly");
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
	
	public LtoF getLtoF(String fid, String sid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_LtoF_BYTID_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,sid);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				LtoF ltof = new LtoF(rset.getString("LID"),rset.getString("FID"));
				return ltof;
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
	public List<LtoF> getLtoFByC(String sql)
	{
		List<LtoF> ltofs = new ArrayList<LtoF>();
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				LtoF ltof = new LtoF(rset.getString("LID"),rset.getString("FID"));
				ltofs.add(ltof);
				//return ltof;
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
		return ltofs;
	}
}
