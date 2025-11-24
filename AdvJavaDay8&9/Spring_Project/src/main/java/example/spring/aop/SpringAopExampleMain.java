package example.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAopExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringAopCongig.class);
		Musician musicianObj =context.getBean(Musician.class);
		System.out.println("Class Name:" + musicianObj.getClass().getName());
		musicianObj.perform();
		System.out.println("=================================");
		Singer singerObj = context.getBean(Singer.class);
		singerObj.perform();
	}

}
