package ManyToMAny;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class studentt {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sid;
private String name;

@ManyToMany(cascade = CascadeType.ALL)
private List<coursee> course;

public List<coursee> getCourse() {
	return course;
}
public void setCourse(List<coursee> course) {
	this.course = course;
}

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
