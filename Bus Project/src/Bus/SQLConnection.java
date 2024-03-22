package Bus;

import java.sql.*;

public class SQLConnection {

	private static final String url="jdbc:mysql://localhost:3306/busbooking";
	private static final String userName="root";
	private static final String password="Jagadesan";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName,password);
	}
	
}
