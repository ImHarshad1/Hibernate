package List_Map;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Shop {

	

	@Value(value = "Chennai Super Kings")
	private String name;
	
	@Autowired
	private Map<String, Double> items;
	
	public void display() {
		System.out.println("Welcome to Shop " + name);
		System.out.println("=========Items=======");
		
		for(Map.Entry<String, Double> i:items.entrySet()) {
			System.out.println(i.getKey() + " ==> " + i.getValue());
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, Double> getItems() {
		return items;
	}

	public void setItems(Map<String, Double> items) {
		this.items = items;
	}
}
