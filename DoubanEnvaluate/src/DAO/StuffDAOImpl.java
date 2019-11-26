package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class StuffDAOImpl extends DAOBase implements StuffDAO
{
	private static final String CREATE_STUFF_SQL = "INSERT INTO [Stuff] VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String DELETE_STUFF_SQL = "DELETE FROM [Stuff] WHERE SID=?";
	private static final String GET_STUFF_BYAID_SQL = "SELECT * FROM [Stuff] WHERE SID=?";
	@Override
	public void insertStuff(Stuff stuff)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_STUFF_SQL);
			pstm.setString(1,stuff.getSID());
			pstm.setString(2,stuff.getSN());
			pstm.setString(3,stuff.getSex());
			pstm.setDate(4,stuff.getBDate());
			pstm.setString(5,stuff.getBP());
			pstm.setString(6,stuff.getVoca());
			pstm.setString(7,stuff.getMN());
			pstm.setString(8,stuff.getSIntro());
			pstm.setString(9,stuff.getSPic());
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
	public void updateStuff(Stuff stuff)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_STUFF_SQL);
			pstm.setString(1,stuff.getSID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_STUFF_SQL);
			pstm.setString(1,stuff.getSID());
			pstm.setString(2,stuff.getSN());
			pstm.setString(3,stuff.getSex());
			pstm.setDate(4,stuff.getBDate());
			pstm.setString(5,stuff.getBP());
			pstm.setString(6,stuff.getVoca());
			pstm.setString(7,stuff.getMN());
			pstm.setString(8,stuff.getSIntro());
			pstm.setString(9,stuff.getSPic());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteStuff(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_STUFF_SQL);
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
	
	public Stuff getStuff(String tid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_STUFF_BYAID_SQL);
			pstm.setString(1,tid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				Stuff stuff = new Stuff(rset.getString("SID"),rset.getString("SN"),rset.getString("Sex"),rset.getDate("BDate"),rset.getString("BP"),rset.getString("Voca"),rset.getString("MN"),rset.getString("SIntro"),rset.getString("SPic"));
				return stuff;
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
	public List<Stuff> getStuffByC(String sql)
	{
		List<Stuff> stuffs = new ArrayList<Stuff>();
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
				Stuff stuff = new Stuff(rset.getString("SID"),rset.getString("SN"),rset.getString("Sex"),rset.getDate("BDate"),rset.getString("BP"),rset.getString("Voca"),rset.getString("MN"),rset.getString("SIntro"),rset.getString("SPic"));
				stuffs.add(stuff);
				//return stuff;
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
		return stuffs;
	}
}
