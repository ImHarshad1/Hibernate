package OneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;

	private String title;

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
