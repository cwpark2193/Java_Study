package Calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getClass());
		System.out.println("year "+cal.get(Calendar.YEAR));
		System.out.println("month "+(cal.get(Calendar.DAY_OF_MONTH)+1));
		System.out.println("day "+cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("hour "+cal.get(Calendar.HOUR));
		System.out.println("min "+cal.get(Calendar.MINUTE));
		System.out.println("sec "+cal.get(Calendar.SECOND));
	}

}