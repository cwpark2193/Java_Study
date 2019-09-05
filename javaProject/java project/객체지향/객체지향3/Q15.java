package 객체지향3;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 키와 체중입력
		Scanner input = new Scanner(System.in);
		System.out.println("당신의 키를 입력하세요. ");
		double height=input.nextDouble();
		System.out.println("당신의 체중을 입력하세요. ");
		double weight=input.nextDouble();		
		//2. 표준 체중 계산
		double standardWeight=(height-100)*0.9;
		//3. 체중 비교
		double max=(standardWeight+1.0);
		double min=(standardWeight-1.0);		
		if(weight>max) {
			System.out.println("당신의 키"+height+"cm에 해당되는 표준 체중은 "+standardWeight+"입니다. 오차는 1kg내외입니다.");
			System.out.println("당신의 체중은"+weight+"kg으로 표준체중"+standardWeight+"을 "+(weight-max)+"kg만큼 넘는 과체중입니다.");
		}
		if(weight<min) {
			System.out.println("당신의 키"+height+"cm에 해당되는 표준 체중은 "+standardWeight+"입니다. 오차는 1kg내외입니다.");
			System.out.println("당신의 체중은"+weight+"kg으로 표준체중"+standardWeight+"보다 "+(min-weight)+"kg만큼 부족한 저체중입니다.");
		}
		if(weight>min&& weight<max) {
			System.out.println("당신의 키"+height+"cm에 해당되는 표준 체중은 "+standardWeight+"입니다. 오차는 1kg내외입니다.");
			System.out.println("당신의 체중은"+weight+"kg으로 표준체중"+standardWeight+"에 해당됩니다.");
		}
	}

}
