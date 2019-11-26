package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class EvaluateDAOImpl extends DAOBase implements EvaluateDAO
{
	private static final String CREATE_EVALUATE_SQL = "INSERT INTO [Evaluate] VALUES(?,?,?,?,?,?,?)";
	private static final String DELETE_EVALUATE_SQL = "DELETE FROM [Evaluate] WHERE UID=?, FID=?";
	private static final String GET_EVALUATE_BYTID_SQL = "SELECT * FROM [Evaluate] WHERE UID=?, FID=?";
	@Override
	public void insertEvaluate(Evaluate Evaluate)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_EVALUATE_SQL);
			pstm.setString(1,Evaluate.getUID());
			pstm.setString(2,Evaluate.getFID());
			pstm.setInt(3,Evaluate.getScore());
			pstm.setString(4,Evaluate.getCMT());
			pstm.setString(5,Evaluate.getStatus());
			pstm.setString(6,Evaluate.getUT());
			pstm.setDate(7,Evaluate.getEDate());
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
	public void updateEvaluate(Evaluate Evaluate)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_EVALUATE_SQL);
			pstm.setString(1,Evaluate.getUID());
			pstm.setString(2,Evaluate.getFID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_EVALUATE_SQL);
			pstm.setString(1,Evaluate.getUID());
			pstm.setString(2,Evaluate.getFID());
			pstm.setInt(3,Evaluate.getScore());
			pstm.setString(4,Evaluate.getCMT());
			pstm.setString(5,Evaluate.getStatus());
			pstm.setString(6,Evaluate.getUT());
			pstm.setDate(7,Evaluate.getEDate());
			System.out.println("Apply Changes on" + row + "rows Successfully");
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteEvaluate(String uid, String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_EVALUATE_SQL);
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
	
	public Evaluate getEvaluate(String uid, String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_EVALUATE_BYTID_SQL);
			pstm.setString(1,uid);
			pstm.setString(2,fid);
			rset = pstm.executeQuery();
			if(rset.next())
			{
				Evaluate evaluate = new Evaluate(rset.getString("UID"),rset.getString("FID"),rset.getInt("Score"),rset.getString("CMT"),rset.getString("Status"),rset.getString("UT"),rset.getDate("EDate"));
				return evaluate;
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
	public List<Evaluate> getEvaluateByC(String sql)
	{
		List<Evaluate> evaluates = new ArrayList<Evaluate>();
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
				Evaluate evaluate = new Evaluate(rset.getString("UID"),rset.getString("FID"),rset.getInt("Score"),rset.getString("CMT"),rset.getString("Status"),rset.getString("UT"),rset.getDate("EDate"));
				evaluates.add(evaluate);
				//return evaluate;
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
		return evaluates;
	}
}