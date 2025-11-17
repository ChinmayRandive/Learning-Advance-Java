package example.jdbc;

import java.util.Collection;

public class DataRetrievalMain2 {

	public static void main(String[] args) {
		DaoInterface<Student,Integer>daoRef = new StudentDao();
		Collection<Student>allStudents =daoRef.getAll();
//		allStudents.stream().forEach(str->System.out.println(str));
//		for(Student st: allStudents)
//			System.out.println(st);
		allStudents.stream().forEach(student -> System.out.println(student));
		System.out.println("=========================================");
		Student std =daoRef.getOne(103);
		if(std != null)
			System.out.println(std);
		else
			System.out.println("Student With Given Id Does Not Exist. ");

	}

}
