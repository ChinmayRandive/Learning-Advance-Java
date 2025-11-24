package config;

import org.springframework.stereotype.Component;

@Component // Marks this class as component 
//			so that spring can manage this
public class ManagedComponent {

	public void doManage() {
		System.out.println("Managing The Component");
	}
	
	
}
