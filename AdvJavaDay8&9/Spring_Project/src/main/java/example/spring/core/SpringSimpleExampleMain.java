package example.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// This class loads a bean from Spring's configuration unit and perform operation using that bean
		
		// where to find a bean 
		String configFilePath ="./src/main/resources/spring-config.xml";
		
		// predefined
		ApplicationContext context = new FileSystemXmlApplicationContext(configFilePath);
		Object obj = context.getBean("myBean");
		GreetingService gs =(GreetingService)obj;
		String reply = gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println("=========================================");
		obj = context.getBean("userBean");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		
		System.out.println("=========================================");
		obj = context.getBean("userBean2");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
		System.out.println("=========================================");
		obj = context.getBean("userBean3");
		gs = (GreetingService)obj;
		reply = gs.sayGreeting();
		System.out.println(reply);
		
	}

}
