package page;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {

	public static String getData(String columnName) throws ClassNotFoundException, SQLException {
		// Setting MySQL properties
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sqlUrl = "jdbc:mysql://localhost:3306/OCTOBER2020";
		String userName = "root";
		String password = "root";
		String query = "select * from users";
		//creating connection to local DB
		Connection conn = DriverManager.getConnection(sqlUrl, userName, password);
		//empowering the conn ref. variable to execute queries
		Statement smt = conn.createStatement();
		//executing the query
		ResultSet rs = smt.executeQuery(query);
		while(rs.next()){
			return rs.getString(columnName);
		}
		return columnName;

	}
}
