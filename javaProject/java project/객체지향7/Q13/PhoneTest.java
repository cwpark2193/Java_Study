package Q13;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone mysmartphone = new SmartPhone();
		System.out.println(mysmartphone);
		mysmartphone.setManufacturer("LG");
		mysmartphone.setPrice(760_000);
		mysmartphone.setMobileservice("LTE");
		mysmartphone.setMobileOperatingSystem("안드로이드");
		mysmartphone.setMobileVirsion(9.0);
		mysmartphone.setHddsize(32);
		mysmartphone.setCameraonoff(true);
		mysmartphone.setBluetooth(true);
		System.out.println(mysmartphone);
		System.out.println("내 폰은 "+mysmartphone.getManufacturer()+"사의 스마트폰으로 가격은 "+mysmartphone.getPrice()+"만원이며 "+mysmartphone.getMobileservice()+"이다.");
		System.out.println("운영체제는 "+mysmartphone.getMobileOperatingSystem()+"의 "+mysmartphone.getMobileVirsion()+" 버전이며 "+mysmartphone.getHddsize()+"기가의 용량이다.");
		System.out.println(mysmartphone.isCameraonoff());
		System.out.println(mysmartphone.isBluetooth());
	}

}
