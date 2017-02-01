package comm.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {
	
	public static void main(String args[])
	{
		ApplicationContext context=new  ClassPathXmlApplicationContext("context.xml");
		HelloWorld hw=(HelloWorld)context.getBean("h");
		System.out.println(hw.getMessage().toString());
	}

}
