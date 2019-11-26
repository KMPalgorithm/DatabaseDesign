package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class AwardDAOImpl extends DAOBase implements AwardDAO
{
	private static final String CREATE_AWARD_SQL = "INSERT INTO [Award] VALUES(?,?,?)";
	private static final String DELETE_AWARD_SQL = "DELETE FROM [Award] WHERE AID=?";
	private static final String GET_AWARD_BYAID_SQL = "SELECT * FROM [Award] WHERE AID=?";
	@Override
	public void insertAward(Award Award)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_AWARD_SQL);
			pstm.setString(1,Award.getAID());
			pstm.setString(2,Award.getAName());
			pstm.setString(3,Award.getAIntro());
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
	public void updateAward(Award Award)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_AWARD_SQL);
			pstm.setString(1,Award.getAID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_AWARD_SQL);
			pstm.setString(1,Award.getAID());
			pstm.setString(2,Award.getAName());
			pstm.setString(3,Award.getAIntro());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteAward(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_AWARD_SQL);
			pstm.setString(1,uid);
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
	
	public Award getAward(String aid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_AWARD_BYAID_SQL);
			pstm.setString(1,aid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				Award award = new Award(rset.getString("AID"),rset.getString("AName"),rset.getString("AIntro"));
				return award;
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
	public List<Award> getAwardByC(String sql)
	{
		List<Award> awards = new ArrayList<Award>();
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
				Award award = new Award(rset.getString("AID"),rset.getString("AName"),rset.getString("AIntro"));
				awards.add(award);
				//return award;
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
		return awards;
	}
}
