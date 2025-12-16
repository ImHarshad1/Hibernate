package Injections;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config.xml");
		
		FieldInjection f = (FieldInjection) app.getBean("fieldInjection");
		f.display();
		f.studey();
		
		ConstructorInjection c = (ConstructorInjection) app.getBean("constructorInjection");
		c.exams();
		c.display();
		
		SetterInjection s = (SetterInjection) app.getBean("setterInjection");
		s.play();
		s.display();
		
		RCB r = (RCB) app.getBean("RCB");
		r.play();
				
	}
}
