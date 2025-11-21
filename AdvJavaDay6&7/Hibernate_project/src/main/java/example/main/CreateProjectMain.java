package example.main;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.entity.Project;

public class CreateProjectMain {

	public static void main(String[] args) {
		// Configure Hibernate
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure();
		
		// obtain SessionFactory
		SessionFactory factory =null;
		Session sessionObj = null;
		
		try {
			// obtain session factory
		factory=cfg.buildSessionFactory();
			//obtain session
		sessionObj = factory.openSession();
		
		// Instantiate Entity Class (Create an object of entity class)
//		Project myProject = new Project(101,"Banking System","Java",15);
//		Project myProject = new Project(102,"Hotel Booking","Python",25);
		Project myProject = new Project(103,"Railway Booking","Dot Net",35);
		// Obtain transaction and start the same
		
		Transaction tx =sessionObj.beginTransaction();
		
		// Store  data into Database
		
		sessionObj.persist(myProject);// stores the record // Dml insert 
		
		// Commit Transaction to  save changes
		tx.commit();
		
		// Close the session
		sessionObj.close();
		
		//Close the session factory
		
		factory.close();
		System.out.println("Prroject Created Successfully");
		
		
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
