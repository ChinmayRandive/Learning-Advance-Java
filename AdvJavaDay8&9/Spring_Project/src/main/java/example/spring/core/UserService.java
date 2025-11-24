package example.spring.core;

public class UserService implements GreetingService {
public String name;
public int age;

public UserService()
{
	
}

	public UserService(String name, int age) {
		super();
		System.out.println("inside UserService (String,Int)");
		this.name = name;
		this.age = age;
	}


	public UserService(int age,String name) {
		System.out.println("inside UserService (Int,String)");
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public String sayGreeting() {
		String greeting ="Hi " + name + ", your age is " + age;
		return greeting;
	
	}
	
}
