package Q14;

public class Pair<T> {
	private T data;
	private T data2;
	public Pair(T data, T data2) {
		super();
		this.data = data;
		this.data2 = data2;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public T getData2() {
		return data2;
	}
	public void setData2(T data2) {
		this.data2 = data2;
	}
	@Override
	public String toString() {
		return "Pair [data=" + data + ", data2=" + data2 + "]";
	}
}
