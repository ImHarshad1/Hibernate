package Bean;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "Bean")
public class AppConfig {
	
	@Bean		//Bean is used for Inbuilt classes
	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	
	@Bean	//if didn't use @Component for class then use @Bean to make it as bean class 
	public Address getAddress() {
		return new Address();
	}

}
