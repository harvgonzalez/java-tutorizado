package es.pildoras.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudConecctionDB {

	public static void main(String[] args) {
		
		String urlConnection = "jdbc:mysql://localhost:3306/gestorproductos";
		
		
		
		try {
			
			// 1. CREAR CONEXION
			Connection connectionDB = DriverManager.getConnection(urlConnection, "root", "javi93x2");
			
			//  2. CREAR STATEMENT
			Statement statement = connectionDB.createStatement();
			
			// 3. CREAR INSTRUCCIÓN SQL DE UPDATE O INSERCIÓN
			//INSERT -> String inSQL =  "INSERT INTO productos (codigo_articulo, nombre_articulo, precio)  VALUES('AR45', 'Camisa Flores', '€50')";
			// UPDATE ->String inSQL = "UPDATE productos SET precio = '70€' WHERE codigo_articulo = 'AR45'";
			String inSQL = "DELETE FROM productos WHERE codigo_articulo = 'AR45'";
			
			// 4. EJECUTAR SQL
			statement.executeUpdate(inSQL);
			
			//INSERT -> System.out.println("registro ingresado correctamente");
			// UPDATE ->System.out.println("registro modificado correctamente");
			System.out.println("registro ELIMINADO correctamente");
			connectionDB.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Hubo un error");
		} 

	
		// TODO Auto-generated method stub

	}

}
