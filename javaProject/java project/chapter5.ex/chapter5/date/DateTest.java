package chapter5.date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��ü����(�Ű����� 3��)
		Date dateToday = new Date(2020,3,20);
		//2.���
		dateToday.numberPrint();
		//3. ���� ��¥-2019.8.20
		dateToday.setYear(2019);
		dateToday.setMonth(8);
		dateToday.setDay(20);
		//4. ���
		dateToday.numberPrint();}

}
