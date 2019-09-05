package 객체지향5;

public class DogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog newDog = new Dog("요크셔테리어",7,"검은색");
		System.out.println(newDog.toString());
		newDog.barking();
		newDog.hungry();
		newDog.sleeping();
	}
}
