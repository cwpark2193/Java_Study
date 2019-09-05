package ��ü����5;

public class Movie {
	private String movieName;
	private float grade;
	private String directorName;
	private int movieYear;
	public Movie() {
		movieName=null;
		grade=0.0f;
		directorName=null;
		movieYear=0;
	}
	public Movie(String movieName, float grade, String directorName,int movieYaer) {
		this.movieName=movieName;
		this.grade=grade;
		this.directorName=directorName;
		this.movieYear=movieYaer;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	public String getDirectorName() {
		return directorName;
	}
	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	public int getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", grade=" + grade + ", directorName=" + directorName + ", movieYear="
				+ movieYear + "]";
	}
	
	public void printMovie() {
		System.out.println("�� ��ȭ�� �̸��� "+getMovieName()+"���� "+getMovieYear()+"�⵵�� ���������� ������ �̸��� "+getDirectorName()+"�̸� ������ "+getGrade()+"���Դϴ�.");
	}
}
