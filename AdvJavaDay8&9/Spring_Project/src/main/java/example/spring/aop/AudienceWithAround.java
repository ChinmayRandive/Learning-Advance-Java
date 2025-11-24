package example.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect // Marks this class as an aspect specific class.
public class AudienceWithAround {

	// defining a pointcut Methos
	@Pointcut(" execution(* example.spring.aop.*.perform(..))")
	private void myPointCut() {}
	
	

	private void takeSeats() {
		System.out.println("Please take Seat.[Around]");
	}

	public void turnOffMobile() {
		System.out.println("Please Turn off Mobile.[Around]");
		
	}
	
	private void clap() {
		System.out.println("Clap  Clap Clap.[Around]");
		
	}
	
	private void demandForRefund() {
		System.out.println("Please Give my Money Back.[Around]");
		
	}

	private void leave() {
		System.out.println("By, Leaving Now.[Around]");
		
	
	
	}
	@Around("myPointCut()")
	public void monitorPerformance(ProceedingJoinPoint joinPoint) {
		
		try {
			takeSeats()	;
			turnOffMobile();
			joinPoint.proceed();
			 clap() ;
		
			
		} catch (Throwable e) {
			// TODO: handle exception
			 demandForRefund();
		}
		
	
		 leave() ;
		
		}
}
