package com.pablomonteserin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main_PreparedStatement {

	public Main_PreparedStatement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sourceURL = "jdbc:mysql://localhost/amor";
			// Create a connection through the DriverManager
			Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "root");
		
			
			
			PreparedStatement pstmt = null;
			pstmt = databaseConnection.prepareStatement("INSERT INTO amantes VALUES (null,?)");
			pstmt.setString(1, "Lucia");
			pstmt.execute();
			pstmt.close();
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Define the data source for the driver
		
		
		
	}

}
