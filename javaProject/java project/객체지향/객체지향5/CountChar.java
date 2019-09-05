package 객체지향5;

public class CountChar {
	private String countline;
	private int count1;
	private int count2;
	public CountChar() {
		countline=null;
		count1=0;
		count2=0;
	}
	public CountChar(String countline,int count1,int count2) {
		this.countline=countline;
		this.count1=count1;
		this.count2=count2;
	}
	public String getCountline() {
		return countline;
	}
	public void setCountline(String countline) {
		this.countline = countline;
	}
	public int getCount1() {
		return count1;
	}
	public void setCount1(int count1) {
		this.count1 = count1;
	}
	public int getCount2() {
		return count2;
	}
	public void setCount2(int count2) {
		this.count2 = count2;
	}
	@Override
	public String toString() {
		return "CountChar [countline=" + countline + ", count1=" + count1 + ", count2=" + count2 + "]";
	}
	public void countChar() {
		for(int i=0;i<countline.length();i++) {
			switch(countline.charAt(i)) {
			case 'a' : case 'e' : case 'i' : case 'o' : case 'u' : count1++; break;
			default : count2++; break;
			}
		}
	}
	public void printcount() {
		System.out.println(getCountline()+"의 모음의 개수는 "+getCount1()+"이고 자음의 개수는 "+getCount2()+"이다.");
	}
}
