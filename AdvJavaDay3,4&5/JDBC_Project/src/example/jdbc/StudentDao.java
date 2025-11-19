package example.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
				ResultSet rs = stmt.executeQuery(sqlQuery); //executeQuery= used too fire the query 
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
	@Override
	public Student getOne (Integer studentId) {
		// This method accepts an integer value indicating student id
		// and return the student object matching with that id
		// if the id is non-Existing, it returns null.
		Student foundStudent = null;
		String sqlQuery= "select student_name,student_city, student_id from students where student_id=?";
		
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
// Substituting studentId in place of '?'
			pstmt.setInt(1, studentId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				String name = rs.getString(1); // name
				String city = rs.getString(2); // city to read string
				int id = rs .getInt(3); // Id  to read int
			foundStudent = new Student (id,name,city);
				
			}
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return foundStudent;
	}
	@Override
	public void create(Student studentObj ){
		// TODO Auto-generated method stub
		//this method accepts student object and stores it as a record into student table
		
		String sqlQuery = "insert into students value (?,?,?)";
		try(
				Connection dbConnection = JdbcUtils.getConnection();
				PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
				){
		// Fetching the value from Student object
			int id = studentObj.getStudentId();
			String name = studentObj.getName();
			String city = studentObj.getCity();
			
			
		//Substituting these value in place of '?'
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, city);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "record Inserted");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	@Override
	public void update(Student modifiedStudentObj) {
		// This method receive modified state of student object 
		// and reflects that state back to DB to complete  the update operation
		 String sqlQuery = "update students set student_name =?, student_city =? where student_id =?";
		 
		 try(
					Connection dbConnection = JdbcUtils.getConnection();
					PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
					){
			// Fetching the value from Student object
				int id = modifiedStudentObj.getStudentId();
				String name = modifiedStudentObj.getName();
				String city = modifiedStudentObj.getCity();
				
				
			//Substituting these value in place of '?'
				pstmt.setInt(3, id);
				pstmt.setString(1, name);
				pstmt.setString(2, city);
				
				int count = pstmt.executeUpdate();
				System.out.println(count +"recore update");
		 }
		 catch(Exception ex) {
				ex.printStackTrace();
			}
	}
	@Override
	public void deleteOne(Integer studentId) {
		// This Method accepts id of student and deletes relevant record from the DB tables
		String sqlQuery = "delete from students where student_id =?";
		
		 try(
					Connection dbConnection = JdbcUtils.getConnection();
					PreparedStatement pstmt = dbConnection.prepareStatement(sqlQuery);
					){
			 
		 pstmt.setInt(1, studentId);
		 int count =pstmt.executeUpdate();
		 if (count != 0)
			 System.out.println(count + "record delete");
		 
		 else 
			 System.out.println("Student with Given Id Does Not Exist. ");
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
	
	}
}
 

//Performing DML Operation:
//in case of select Query the returned data is stored in the 
//form of result state and object of type result state is obtained using a method executeQuery(). 
// in case of DML Operation Insert, Update & Delete Result Set is not Required. 
//Therefore to make a call toward DB, executeUpdate() Method is used.

// The method returns int That indicated the number of records affected due to that Query.

