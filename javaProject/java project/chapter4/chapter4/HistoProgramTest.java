package chapter4;

public class HistoProgramTest {
	public static final int COUNT =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] countArray= new int[10];
		int randomNumber=0;
		//2. 1과 100사이의 정수 10개를 읽어야한다.(랜덤처리)
		//3. 1~10,11~20,...,91~100 범위에 드는 값들의 횟수를 저장하라.
		for(int i=0;i<COUNT;i++) {
			randomNumber=(int)(Math.random()*(100-1+1)+1);
			if(randomNumber%10==0){
				countArray[(int)(randomNumber/10)-1]++;				
			}else {				
				countArray[(int)(randomNumber/10)]++;
			}
		}
		//4. 출력한다.
		for(int i=0;i<countArray.length;i++) {
			System.out.printf("%d~%d = ",(i*10+1),((i+1)*10));
			for(int j=0;j<countArray[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
