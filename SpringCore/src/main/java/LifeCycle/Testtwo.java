package LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("LifeCycle/CiConfig.xml");
		
		Exam exam=(Exam)applicationContext.getBean("exame");

	}

}
 