package ManyToOneBi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int rid;
private String msg;

@ManyToOne
@JoinColumn(name="p_id")
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
