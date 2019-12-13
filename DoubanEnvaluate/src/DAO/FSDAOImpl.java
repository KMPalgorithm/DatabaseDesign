package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class FSDAOImpl extends DAOBase implements FSDAO
{
	private static final String CREATE_FS_SQL = "INSERT INTO [FS] VALUES(?,?,?)";
	private static final String DELETE_FS_SQL = "DELETE FROM [FS] WHERE SID=? AND FID=?";
	private static final String GET_FS_BYTID_SQL = "SELECT * FROM [FS] WHERE SID=? AND FID=?";
	@Override
	public void insertFS(FS fs)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_FS_SQL);
			pstm.setString(1,fs.getSID());
			pstm.setString(2,fs.getFID());
			pstm.setString(3,fs.getVoca());
			int row = pstm.executeUpdate();
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateFS(FS fs)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FS_SQL);
			pstm.setString(1,fs.getSID());
			pstm.setString(2,fs.getFID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_FS_SQL);
			pstm.setString(1,fs.getSID());
			pstm.setString(2,fs.getFID());
			pstm.setString(3,fs.getVoca());
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFS(String sid, String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FS_SQL);
			pstm.setString(1,sid);
			pstm.setString(2,fid);
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
	
	public FS getFS(String sid, String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_FS_BYTID_SQL);
			pstm.setString(1,sid);
			pstm.setString(2,fid);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				FS fs = new FS(rset.getString("SID"),rset.getString("FID"),rset.getString("Voca"));
				return fs;
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
	public List<FS> getFSByC(String sql)
	{
		List<FS> fss = new ArrayList<FS>();
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
				FS fs = new FS(rset.getString("SID"),rset.getString("FID"),rset.getString("Voca"));
				fss.add(fs);
				//return fs;
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
		return fss;
	}
}
