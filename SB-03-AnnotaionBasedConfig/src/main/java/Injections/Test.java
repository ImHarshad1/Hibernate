package Injections;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student = (Student) app.getBean("student");
//		Student student = (Student) app.getBean(Student.class);  // this will also run
		student.display();
		
		FieldInjection f =(FieldInjection) app.getBean(FieldInjection.class);
		f.display();
		
//		SetterInjection s = app.getBean("SetterInjection");  //wrong bcoz we need do downcat this then this will run
		SetterInjection s = app.getBean(SetterInjection.class);
		s.display();

	}

}
