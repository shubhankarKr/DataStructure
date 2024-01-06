package movie;

class Movie {
	private int ticketNo;
	private int rating;
	private String Name;

	public Movie(int ticketNo, int rating, String name) {
		super();
		this.ticketNo = ticketNo;
		this.rating = rating;
		Name = name;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Movie) {
			Movie m = (Movie) obj;
			boolean result = this.hashCode() == m.hashCode();
			return result;
		}
		return false;
	}

	@Override
	public int hashCode() {
		if (ticketNo == 1 && rating == 1) {
			return 1;
		}
		return this.Name.hashCode();
	}
}

public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie(1, 2, "Movie");
		Movie m2 = new Movie(1, 1, "Movie");

		System.err.println(m1.equals(m2));
	}

}