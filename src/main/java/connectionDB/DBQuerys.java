package connectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBQuerys {
	
	public static List<String> dbSelectQuery(Connection conn, String query){
		List<String> resultList = new ArrayList<>();
		
		try {
			Statement statement = conn.createStatement();
			ResultSet resultset = statement.executeQuery(query);
			while(resultset.next()) {
				resultList.add(resultset.getString(2));
			}
			
		}catch(SQLException e) {
			System.out.println("Nu am putut sa execut query!");
		}
		return resultList;	
	}
	
	
	
	public static void dbUpdateQuery(Connection conn , String query) {
		
		try {
			
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Am facut update");
		}catch(SQLException e) {
			System.out.println("Nu am putut sa fac update!");

		}
		
	}
	
	
	public static void dbDeleteQuery(Connection conn , String query) {
		
		try {
			Statement statement = conn.createStatement();
			statement.executeUpdate(query);
			System.out.println("Am facut delete");

		}catch(SQLException e) {
			System.out.println("Nu am putut sa fac delete!");

		}
		
	}
	

}
