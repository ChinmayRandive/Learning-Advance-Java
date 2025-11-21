package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.entity.Exam;
import example.entity.HibernateUtils;

public class DeleteExamMain {

	public static void main(String[] args) {
		// this class is used to fetch a single exam record based upon its ID and 
		//Delete the same.
		
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();	
				){
			
				//Class<Exam> examClassType = Exam.class;
				//Object examCode ="E04";
			Exam foundExam = sessionObj.find(Exam.class,"E02");
			if(foundExam!=null) {
				Transaction tx = sessionObj.beginTransaction();
				sessionObj.remove(foundExam);
				tx.commit();
					System.out.println("Exam Record Updated Successfully");
			}
			else
				System.out.println("Exam with Given Id not Exist.");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		}
	}


