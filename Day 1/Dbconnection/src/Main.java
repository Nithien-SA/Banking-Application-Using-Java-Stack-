import java.sql.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws SQLException
	{
		String url = "jdbc:mysql://localhost:3306/sample";
		String username = "root";
		String password = "2305";
		
		Connection con = DriverManager.getConnection(url,username,password);
		if (con!=null)
		{
			System.out.println("Connection Established");
		}
		else
		{
			System.out.println("Connection is not established");
		}
		
		Scanner sc= new Scanner(System.in);
		//Insert values into the DB
		System.out.println("Enter User Details: ");
		String name = sc.nextLine();
		String pass = sc.nextLine();
		int id = sc.nextInt();
		
		String sql = "Insert into user(username, password, user_id)" + "values(?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, pass);
		ps.setInt(3, id);
		
		int res = ps.executeUpdate();
		
		if (res>0)
		{
			System.out.println("A new user is Created");
		}
		
		//read values at DB
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println("Usernme: " + rs.getString("username"));
			System.out.println("Password: " + rs.getString("password"));
			System.out.println("User ID: " + rs.getString("user_id"));
		}
		sc.close();
	}
}