package example.jdbc;

public class DataUpdationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DaoInterface<Student, Integer>daoRef = new StudentDao();
		Student foundStudent = daoRef.getOne(104);
		if(foundStudent != null) {
			foundStudent.setName("Chinmay Randive");
			foundStudent.setCity("Nagpur");
			daoRef.update(foundStudent);
			
		}
		else System.out.println("Student with given id does not exist.");
	}

}
