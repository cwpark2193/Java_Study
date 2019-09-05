package ReallyTest;

public class GetMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int INDEX = 10;
		int[] nubmers = new int [INDEX];
		int max=0;
		int min=0;
		numberRandom(nubmers);
		max=nubmers[0];
		min=nubmers[0];
		searchMaxValue(nubmers);
		searchMinValue(nubmers);
		System.out.println("최대값은 "+max+"이다.");
		System.out.println("최소값은 "+min+"이다.");
	}
	public static void numberRandom(int[] nubmers){
		for(int i=0;i<nubmers.length;i++) {
			nubmers[i]=(int)(Math.random()*(20-1+1)+1);
		}
		return;
	}
	public static int searchMaxValue(int[] nubmers){
		int max=0;
		for(int i=0;i<nubmers.length;i++) {
			if(max<nubmers[i]) {
				max=nubmers[i];
			}
		}
		return max;
	}
	public static int searchMinValue(int[] nubmers){
		int min=0;
		for(int i=0;i<nubmers.length;i++) {
			if(min>nubmers[i]) {
				min=nubmers[i];
			}
		}
		return min;
	}
}
