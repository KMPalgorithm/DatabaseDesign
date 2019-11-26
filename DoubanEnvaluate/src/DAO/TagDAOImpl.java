package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class TagDAOImpl extends DAOBase implements TagDAO
{
	private static final String CREATE_TAG_SQL = "INSERT INTO [Tag] VALUES(?,?)";
	private static final String DELETE_TAG_SQL = "DELETE FROM [Tag] WHERE TID=?";
	private static final String GET_TAG_BYTID_SQL = "SELECT * FROM [Tag] WHERE TID=?";
	@Override
	public void insertTag(Tag tag)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_TAG_SQL);
			pstm.setString(1,tag.getTID());
			pstm.setString(2,tag.getTN());
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
	public void updateTag(Tag tag)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_TAG_SQL);
			pstm.setString(1,tag.getTID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_TAG_SQL);
			pstm.setString(1,tag.getTID());
			pstm.setString(2,tag.getTN());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteTag(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_TAG_SQL);
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
	
	public Tag getTag(String tid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_TAG_BYTID_SQL);
			pstm.setString(1,tid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				Tag tag = new Tag(rset.getString("TID"),rset.getString("TN"));
				return tag;
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
	public List<Tag> getTagByC(String sql)
	{
		List<Tag> tags = new ArrayList<Tag>();
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
				Tag tag = new Tag(rset.getString("TID"),rset.getString("TN"));
				tags.add(tag);
				//return tag;
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
		return tags;
	}
}
