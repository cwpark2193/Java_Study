package Q20;

import CompareToTest.Rectangle;
import chapter9.rectangle.Comparable;

public class Person implements Comparable {
	public String name;
	public double height;
	public Person(String name, double height) {
		super();
		this.name = name;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Object obj) {
		Person man = null;
		int returnValue = 0;
		if (obj instanceof Person) {
			man = (Person) obj;
			if (this.height > man.height) {
				returnValue = 1;
			} else if (this.height < man.height) {
				returnValue = -1;
			} else {
				returnValue = 0;
			}
		}
		return returnValue;
	}
}
