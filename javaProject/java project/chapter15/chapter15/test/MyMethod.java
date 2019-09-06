package chapter15.test;

public class MyMethod {
	public static <T extends Comparable> T getMax(T[] e) {
		if (e == null || e.length == 0) {
			return null;
		}
		T largest = e[0];
		for (int i = 0; i < e.length; i++) {
			if (largest.compareTo(e[i]) < 0) {
				largest = e[i];
			}
		}
		return largest;
	}
}