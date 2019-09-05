package 객체지향4;

public class Q18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cardClass = new String[] {"Clubs","Diamonds","Hearts","Spades"};
		String[] cardNumber = new String[] {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
		for(int i=0;i<=5;i++) {
		String cardsClass = cardClass[(int)(Math.random()*4)];
		String cardsNumber = cardNumber[(int)(Math.random()*13)];
		System.out.println(cardsClass+" 의 "+cardsNumber);
		}
	}
}
