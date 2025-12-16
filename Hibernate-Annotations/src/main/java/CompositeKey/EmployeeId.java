package CompositeKey;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeId implements Serializable  {

	private int phone;
	private String email;
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int i) {
		this.phone = i;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
