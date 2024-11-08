package utility;

import java.sql.*;

public class DBConnection 
{
	private static String url = "jdbc:mysql://localhost:3306/bankingApp";
	private static String username = "root";
	private static String password = "2305";
    
    public static Connection getConnection() throws SQLException 
    {
		return DriverManager.getConnection(url,username,password);
	}
    
    public static void closeConnection(Connection con)
    {
    	if (con != null) 
        try
    	{
        	con.close();
    	}
    	catch (SQLException e)
    	{
    		System.out.println("Error Closing Connection" + e.getMessage());
    	}
    }
}
