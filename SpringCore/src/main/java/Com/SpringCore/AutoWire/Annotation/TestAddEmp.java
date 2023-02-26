package Com.SpringCore.AutoWire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAddEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("com/springcore/AutoWire/Annotation/AutoConfig.xml");
		
		 Employee employee= applicationContext.getBean("employee",Employee.class);
		 
		 System.out.println(employee); 
	}

}