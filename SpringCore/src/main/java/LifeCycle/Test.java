package LifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ApplicationContext applicationContext=new
		// ClassPathXmlApplicationContext("LifeCycle/CiConfig.xml");
		
		//AbstractApplication Context is ued in place of ApplicationContext
		//because ApplicationContext doesnt have regsitershutdownhook method.
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("LifeCycle/CiConfig.xml");
		Samosa samosa = (Samosa) applicationContext.getBean("s1");
		System.out.println(samosa);
		//regsiter shut down hook method is used to destry the bean 
		//as a result of which destroy() method is called.
		applicationContext.registerShutdownHook();

	}

}
