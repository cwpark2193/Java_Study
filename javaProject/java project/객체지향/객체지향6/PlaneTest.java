package °´Ã¼ÁöÇâ6;

public class PlaneTest {

	public static void main(String[] args) {
		Plane future1 = new Plane();
		Plane future2 = new Plane("FCDEI",null,0);
		Plane future3 = new Plane("FCDEI","A1234");
		Plane future4 = new Plane("FCDEI","A5678",300);
		System.out.println(future1);
		System.out.println(future2);
		System.out.println(future3);
		System.out.println(future4);
		System.out.println(future4.getPlanes());
	}

}
