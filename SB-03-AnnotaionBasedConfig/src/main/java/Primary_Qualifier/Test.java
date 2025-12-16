package Primary_Qualifier;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ConfigurableApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);

		
		Theatre t =app.getBean(Theatre.class); 
		t.playMovie();
	}
}
