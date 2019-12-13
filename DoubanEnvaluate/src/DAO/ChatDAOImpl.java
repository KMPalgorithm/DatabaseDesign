package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class ChatDAOImpl extends DAOBase implements ChatDAO
{
	private static final String CREATE_CHAT_SQL = "INSERT INTO [Chat] VALUES(?,?,?,?,?,?,?)";
	private static final String DELETE_CHAT_SQL = "DELETE FROM [Chat] WHERE ChatID=?";
	private static final String GET_CHAT_BYTID_SQL = "SELECT * FROM [Chat] WHERE ChatID=?";
	@Override
	public void insertChat(Chat chat)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_CHAT_SQL);
			pstm.setString(1,chat.getFID());
			pstm.setString(2,chat.getCID());
			pstm.setString(3,chat.getUID());
			pstm.setDate(4,chat.getDate());
			pstm.setString(5,chat.getTitle());
			pstm.setString(6,chat.getCont());
			pstm.setInt(7,chat.getLikeNum());
			int row = pstm.executeUpdate();
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateChat(Chat chat)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_CHAT_SQL);
			pstm.setString(1,chat.getCID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_CHAT_SQL);
			pstm.setString(1,chat.getFID());
			pstm.setString(2,chat.getCID());
			pstm.setString(3,chat.getUID());
			pstm.setDate(4,chat.getDate());
			pstm.setString(5,chat.getTitle());
			pstm.setString(6,chat.getCont());
			pstm.setInt(7,chat.getLikeNum());
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteChat(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_CHAT_SQL);
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
	
	public Chat getChat(String cid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_CHAT_BYTID_SQL);
			pstm.setString(1,cid);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				Chat chat = new Chat(rset.getString("FID"),rset.getString("ChatID"),rset.getString("UID"),rset.getDate("Date"),rset.getString("Title"),rset.getString("Cont"),rset.getInt("LinkeNum"));
				return chat;
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
	public List<Chat> getChatByC(String sql)
	{
		List<Chat> chats = new ArrayList<Chat>();
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
				Chat chat = new Chat(rset.getString("FID"),rset.getString("ChatID"),rset.getString("UID"),rset.getDate("Date"),rset.getString("Title"),rset.getString("Cont"),rset.getInt("LinkeNum"));
				chats.add(chat);
				//return chat;
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
		return chats;
	}
}
