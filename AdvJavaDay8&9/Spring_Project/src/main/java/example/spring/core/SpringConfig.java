package example.spring.core;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // marks this class as configuration
public class SpringConfig {
	// This class is meant for declaring beans or configuring beans 

	
	// Defining the bean of type WelcomeService
	//return type:GreetingService 
	@Bean   // marks this method as Beans Declaration Method
	public GreetingService doWelcome() {
		GreetingService ws = new WelcomeService() ;
		return ws;
		
	}
		@Bean("helloBean")   // overriding the default ID and making it as helloBean
		public GreetingService doHello() {
			GreetingService ws = new HelloService() ;
			return ws;
	}
}
