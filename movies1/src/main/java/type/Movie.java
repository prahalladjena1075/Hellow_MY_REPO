package type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private int seatsAvailable;
	public int getSeatsAvailable() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setSeatsAvailable(int i) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters
}
