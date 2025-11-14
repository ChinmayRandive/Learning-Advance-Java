package example.jdbc;

import java.util.Collection;

public class DataRetrievalMain2 {

	public static void main(String[] args) {
		DaoInterface<Student,Integer>daoRef = new StudentDao();
		Collection<Student>allStudents =daoRef.getAll();
//		allStudents.stream().forEach(str->System.out.println(str));
		for(Student st: allStudents)
			System.out.println(st);

	}

}
