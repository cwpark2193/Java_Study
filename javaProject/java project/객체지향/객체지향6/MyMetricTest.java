package °´Ã¼ÁöÇâ6;

public class MyMetricTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMetric mychange = new MyMetric(1.0,1.0);
		System.out.println(mychange);
		mychange.mileToKilo();
		mychange.setKilometer(1.0);
		mychange.setMile(1.0);
		System.out.println(mychange);
		mychange.kiloToMile();
	}

}
