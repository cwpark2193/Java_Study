package Q18;

import java.util.HashSet;

public class Q18 {
	private int lottoNumber;
	public HashSet<Integer> number = new HashSet<Integer>();

	public Q18() {
		super();
		this.lottoNumber = lottoNumber;
		this.number = number;
	}

	public void checkNumber() {
		for (int i = 0; i < 6; i++) {
			do {
				lottoNumber = (int) (Math.random()*44+1);
			} while (number.contains(lottoNumber));
			number.add(lottoNumber);
		}
	}
	@Override
	public String toString() {
		return "Lotto " + number;
	}

}
