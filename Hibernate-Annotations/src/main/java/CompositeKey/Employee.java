package CompositeKey;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Employee {
	@EmbeddedId
	private EmployeeId eid;
	
	private String name;

	public EmployeeId getEid() {
		return eid;
	}

	public void setEid(EmployeeId eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
