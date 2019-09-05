package chapter5.date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.객체생성(매개변수 3개)
		Date dateToday = new Date(2020,3,20);
		//2.출력
		dateToday.numberPrint();
		//3. 오늘 날짜-2019.8.20
		dateToday.setYear(2019);
		dateToday.setMonth(8);
		dateToday.setDay(20);
		//4. 출력
		dateToday.numberPrint();}

}
