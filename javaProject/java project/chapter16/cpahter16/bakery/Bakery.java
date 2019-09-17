package cpahter16.bakery;

public class Bakery {
	private String bread;
	private boolean isBread;

	public Bakery() {
		super();
		this.bread = null;
		this.isBread = false;
	}

	// ¼ÒºñÀÚ
	public synchronized String getBread() {
		while (!isBread) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		isBread = false;
		notifyAll();
		return bread;
	}

	public synchronized void setBread(String bread) {
		while (isBread) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		isBread = true;
		this.bread = bread;
		notifyAll();
	}

}
