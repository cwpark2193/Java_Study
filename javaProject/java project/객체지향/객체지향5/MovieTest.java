package 객체지향5;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie thisMovie = new Movie();
		System.out.println(thisMovie);
		
		thisMovie.setMovieName("설국열차");
		thisMovie.setMovieYear(2013);
		thisMovie.setDirectorName("봉준호");
		thisMovie.setGrade(84);
		
		System.out.println(thisMovie);
		thisMovie.printMovie();
	}

}

