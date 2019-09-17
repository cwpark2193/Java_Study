package chapter17.object_stream;

import java.io.*;

public class ObjectStreamTest {

	public static void main(String[] args) throws Exception {
		File file = new File("object.dat");
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student student = new Student(10, "name");
		oos.writeObject(student);
		if(oos!=null) {
			oos.close();
		}
		System.out.println("����Ǿ����ϴ�.");
		//��ü������ �����´�.
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student student1 = (Student)ois.readObject();
		System.out.println(student);
	}

}
