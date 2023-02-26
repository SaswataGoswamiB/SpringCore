package Com.SpringCore.StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"Com/SpringCore/StereoType/SteroConfig.xml");

		// This bean name "student" is derived from the Student class.
		// If the name of the bean is Student,Spring will create the object named as
		// student(s is small)
		Student student = applicationContext.getBean("student", Student.class);
		
		System.out.println(student);

		College cgCollege = (College) applicationContext.getBean("college");
		
		System.out.println(cgCollege);
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println(student.getSubjectStrings());
		
		System.out.println(student.getSubjectStrings().getClass().getName());

	}
}
