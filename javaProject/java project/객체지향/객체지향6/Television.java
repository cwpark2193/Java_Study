package 객체지향6;

public class Television {
	 private String model;
	 //1. 생성자 코드가 없음. 디폴트로 생성됨
     void setModel(String b) {  // 설정자 
    	 //퍼블릭 접근자 없음. 디폴트화
           model = b;
     }
     String getModel() {		// 접근자
    	 //접근자가 없음. 게터스 세터스 사용시 public 접근자 필요.
    	 //2. 게터스 사용시 세터스처럼 void가 아닌 해당 자료형에 걸맞는 타입 선언 필요.
    	 //.여기서는 String,문자열이므로 String 필요.
           return model;
           //일단 보이드 선언으로서 리턴값을 받지 못한다.
     }
}
