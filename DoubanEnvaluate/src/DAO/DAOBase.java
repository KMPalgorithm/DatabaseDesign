package DAO;

import java.sql.*;

public class DAOBase implements DAO
{
	@Override
	public Connection getConnection()
	{
		Connection conn = null;
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://123.56.46.82:1433;databaseName=DatabaseDesignVersion2;user=sa;password=Luochen992suck!";
			conn = DriverManager.getConnection(url);
		}
		catch(ClassNotFoundException ee)
		{
			ee.printStackTrace();
		}
		catch(SQLException ee)
		{
			ee.printStackTrace();
		}
		return conn;
	}
}