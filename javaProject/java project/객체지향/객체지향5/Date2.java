package °´Ã¼ÁöÇâ5;

public class Date2 {
	private int year;
	private int month;
	private int day;
	public Date2(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public void Print1() {
		System.out.println(getYear()+"."+getMonth()+"."+getDay());
	}
	public void Print2() {
		String month=null;
		do {
		switch(this.month) {
		case 1 :  month="January";	break;
		case 2 :  month="February";	break;
		case 3 :  month="March";	break;
		case 4 :  month="April";	break;
		case 5 :  month="May";		break;
		case 6 :  month="June";		break;
		case 7 :  month="July";		break;
		case 8 :  month="August";	break;
		case 9 :  month="September";break;
		case 10 :  month="October";	break;
		case 11 :  month="November";break;
		default :  month="December";break;
		}
		}while(this.month<1||this.month>12);
		System.out.println(month+"."+getDay()+"."+getYear());
	}
	@Override
	public String toString() {
		return "Date2 [year=" + year + ", month=" + month + ", day=" + day + "]";
	}
	
}
