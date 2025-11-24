package example.spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
//@Aspect // Marks this class as an aspect specific class.
public class Audience {

	// defining a pointcut Methos
	
	@Pointcut(" execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	
	
	@Before("myPointCut()")
	public void takeSeat() {
		System.out.println("Please take Seat");
		
	}
	@Before("myPointCut()")
	public void turnOffMobile() {
		System.out.println("Please Turn off Mobile");
		
	}
	@AfterReturning("myPointCut()")
	public void clap() {
		System.out.println("Clap  Clap Clap");
		
	}
	@AfterThrowing("myPointCut()")
	public void demandForRefund() {
		System.out.println("Please Give my Money Back");
		
	}
	@After("myPointCut()")
	public void leave() {
		System.out.println("By, Leaving Now.");
		
	}
}
