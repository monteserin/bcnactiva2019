package com.pablomonteserin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// Define the data source for the driver
			String sourceURL = "jdbc:mysql://localhost/personasdb";
			// Create a connection through the DriverManager
			Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "root");
			/*	
			
			Scanner lector =new Scanner(System.in);
	System.out.println("Introduce tu nombre");
			String nombre = lector.next();
			
				System.out.println("Introduce tu edad");
			int edad = lector.nextInt();
			
			System.out.println("Introduce tu dni");
			String dni = lector.next();
			
		
			
		
			System.out.println("Introduce tu id");
			int id = lector.nextInt();	*/
			
			Statement statement = databaseConnection.createStatement();
			//statement.executeUpdate("INSERT INTO persona VALUES (null,'"+nombre+"','"+dni+"','"+edad+"');");
			//statement.executeUpdate("DELETE FROM persona WHERE id="+id);
			//String sql = "UPDATE persona SET nombre='"+nombre+"', edad="+edad+" WHERE id="+id;
			//System.out.println(sql);
			//statement.executeUpdate(sql);

			
			List<Persona> personas = new ArrayList<Persona>();

			ResultSet personasRS = statement.executeQuery("SELECT * FROM persona");
			while (personasRS.next()){
				Persona p = new Persona();
				p.setNombre(personasRS.getString("nombre"));
				personas.add(p);
			}
			
			
			Iterator<Persona> it = personas.iterator();
			while(it.hasNext()) {
				Persona p2 = it.next();
				System.out.println(p2.getNombre());
			}
			
			
			statement.close();
			
			
			
			
			databaseConnection.close();	// TODO Auto-generated method stub

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
