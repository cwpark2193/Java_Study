package °´Ã¼ÁöÇâ6;

public class Movie2 {
	private String moviename;
	private String directorname;
	private String companyname;
	
	public Movie2() {
		this(null,null,null);
	}
	public Movie2(String moviename) {
		this.moviename = moviename;
		this.directorname = null;
		this.companyname = null;
	}
	public Movie2(String moviename, String directorname) {
		this.moviename = moviename;
		this.directorname = directorname;
		this.companyname = null;
	}
	public Movie2(String moviename, String directorname, String companyname) {
		this.moviename = moviename;
		this.directorname = directorname;
		this.companyname = companyname;
	}
	
}
