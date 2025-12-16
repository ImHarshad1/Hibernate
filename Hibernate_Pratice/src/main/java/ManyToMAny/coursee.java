package ManyToMAny;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class coursee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int cid;

private String title;

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

}
