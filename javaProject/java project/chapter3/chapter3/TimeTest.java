package chapter3;

import java.time.LocalDateTime;
import java.time.Month;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime=LocalDateTime.now();
		int year=localDateTime.getYear();//��
		Month month=localDateTime.getMonth();//��
		int day=localDateTime.getDayOfMonth();//��
		int Hour=localDateTime.getHour();//�ð�
		int minute=localDateTime.getMinute();//��
		int second=localDateTime.getSecond();//��
	}

}
