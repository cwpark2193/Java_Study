package chapter5.numberbox2;

public class NumberBox2 {
	//1.�������
	private int ivalue;
	private float fvalue;
	private double dvalue;
	private char cvalue;
	//2.�������Լ�
	public NumberBox2() {
		ivalue=0;
		fvalue=0.0f;
		dvalue=0.0;
		cvalue=0;
	}
	public NumberBox2(int ivalue,float fvalue,double dvalue) {
		this.ivalue=ivalue;
		this.fvalue=fvalue;
		this.dvalue=dvalue;
		cvalue=0;
		
	}
	public NumberBox2(int ivalue,float fvalue,double dvalue,char cvlaue) {
		this.ivalue=ivalue;
		this.fvalue=fvalue;
		this.dvalue=dvalue;
		this.cvalue=cvlaue;
		
	}
	//3.�ν��Ͻ� ����Լ� �����ε�
	public float calculate(int ivalue,float fvalue) {
		this.ivalue +=ivalue; this.fvalue += fvalue;
		return this.ivalue*this.fvalue;
	}
	public double calculate(int ivalue,float fvalue,double dvalue) {
		this.ivalue +=ivalue; this.fvalue += fvalue; this.dvalue+=dvalue;
		return this.ivalue+this.fvalue+this.dvalue;
	}
	//4. �ν��Ͻ� toString()�� �Ѵ�.
	@Override
	public String toString() {
		return "NumberBox2 [ivalue=" + ivalue + ", fvalue=" + fvalue + ", dvalue=" + dvalue + ", cvalue=" + cvalue
				+ "]";
	}
	
}
