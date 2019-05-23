package com.pablomonteserin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Define the data source for the driver
			String sourceURL = "jdbc:mysql://localhost/amor";
			// Create a connection through the DriverManager
			Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "root");
			
			
			
			Statement statement = databaseConnection.createStatement();
			statement.executeUpdate("CREATE TABLE nueva_tabla (dni VARCHAR(9) NOT NULL PRIMARY KEY, nombre VARCHAR(30))");
			statement.close();
			
			
			
			databaseConnection.close();

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
