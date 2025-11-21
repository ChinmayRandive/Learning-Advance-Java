package example.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;
import example.entity.Employee;
import example.entity.HibernateUtils;

public class LinkEmployeeToDepartmentsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this class loads all employee , department and links them
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				
				){
			// loading all the employee which are to be linked
			Employee emp1 = sessionObj.find(Employee.class, 101);
			Employee emp2 = sessionObj.find(Employee.class, 102);
			Employee emp3 = sessionObj.find(Employee.class, 103);
			Employee emp4 = sessionObj.find(Employee.class, 104);
			
			// Loading all the department which employee are  to be linked
			
			Department dept1 = sessionObj.find(Department.class, 11);
			Department dept2 = sessionObj.find(Department.class, 12);
	
			Transaction tx =sessionObj.beginTransaction();
				
			// populating a list of employee: emp1,emp2
			List<Employee>emplist=List.of(emp1,emp2);
			
			
			//Adding this list in the form of list to 1st DEPT
			dept1.setEmployeeList(emplist);
			
			
			//Adding employee one by one to the 2nd dept one by one
			dept2.addEmployee(emp3);
			dept2.addEmployee(emp4);
			tx.commit();
			
			System.out.println("Employee are linked to department successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	}


