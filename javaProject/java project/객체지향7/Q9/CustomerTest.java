package Q9;

public class CustomerTest {

	public static void main(String[] args) {
		Person someone = new Person("박재훈","서울시 동작구","010-2947-1257");
		Customer someother = new Customer("박재훈","서울시 동작구","010-2947-1257",12,1969.56);
		System.out.println(someone);
		System.out.println(someother);
	}
}
