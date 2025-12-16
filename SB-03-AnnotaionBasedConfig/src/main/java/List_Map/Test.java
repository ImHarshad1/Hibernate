package List_Map;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("===========List=============");
		Student std = app.getBean(Student.class);
		std.display();
		
		
		System.out.println("===========Map=============");
		Shop s = app.getBean(Shop.class);
		s.display();
		
	}

}
