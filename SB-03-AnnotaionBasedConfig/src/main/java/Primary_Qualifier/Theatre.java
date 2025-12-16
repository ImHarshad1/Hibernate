package Primary_Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Theatre {
	
	
	private String name;
	
	private String address;
	
//	@Autowired
//	@Qualifier(value = "chaava")
	private Movie movie;

	public void setMovie(Movie movie) {
		this.movie=movie;
	}
	
	public Theatre(@Value(value = "INOX") String name,@Value(value = "THANE") String address,@Autowired @Qualifier(value = "chaava") Movie movie) {
		super();
		this.name = name;
		this.address = address;
		this.movie = movie;
	}

	public void playMovie() {
		System.out.println("In theatre " + name + ", a movie with story given below" + " is playing at " + address);
		movie.story();
	}
}