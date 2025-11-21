package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Department;

import example.entity.HibernateUtils;

public class AddDepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// This class Add several Department into Depertment_Master Table
		
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				
				){
		
			Department d1 = new Department (11,"IT","Pune",null);
			Department d2 = new Department (12,"Finance","Mumbai",null);
			
			Transaction tx =sessionObj.beginTransaction();
			sessionObj.persist(d1);
			sessionObj.persist(d2);
			
			tx.commit();
			System.out.println("Department Added Successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

		
	}


