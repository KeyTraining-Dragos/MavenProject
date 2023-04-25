package connectionDB;

import java.sql.Connection;

public class TestDB {
	
	public static String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
	public static String USER = "demouser";
	public static String PASS = "demouser";
	
	public static void main(String[] args) {
		
		Connection conn = DBConn.openDbConnection(URL, USER, PASS);
		
		String selectQuery = "select * from customers;";
		String updateQuery = "update customers set CustomerName = 'Test' where CustomerName = 'Dragos'; ";
		
		
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));
		
		DBQuerys.dbUpdateQuery(conn, updateQuery);
		
		System.out.println(DBQuerys.dbSelectQuery(conn, selectQuery));

		
	}
	

}
