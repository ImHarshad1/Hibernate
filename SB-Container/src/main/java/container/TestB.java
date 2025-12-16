package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestB {

	public static void main(String[] args) {
		
		ApplicationContext app = new ClassPathXmlApplicationContext("config-a.xml");
		
		Student std = (Student) app.getBean("student");
		std.play();
		
		System.out.println("=============Test B==============");
		
		Mobile mb = (Mobile) app.getBean("myMobile");
		mb.song();
		
	}

}
