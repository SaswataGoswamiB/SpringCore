package Com.SpringCore.Expl;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Codeone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpelExpressionParser temParser=new SpelExpressionParser();
		
		Expression expression=(Expression) temParser.parseExpression("22+44");
		
		try {
			System.out.println((Integer)expression.getValue());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		ApplicationContext applicationContext=
				new ClassPathXmlApplicationContext("Com/SpringCore/Expl/ExplConfig.xml");
		
		 Demo d1=applicationContext.getBean("demo",Demo.class);
		 
		 System.out.println(d1);
		
		
	
	}

}
