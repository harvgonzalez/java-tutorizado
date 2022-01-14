package es.pildoras.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConectaGestion {

	
	public static void main(String[] args) {
		
		String urlConnection = "jdbc:mysql://localhost:3306/gestorproductos";
		
		
		
		try {
			
			// 1. CREAR CONEXION
			Connection connectionDB = DriverManager.getConnection(urlConnection, "root", "javi93x2");
			
			//  2. CREAR STATEMENT
			Statement statement = connectionDB.createStatement();
			
			// 3. EJECUTAR INSTRUCCION SQL
			ResultSet result = statement.executeQuery("SELECT * FROM productos");
			
			// 4. LEER EL RESULT SET
			while(result.next()) {
				System.out.println(result.getString("codigo_articulo") + " " + result.getString(2) + " ->" + result.getString("PRECIO"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
