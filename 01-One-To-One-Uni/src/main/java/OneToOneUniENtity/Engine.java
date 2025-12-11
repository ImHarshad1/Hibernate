package OneToOneUniENtity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Engine {
	@Id
	private int eid;
	private double cc;
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setcc(double cc) {
		this.cc=cc;
	}
	public double getcc() {
		return cc;
	}
}
