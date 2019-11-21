package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class UserDAOImpl extends DAOBase implements UserDAO
{
	private static final String CREATE_USER_SQL = "INSERT INTO [User] VALUES(?,?,?,?,?)";
	private static final String DELETE_USER_SQL = "DELETE FROM [User] WHERE UID=?";
	private static final String GET_USER_BYUID_SQL = "SELECT * FROM [User] WHERE UID=?";
	@Override
	public void insertUser(User User)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_USER_SQL);
			pstm.setString(1,User.getUID());
			pstm.setString(2,User.getUN());
			pstm.setString(3,User.getPWD());
			pstm.setString(4,User.getPN());
			pstm.setString(5,User.getEmail());
			System.out.println(User.getUID());
			System.out.println(User.getUN());
			System.out.println(User.getPWD());
			System.out.println(User.getPN());
			System.out.println(User.getEmail());
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
	public void updateUser(User User)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_USER_SQL);
			pstm.setString(1,User.getUID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_USER_SQL);
			pstm.setString(1,User.getUID());
			pstm.setString(2,User.getUN());
			pstm.setString(3,User.getPWD());
			pstm.setString(4,User.getPN());
			pstm.setString(5,User.getEmail());
			System.out.println(User.getUID());
			System.out.println(User.getUN());
			System.out.println(User.getPWD());
			System.out.println(User.getPN());
			System.out.println(User.getEmail());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteUser(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_USER_SQL);
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
	
	public User getUser(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_USER_BYUID_SQL);
			pstm.setString(1,uid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				User user = new User(rset.getString("UID"),rset.getString("UN"),rset.getString("PWD"),rset.getString("PN"),rset.getString("Email"));
				return user;
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
	public List<User> getUserByC(String sql)
	{
		List<User> users = new ArrayList<User>();
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
				User user = new User(rset.getString("UID"),rset.getString("UN"),rset.getString("PWD"),rset.getString("PN"),rset.getString("Email"));
				users.add(user);
				//return user;
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
		return users;
	}
}
