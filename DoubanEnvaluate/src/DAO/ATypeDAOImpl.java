package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class ATypeDAOImpl extends DAOBase implements ATypeDAO
{
	private static final String CREATE_ATYPE_SQL = "INSERT INTO [AType] VALUES(?,?)";
	private static final String DELETE_ATYPE_SQL = "DELETE FROM [AType] WHERE ATID=?";
	private static final String GET_ATYPE_BYATID_SQL = "SELECT * FROM [AType] WHERE ATID=?";
	@Override
	public void insertAType(AType aType)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_ATYPE_SQL);
			pstm.setString(1,aType.getATID());
			pstm.setString(2,aType.getTName());
			int row = pstm.executeUpdate();
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateAType(AType aType)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_ATYPE_SQL);
			pstm.setString(1,aType.getATID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_ATYPE_SQL);
			pstm.setString(1,aType.getATID());
			pstm.setString(2,aType.getTName());
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteAType(String uid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_ATYPE_SQL);
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
	
	public AType getAType(String tid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_ATYPE_BYATID_SQL);
			pstm.setString(1,tid);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				AType aType = new AType(rset.getString("ATID"),rset.getString("TName"));
				return aType;
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
	public List<AType> getATypeByC(String sql)
	{
		List<AType> aTypes = new ArrayList<AType>();
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
				AType aType = new AType(rset.getString("ATID"),rset.getString("TName"));
				aTypes.add(aType);
				//return aType;
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
		return aTypes;
	}
}
