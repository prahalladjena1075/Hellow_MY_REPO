package type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long movieId;
	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public void setMovieId(Long id2) {
		// TODO Auto-generated method stub
		
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

    // Getters and Setters
}
