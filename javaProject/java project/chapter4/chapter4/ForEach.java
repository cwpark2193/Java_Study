package chapter4;

public class ForEach {
	//1. �������
	private int[] numbers;
	//2. �������Լ�
	public ForEach() {
		this.numbers = new int[] {10,20,30};
	}
	public ForEach(int[]numbers) {
		this.numbers = numbers;
	}
	//3. ����Լ�
	public void generalFor() {
		for(int i=0;i<numbers.length;i++) {
			System.out.print("\t"+numbers[i]);
		}
	}
	public void improveFor() {
		for(int value : numbers) {
			System.out.print("\t"+value);
		}
	}
	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	
}
