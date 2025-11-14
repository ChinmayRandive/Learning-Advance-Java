package example.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class StudentDao implements DaoInterface<Student, Integer>{

	@Override
	public Collection<Student> getAll() {     
		/*This method retrieve all the record from Student table
		  Converts them into java objects of students class and return
		  all those objects in the form of collection
		 */
		
		// Declaring an empty collection meant for holding object of type: Student
		Collection<Student> allStudents = new ArrayList<>();
		
		
		String sqlQuery = "select student_name, student_city, student_id from students";
		
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				Statement stmt = dbConnection.createStatement();
				ResultSet rs = stmt.executeQuery(sqlQuery);
				) {
			while (rs.next()) {  //it is call 
				String name = rs.getString(1); // name
				String city = rs.getString(2); // city to read string
				int id = rs .getInt(3); // Id  to read int
			
				// creating an object of student class based upon ID, Name,City
				Student studentObj= new Student(id,name,city);
				// Adding the student object into students collection: allStudents
				allStudents.add(studentObj);
				}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		
		return allStudents;
	}

}
