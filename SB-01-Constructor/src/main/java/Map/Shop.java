package Map;

import java.util.Map;

public class Shop {
	private String name;
	private Map<String, Double> items;
	
	public void display() {
		System.out.println("Welcome to shop " + name);
		System.out.println("=========Items=======");
		for(Map.Entry<String, Double> i : items.entrySet()) {
			System.out.println(i.getKey() + "-->" +i.getValue());
		}
	}
	
	public Shop(String name, Map<String, Double> items) {
		super();
		this.name = name;
		this.items = items;
	}
}
