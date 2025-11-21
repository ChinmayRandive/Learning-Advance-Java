package example.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.entity.Exam;
import example.entity.HibernateUtils;

public class FromClauseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//THis class loads all the records from exam master table and display
		try (
				SessionFactory factory = HibernateUtils.getSessionFactory();
				Session sessionObj = factory.openSession();
				
				){
		
					String hqlQuery ="from Exam ex";
					Query<Exam> queryRef =  sessionObj.createQuery(hqlQuery,Exam.class);
					List<Exam>examList=queryRef.getResultList();
//					for(Exam currentExam: examList)
//						System.out.println("currentExam");
					examList.stream().forEach(exam -> System.out.println(exam));//gives the output with fields
		}
		
		
		catch(Exception ex) {
			ex.printStackTrace();
		}
		}
	}

