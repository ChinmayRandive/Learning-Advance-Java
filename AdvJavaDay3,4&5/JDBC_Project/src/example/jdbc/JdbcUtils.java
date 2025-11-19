package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {

	public static Connection getConnection() throws SQLException {
		
		// This method is use to establish the connection with DB and return the same value		
		String connectionUrl ="jdbc:mysql://localhost:3306/cdac?useSSL=false";  //URL= Uniform Resource Locator //?useSSL=false  => to remove error or exception
		String userId = "root";									   //1. Main Protocol= jdbc, 2. Sub protocol = mysql, 3. Ip Address = //localhost, 4. Port number= 3306, 5. Db Schema Name = cdac. 
		String password = "root";
		Connection dbConnection =
				DriverManager.getConnection(connectionUrl,userId,password);
		return dbConnection;
	}
}

//Standard Practices in JDBC:
//1. Decoupling (Separating) the code for establishing DB Connection.
//2. Auto-loading of Driver Class.
//3. Auto-closing of resources e.g. Connection, Statement, ResultSet.
//Implementing DAO Pattern(Data access Object).