package Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
@Column(name = "Product_Name")
	private String name;

@OneToMany(mappedBy = "product")
	private List<Review> rev;

public int getPid() {
	return pid;
}

public void setPid(int pid) {
	this.pid = pid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public List<Review> getRev() {
	return rev;
}

public void setRev(List<Review> rev) {
	this.rev = rev;
}	
}
