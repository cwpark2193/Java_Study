package 객체지향6;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television t = new Television();
		//괄호가 없어서 초기값 자체를 받지를 못하며 문장이 완성되지 않음.
        t.setModel("STV-101");
        System.out.println(t.getModel());
        //클래스의 게터스가 먼저 오류이기도 하며 b에 저장할 필요없이 t.getModel();로도
        //바로 설정된다.
        //게터스는 읽기이나 출력은 아니므로 출력을 하고 싶다면 프린트를 쓴다.
	}

}
