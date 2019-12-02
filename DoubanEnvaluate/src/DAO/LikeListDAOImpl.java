package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class LikeListDAOImpl extends DAOBase implements LikeListDAO
{
	private static final String CREATE_LLIST_SQL = "INSERT INTO [LikeList] VALUES(?,?,?,?,?)";
	private static final String DELETE_LLIST_SQL = "DELETE FROM [LikeList] WHERE LID=?";
	private static final String GET_LLIST_BYLID_SQL = "SELECT * FROM [LikeList] WHERE LID=?";
	@Override
	public void insertLikeList(LikeList LikeList)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_LLIST_SQL);
			pstm.setString(1,LikeList.getLID());
			pstm.setString(2,LikeList.getUID());
			pstm.setString(3,LikeList.getLN());
			pstm.setString(4,LikeList.getLIntro());
			pstm.setString(5,LikeList.getLPic());
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
	public void updateLikeList(LikeList LikeList)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_LLIST_SQL);
			pstm.setString(1,LikeList.getLID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_LLIST_SQL);
			pstm.setString(1,LikeList.getLID());
			pstm.setString(2,LikeList.getUID());
			pstm.setString(3,LikeList.getLN());
			pstm.setString(4,LikeList.getLIntro());
			pstm.setString(5,LikeList.getLPic());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteLikeList(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_LLIST_SQL);
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
	
	public LikeList getLikeList(String tid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_LLIST_BYLID_SQL);
			pstm.setString(1,tid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				LikeList likeList = new LikeList(rset.getString("LID"),rset.getString("UID"), rset.getString("LN"),rset.getString("LIntro"),rset.getString("LPic"));
				return likeList;
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
	public List<LikeList> getLikeListByC(String sql)
	{
		List<LikeList> likeLists = new ArrayList<LikeList>();
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
				LikeList likeList = new LikeList(rset.getString("LID"),rset.getString("UID"), rset.getString("LN"),rset.getString("LIntro"),rset.getString("LPic"));
				likeLists.add(likeList);
				//return likeList;
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
		return likeLists;
	}
}
