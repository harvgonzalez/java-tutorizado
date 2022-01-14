package es.pildoras.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultasPreparadas {

	public static void main(String[] args) {
		
		String urlConnection = "jdbc:mysql://localhost:3306/gestorproductos";
		
		
		
		try {
			
			// 1. CREAR CONEXION
			Connection connectionDB = DriverManager.getConnection(urlConnection, "root", "javi93x2");
			
			//  2. CREAR STATEMENT
			String sentencia = "SELECT nombre_articulo, seccion, precio, pais_origen FROM productos"
					+ " WHERE seccion=? AND pais_origen=?";
			PreparedStatement myPst = connectionDB.prepareStatement(sentencia);
			
			myPst.setString(1, "confección");
			myPst.setString(2, "españa");
			
			
			// 3. EJECUTAR INSTRUCCION SQL
			ResultSet result = myPst.executeQuery();
			
			// 4. LEER EL RESULT SET
			while(result.next()) {
				System.out.println(result.getString(1) + ", " + result.getString(2) + ", "+ result.getString(3) + ", " + result.getString(4));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	
		// TODO Auto-generated method stub

	}

}
