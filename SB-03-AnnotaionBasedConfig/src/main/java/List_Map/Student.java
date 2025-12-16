package List_Map;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value(value = "Dhoni")
	private String name;
	
	@Autowired
	private List<String> subjects;
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Subjects : " + subjects);
	}
}
