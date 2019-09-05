package Q20;

public class PersonTest {

	public static void main(String[] args) {
		Person[] men = {new Person("홍길동", 160),new Person("고길동", 180),new Person("구길동", 175)};
		Person maxPerson = getMaximum(men);
		System.out.println("가장 키 큰 사람 = "+maxPerson.name+" 키는 "+maxPerson.height);
	}
	private static Person getMaximum(Person[] array) {
		Person max = array[0];
		for(int i=0;i<array.length;i++) {
			int number=max.compareTo(array[i]);
			if(number==-1) {
				max=array[i];
			}
		}
		return max;
	}
}
