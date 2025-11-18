package example.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataRetrievalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Program to retrieve data from DB using SELECT query and Display it.

// Step 1. Load The Driver
		String driverClass ="com.mysql.cj.jdbc.Driver"; 		// this are package name (JAR FILE(.jar) => Java Archive (Combination of several.class files))
																//Driver= Type 4 , Driver = Vender Specific (Database vender).
																// Class should be present in project class path.
		try {
			Class.forName(driverClass);
			System.out.println("Driver Loaded.");				// Written to check the driver is working or not.
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
// Step 2 . Establish Connection.
		
	String connectionUrl ="jdbc:mysql://localhost:3306/cdac?useSSL=false";  //URL= Uniform Resource Locator //?useSSL=false  => to remove error or exception
	String userId = "root";									   //1. Main Protocol= jdbc, 2. Sub protocol = mysql, 3. Ip Address = //localhost, 4. Port number= 3306, 5. Db Schema Name = cdac. 
	String password = "root";
	Connection dbConnection = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	// use a class DriverManager
	
	try {
		dbConnection =
		DriverManager.getConnection(connectionUrl,userId,password);
		System.out.println("Connected To DataBase");
		

// Step 3) Obtain some Statement
		
	stmt = dbConnection.createStatement();
	
//Step 4)
	
	String sqlQuery = "select student_name, student_city, student_id from students";
	rs = stmt.executeQuery(sqlQuery);  //rs = result state is a representation of the data fetched from DB table on java side (Client Side).
									   // It Holds the data in the form of rows and columns just like typical dataset table.
									  // Every row has a record position and every column has a column index.
										// Apart from this there are 2 additional position. 1)Before First. 2) After Last
										// By Default Cursor of the ResultSet State points to Before First.
										// in case of column, the index depends upon the sql query and not the actual DB Table Design.
										//In order to perform navigation on ResultSet, the interface  provides next() method
										// It checks whether next record is available or not and shifts the cursor to that record if it is available
										//It Returns A boolean Value
										
	
//Step 5) Perform Navigation on result State
	while (rs.next()) {  //it is call 
	String name = rs.getNString(1); // name
	String city = rs.getNString(2); // city to read string
	int id = rs .getInt(3); // Id  to read int
	System.out.println(id+ ","+name+","+city);
	}
	
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally {
		try {
			rs.close();
			stmt.close();
			dbConnection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

}
