package chapter4;

public class HistoProgramTest {
	public static final int COUNT =10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] countArray= new int[10];
		int randomNumber=0;
		//2. 1�� 100������ ���� 10���� �о���Ѵ�.(����ó��)
		//3. 1~10,11~20,...,91~100 ������ ��� ������ Ƚ���� �����϶�.
		for(int i=0;i<COUNT;i++) {
			randomNumber=(int)(Math.random()*(100-1+1)+1);
			if(randomNumber%10==0){
				countArray[(int)(randomNumber/10)-1]++;				
			}else {				
				countArray[(int)(randomNumber/10)]++;
			}
		}
		//4. ����Ѵ�.
		for(int i=0;i<countArray.length;i++) {
			System.out.printf("%d~%d = ",(i*10+1),((i+1)*10));
			for(int j=0;j<countArray[i];j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}