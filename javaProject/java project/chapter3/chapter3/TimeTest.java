package chapter3;

import java.time.LocalDateTime;
import java.time.Month;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime=LocalDateTime.now();
		int year=localDateTime.getYear();//년
		Month month=localDateTime.getMonth();//달
		int day=localDateTime.getDayOfMonth();//날
		int Hour=localDateTime.getHour();//시간
		int minute=localDateTime.getMinute();//분
		int second=localDateTime.getSecond();//초
	}

}
