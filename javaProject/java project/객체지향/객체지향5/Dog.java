package ��ü����5;

public class Dog {
	private String breed;
	private int age;
	private String color;
	public Dog() {
		breed=null;
		age=0;
		breed=null;
	}
	public Dog(String breed,int age,String color) {
		this.breed=breed;
		this.age=age;
		this.color=color;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}
	public void barking() {
		System.out.println(getAge()+"���� "+getColor()+" "+getBreed()+"���� ���� ¢�� �ֽ��ϴ�.");
	}
	public void hungry() {
		System.out.println(getAge()+"���� "+getColor()+" "+getBreed()+"���� ���� ������մϴ�.");
	}
	public void sleeping() {
		System.out.println(getAge()+"���� "+getColor()+" "+getBreed()+"���� ���� �ڰ� �ֽ��ϴ�.");
	}
	
}
