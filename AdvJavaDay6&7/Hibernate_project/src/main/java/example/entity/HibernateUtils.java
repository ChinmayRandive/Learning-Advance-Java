package example.entity;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;          // ✅ CORRECT

public class HibernateUtils {

	// This class handles programmatic configuration and returns SessionFactory
	
	public static SessionFactory getSessionFactory() throws Exception{
		
		Configuration cfg = new Configuration();
		
		// Adding configuration specific properties
		
		cfg.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		cfg.setProperty("hibernate.connection.url","jdbc:mysql://localhost:3306/cdac");
		cfg.setProperty("hibernate.connection.username","root");
		cfg.setProperty("hibernate.connection.password","root");
		cfg.setProperty("hibernate.show_sql","true");
		cfg.setProperty("hibernate.hbm2ddl.auto","update");
		
		// Adding the entity class to the configuration
		cfg.addAnnotatedClass(Exam.class);
		cfg.addAnnotatedClass(Department.class);
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		return factory;
		
	}
}
