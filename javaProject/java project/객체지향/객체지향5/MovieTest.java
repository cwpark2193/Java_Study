package ��ü����5;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie thisMovie = new Movie();
		System.out.println(thisMovie);
		
		thisMovie.setMovieName("��������");
		thisMovie.setMovieYear(2013);
		thisMovie.setDirectorName("����ȣ");
		thisMovie.setGrade(84);
		
		System.out.println(thisMovie);
		thisMovie.printMovie();
	}

}

