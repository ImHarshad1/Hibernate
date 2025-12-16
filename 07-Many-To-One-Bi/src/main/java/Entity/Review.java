package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rid;
@Column(name="review")
	private String msg;

@ManyToOne
@JoinColumn(name = "P_id")
	private Product product;

public int getRid() {
	return rid;
}

public void setRid(int rid) {
	this.rid = rid;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public Product getProduct() {
	return product;
}

public void setProduct(Product product) {
	this.product = product;
}


}
