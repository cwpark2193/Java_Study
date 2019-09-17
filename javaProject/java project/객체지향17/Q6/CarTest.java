package Q6;

import java.io.*;
import java.io.Serializable;

import chapter17.object_stream.Student;

class Car implements Serializable {
	private String name;
	private String carNumber;
	private String carType;

	public Car(String name, String carNumber, String carType) {
		super();
		this.name = name;
		this.carNumber = carNumber;
		this.carType = carType;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", carNumber=" + carNumber + ", carType=" + carType + "]";
	}

}

public class CarTest {

	public static void main(String[] args) throws Exception {
		File file = new File("object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Car myCar = new Car("박재훈", "0123-65478", "레인지로버");
		oos.writeObject(myCar);
		if (oos != null) {
			oos.close();
		}
		System.out.println("완료되었습니다.");
		// 객체파일을 가져온다.
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Car myCar1 = (Car) ois.readObject();
		System.out.println(myCar);
	}
}


