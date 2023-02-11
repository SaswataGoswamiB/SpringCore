package Com.SpringCore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Com.SpringCore.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Com/SpringCore/CiConfig.xml");

		// Person person=(Person) applicationContext.getBean("person");

		Person p = (Person) applicationContext.getBean("person");

		System.out.println(p);
	}

}
