package example.main;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import example.entity.Exam;
import org.hibernate.Session;  
import example.entity.HibernateUtils;


public class CreateExamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				
				){
			
			//Exam examObj = new Exam("E01","Core Java","Thheory",60);
		//	Exam examObj = new Exam("E02","Core Java","Practical",10);
		//	Exam examObj = new Exam("E03","Dot Net","Practical",80);
			Exam examObj = new Exam("E04","Wpt","Practical",50);
			Transaction tx = sessionObj.beginTransaction();
			sessionObj.persist(examObj);
			tx.commit();
			System.out.println("Exam created Successfully");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		

	}

}
