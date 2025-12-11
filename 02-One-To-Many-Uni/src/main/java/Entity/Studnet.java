package Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Studnet {
@Id
	private int sid;
	private String name;
	private String std;
	
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
