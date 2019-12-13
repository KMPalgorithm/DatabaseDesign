package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class ReplyDAOImpl extends DAOBase implements ReplyDAO
{
	private static final String CREATE_REPLY_SQL = "INSERT INTO [Reply] VALUES(?,?,?,?,?,?)";
	private static final String DELETE_REPLY_SQL = "DELETE FROM [Reply] WHERE RID=?";
	private static final String GET_REPLY_BYID_SQL = "SELECT * FROM [Reply] WHERE RID=?";
	@Override
	public void insertReply(Reply reply)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_REPLY_SQL);
			pstm.setString(1,reply.getRID());
			pstm.setString(2,reply.getCID());
			pstm.setString(3,reply.getUID());
			pstm.setDate(4,reply.getDate());
			pstm.setString(5,reply.getCont());
			pstm.setInt(6,reply.getLikeNum());
			int row = pstm.executeUpdate();
			 
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
			pstm.setString(1,reply.getRID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_REPLY_SQL);
			pstm.setString(1,reply.getRID());
			pstm.setString(2,reply.getCID());
			pstm.setString(3,reply.getUID());
			pstm.setDate(4,reply.getDate());
			pstm.setString(5,reply.getCont());
			pstm.setInt(6,reply.getLikeNum());
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteReply(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_REPLY_SQL);
			pstm.setString(1,uid);
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
	
	public Reply getReply(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_REPLY_BYID_SQL);
			pstm.setString(1,uid);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				Reply reply = new Reply(rset.getString("RID"),rset.getString("ChatID"),rset.getString("UID"),rset.getDate("Date"),rset.getString("Cont"),rset.getInt("LikeNum"));
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
			while(rset.next())
			{
				Reply reply = new Reply(rset.getString("RID"),rset.getString("ChatID"),rset.getString("UID"),rset.getDate("Date"),rset.getString("Cont"),rset.getInt("LikeNum"));
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
