package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckConnection {

	private static Statement stmt;

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
	        Class.forName("com.mysql.cj.jdbc.Driver"); // registering driver
	        //Statement stmt;
	        String url = "jdbc:mysql://localhost:3306/demo1";
	        Connection con = DriverManager.getConnection(url, "root", "system@_123");// establish connection
	        //System.out.println(con);
	        System.out.println("Database demo1 connection suceesfully establish");
	
	}

}
