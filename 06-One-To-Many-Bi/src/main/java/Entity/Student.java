package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Student {
@Id
	private int sid;
	private String name;
	private String std;
	
	@ManyToOne
	@JoinColumn(name="college_id")
	private College college;
	
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public int getsid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public String getstd() {
		return std;
	}
	public void setstd(String std) {
		this.std=std;
	}
	
}
