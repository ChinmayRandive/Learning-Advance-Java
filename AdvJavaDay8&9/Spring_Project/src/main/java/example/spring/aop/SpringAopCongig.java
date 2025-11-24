package example.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy  // Enables Proxy Generation Support.
public class SpringAopCongig {

	//@Bean declaration if any
}
