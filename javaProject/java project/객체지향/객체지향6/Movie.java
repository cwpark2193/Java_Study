package ��ü����6;

public class Movie {
	private String title;
	private String director;
	private String actor;
	public Movie() {
		this.title=null;
		this.director=null;
		this.actor=null;
	}
	public Movie(String title,String director,String actor) {
		this.title=title;
		this.director=director;
		this.actor=actor;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public void printMovie() {
		System.out.println("�� ��ȭ "+getTitle()+"�� ������ "+getDirector()+"�̰� ���� "+getActor()+"�� ���ɴϴ�.");
	}
}
