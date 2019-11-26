package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class ReplyDAOImpl extends DAOBase implements ReplyDAO
{
	private static final String CREATE_REPLY_SQL = "INSERT INTO [Reply] VALUES(?,?,?,?,?)";
	private static final String DELETE_REPLY_SQL = "DELETE FROM [Reply] WHERE ChatID=?, UID=?";
	private static final String GET_REPLY_BYID_SQL = "SELECT * FROM [Reply] WHERE ChatID=?, UID=?";
	@Override
	public void insertReply(Reply reply)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_REPLY_SQL);
			pstm.setString(1,reply.getCID());
			pstm.setString(2,reply.getUID());
			pstm.setDate(3,reply.getDate());
			pstm.setString(4,reply.getCont());
			pstm.setInt(5,reply.getLikeNum());
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
	public void updateReply(Reply reply)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_REPLY_SQL);
			pstm.setString(1,reply.getCID());
			pstm.setString(2,reply.getUID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_REPLY_SQL);
			pstm.setString(1,reply.getCID());
			pstm.setString(2,reply.getUID());
			pstm.setDate(3,reply.getDate());
			pstm.setString(4,reply.getCont());
			pstm.setInt(5,reply.getLikeNum());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteReply(String uid, String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_REPLY_SQL);
			pstm.setString(1,uid);
			pstm.setString(2,fid);
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
	
	public Reply getReply(String uid, String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_REPLY_BYID_SQL);
			pstm.setString(1,uid);
			pstm.setString(2,fid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				Reply reply = new Reply(rset.getString("ChatID"),rset.getString("UID"),rset.getDate("Date"),rset.getString("Cont"),rset.getInt("LikeNum"));
				return reply;
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
	public List<Reply> getReplyByC(String sql)
	{
		List<Reply> replys = new ArrayList<Reply>();
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
				Reply reply = new Reply(rset.getString("ChatID"),rset.getString("UID"),rset.getDate("Date"),rset.getString("Cont"),rset.getInt("LikeNum"));
				replys.add(reply);
				//return reply;
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
		return replys;
	}
}
