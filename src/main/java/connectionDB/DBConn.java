package connectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
	
	public static Connection openDbConnection(String URL, String user, String pass) {
		Connection conn =null;
		try {		
			conn = DriverManager.getConnection(URL, user, pass);
			System.out.println("Conexiune cu sucess!");
		}catch(SQLException e) {	
			System.out.println("Nu am putut face conexiunea!");
		}		
		return conn;
	}
	
	public static void closeDbConnection(Connection conn) {
		
		try {
			System.out.println("Incerc sa inchid conexiunea");
			conn.close();
			System.out.println("Conexiunea a fost inchisa");
		} catch (SQLException e) {
			System.out.println("Nu am putut sa inchid conexiunea");
		}
		
	}
	
}
