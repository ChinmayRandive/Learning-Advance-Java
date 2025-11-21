package example.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.entity.Exam;
import example.entity.HibernateUtils;

public class RetrieveExamMain {

	public static void main(String[] args) {
		// this class is used to fetch a single exam record based upon its ID
		
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();	
				){
			
			//Class<Exam> examClassType = Exam.class;
			//Object examCode ="E04";
		Exam foundExam = sessionObj.find(Exam.class,"E04");
			if(foundExam!=null)
					System.out.println(foundExam);
			else
				System.out.println("Exam with Given Id not Exist.");
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		}
	}


