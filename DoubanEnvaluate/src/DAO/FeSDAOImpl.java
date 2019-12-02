package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class FeSDAOImpl extends DAOBase implements FeSDAO
{
	private static final String CREATE_FeS_SQL = "INSERT INTO [FeS] VALUES(?,?)";
	private static final String DELETE_FeS_SQL = "DELETE FROM [FeS] WHERE UID=? AND SID=?";
	private static final String GET_FeS_BYTID_SQL = "SELECT * FROM [FeS] WHERE UID=? AND SID=?";
	@Override
	public void insertFeS(FeS fes)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_FeS_SQL);
			pstm.setString(1,fes.getUID());
			pstm.setString(2,fes.getSID());
			int row = pstm.executeUpdate();
			System.out.println("Apply Changes on" + row + "rows Successfeslly");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateFeS(FeS fes)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FeS_SQL);
			pstm.setString(1,fes.getUID());
			pstm.setString(2,fes.getSID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_FeS_SQL);
			pstm.setString(1,fes.getUID());
			pstm.setString(2,fes.getSID());
			System.out.println("Apply Changes on" + row + "rows Successfeslly");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFeS(String fid, String sid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FeS_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,sid);
			int row = pstm.executeUpdate();
			System.out.println("Apply Changes on" + row + "rows Successfeslly");
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
	
	public FeS getFeS(String fid, String sid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_FeS_BYTID_SQL);
			pstm.setString(1,fid);
			pstm.setString(2,sid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				FeS fes = new FeS(rset.getString("UID"),rset.getString("SID"));
				return fes;
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
	public List<FeS> getFeSByC(String sql)
	{
		List<FeS> fess = new ArrayList<FeS>();
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
				FeS fes = new FeS(rset.getString("UID"),rset.getString("SID"));
				fess.add(fes);
				//return fes;
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
		return fess;
	}
}
