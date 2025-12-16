package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import java.util.List;

@Entity
public class College {
@Id
	private int cid;
	private String name;
	private String address;
	
	@OneToMany(mappedBy="college")
	private List<Student> student;
	
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getcid() {
		return cid;
	}
	public void setcid(int cid) {
		this.cid=cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
