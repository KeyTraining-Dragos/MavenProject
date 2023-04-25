package connectionDB;

import java.sql.Connection;

public class TestDB {
	
	public static String URL = "";
	public static String USER = "";
	public static String PASS = "";
	
	public static void main(String[] args) {
		
		Connection conn = DBConn.openDbConnection(URL, USER, PASS);
		
		String selectQuery = "select * from customers;";
		String updateQuery = "update customers set CustomerName = 'Test' where CustomerName = 'Dragos'; ";
		
		
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		
		DBQuerys.dbUpdateQuery(conn, updateQuery);
		
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));

		
	}
	

}
