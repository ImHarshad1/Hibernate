package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class userInfo {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int uid;
	
	private String name;
	
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getuid() {
		return uid;
	}
	public void setuid(int uid) {
		this.uid=uid;
	}
	
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
}
