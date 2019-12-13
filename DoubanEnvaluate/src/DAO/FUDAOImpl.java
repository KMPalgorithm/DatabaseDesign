package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class FUDAOImpl extends DAOBase implements FUDAO
{
	private static final String CREATE_FU_SQL = "INSERT INTO [FU] VALUES(?,?)";
	private static final String DELETE_FU_SQL = "DELETE FROM [FU] WHERE UID=? AND FUID=?";
	private static final String GET_FU_BYTID_SQL = "SELECT * FROM [FU] WHERE UID=? AND FUID=?";
	@Override
	public void insertFU(FU fu)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_FU_SQL);
			pstm.setString(1,fu.getUID());
			pstm.setString(2,fu.getFUID());
			int row = pstm.executeUpdate();
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateFU(FU fu)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FU_SQL);
			pstm.setString(1,fu.getUID());
			pstm.setString(2,fu.getFUID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_FU_SQL);
			pstm.setString(1,fu.getUID());
			pstm.setString(2,fu.getFUID());
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFU(String fid, String fuid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FU_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,fuid);
			int row = pstm.executeUpdate();
			 
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
	
	public FU getFU(String fid, String fuid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_FU_BYTID_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,fuid);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				FU fu = new FU(rset.getString("UID"),rset.getString("FUID"));
				return fu;
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
	public List<FU> getFUByC(String sql)
	{
		List<FU> fus = new ArrayList<FU>();
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
				FU fu = new FU(rset.getString("UID"),rset.getString("FUID"));
				fus.add(fu);
				//return fu;
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
		return fus;
	}
}
