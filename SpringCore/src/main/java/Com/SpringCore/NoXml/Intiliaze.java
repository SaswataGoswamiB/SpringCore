package Com.SpringCore.NoXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Intiliaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext applicationContext=
				new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Me me=applicationContext.getBean("me",Me.class);
		
		System.out.println(me);
		}

}
