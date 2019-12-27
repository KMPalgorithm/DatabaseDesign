package DAO;

import java.util.*;
import domain.*;
import java.sql.*;

public class FilmDAOImpl extends DAOBase implements FilmDAO
{
	private static final String CREATE_FILM_SQL = "INSERT INTO [Film] VALUES(?,?,?,?,?,?,?,?,?)";
	private static final String DELETE_FILM_SQL = "DELETE FROM [Film] WHERE FID=?";
	private static final String GET_FILM_BYUID_SQL = "SELECT * FROM [Film] WHERE FID=?";
	@Override
	public void insertFilm(Film Film)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(CREATE_FILM_SQL);
			pstm.setString(1,Film.getFID());
			pstm.setString(2,Film.getFN());
			pstm.setString(3,Film.getTYPE());
			pstm.setString(4,Film.getAREA());
			pstm.setString(5,Film.getLNG());
			pstm.setInt(6,Film.getFT());
			pstm.setString(7,Film.getLNG());
			pstm.setString(8,Film.getLNG());
			pstm.setString(9,Film.getLNG());
			int row = pstm.executeUpdate();
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateFilm(Film Film)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FILM_SQL);
			pstm.setString(1,Film.getFID());
			int row = pstm.executeUpdate();
			pstm.close();
			pstm = conn.prepareStatement(CREATE_FILM_SQL);
			pstm.setString(1,Film.getFID());
			pstm.setString(2,Film.getFN());
			pstm.setString(3,Film.getTYPE());
			pstm.setString(4,Film.getAREA());
			pstm.setString(5,Film.getLNG());
			pstm.setInt(6,Film.getFT());
			pstm.setString(7,Film.getLNG());
			pstm.setString(8,Film.getLNG());
			pstm.setString(9,Film.getLNG());
			row = pstm.executeUpdate();
			 
			pstm.close();
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteFilm(String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(DELETE_FILM_SQL);
			pstm.setString(1,fid);
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
	
	public Film getFilm(String fid)
	{
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		try
		{
			conn = getConnection();
			pstm = conn.prepareStatement(GET_FILM_BYUID_SQL);
			pstm.setString(1,fid);
			rset = pstm.executeQuery();
			while(rset.next())
			{
				Film film = new Film(rset.getString("FID"),rset.getString("FN"),rset.getString("TYPE"),rset.getString("AREA"),rset.getString("LNG"),rset.getInt("FT"),rset.getString("AN"),rset.getString("INTRO"),rset.getString("POS"));
				return film;
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
	public List<Film> getFilmByC(String sql)
	{
		List<Film> films = new ArrayList<Film>();
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
				Film film = new Film(rset.getString("FID"),rset.getString("FN"),rset.getString("TYPE"),rset.getString("AREA"),rset.getString("LNG"),rset.getInt("FT"),rset.getString("AN"),rset.getString("INTRO"),rset.getString("POS"));
				//System.out.println("DEBUG!!!!!!!!!!!!!!!!!!!!:"+rset.getString("TYPE"));
				films.add(film);
				//return film;
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
		return films;
	}
}
