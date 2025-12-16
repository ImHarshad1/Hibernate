package Obj;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new ClassPathXmlApplicationContext("config-obj.xml");
		
		Car c = (Car) app.getBean("myCar");
		c.display();

	}
}
