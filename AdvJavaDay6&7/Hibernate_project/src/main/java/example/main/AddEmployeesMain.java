package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Employee;
import example.entity.HibernateUtils;

public class AddEmployeesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
// This class Add several employee into Employee_Master Table
		
		
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				
				){
			
			Employee e1 =new Employee(101,"Naveen",20000);
			Employee e2 =new Employee(102,"Rakesh",15000);
			Employee e3 =new Employee(103,"Reena",25000);
			Employee e4 =new Employee(104,"Neha",18000);
			
			Transaction tx =sessionObj.beginTransaction();
				sessionObj.persist(e1);
				sessionObj.persist(e2);
				sessionObj.persist(e3);
				sessionObj.persist(e4);
				tx.commit();
				System.out.println("Employee Added Successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
