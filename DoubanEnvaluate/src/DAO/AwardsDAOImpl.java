package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class AwardsDAOImpl extends DAOBase implements AwardsDAO
{
	private static final String CREATE_Awards_SQL = "INSERT INTO [Awards] VALUES(?,?,?,?)";
	private static final String DELETE_Awards_SQL = "DELETE FROM [Awards] WHERE AID=? AND ATID=?";
	private static final String GET_Awards_BYTID_SQL = "SELECT * FROM [Awards] WHERE AID=? AND ATID=?";
	@Override
	public void insertAwards(Awards awards)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_Awards_SQL);
			pstm.setString(1,awards.getAID());
			pstm.setString(2,awards.getATID());
			pstm.setString(3,awards.getFID());
			pstm.setString(4,awards.getSID());
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
	public void updateAwards(Awards awards)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_Awards_SQL);
			pstm.setString(1,awards.getAID());
			pstm.setString(2,awards.getATID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_Awards_SQL);
			pstm.setString(1,awards.getAID());
			pstm.setString(2,awards.getATID());
			pstm.setString(3,awards.getFID());
			pstm.setString(3,awards.getSID());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteAwards(String aid, String atid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_Awards_SQL);
			pstm.setString(1,aid);
			pstm.setString(2,atid);
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
	
	public Awards getAwards(String aid, String atid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_Awards_BYTID_SQL);
			pstm.setString(1,aid);
			pstm.setString(2,atid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				Awards awards = new Awards(rset.getString("AID"),rset.getString("ATID"),rset.getString("FID"),rset.getString("SID"));
				return awards;
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
	public List<Awards> getAwardsByC(String sql)
	{
		List<Awards> awardss = new ArrayList<Awards>();
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
				Awards awards = new Awards(rset.getString("AID"),rset.getString("ATID"),rset.getString("FID"),rset.getString("SID"));
				awardss.add(awards);
				//return awards;
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
		return awardss;
	}
}
