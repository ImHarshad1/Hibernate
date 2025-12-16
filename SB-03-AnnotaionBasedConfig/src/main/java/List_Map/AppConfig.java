package List_Map;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "List_Map")
public class AppConfig {
	
	@Bean
	public List<String> getSubjects(){
		return Arrays.asList("Java,SQL.Spring");
	}
	
	@Bean
	public Map<String, Double> getItems(){
		Map<String, Double> i = new LinkedHashMap<String, Double>();
		i.put("IPhone", 90000.0);
		i.put("Samsung", 80000.0);
		i.put("PS5" , 65000.0);
		return i;
	}
}
