package ��ü����5;

public class CheckID {
	public static final String ID="qkrwogns";
	private String newid;
	public CheckID() {newid=null;}
	public CheckID(String newid) {this.newid=newid;}
	public String getNewid() {
		return newid;
	}
	public void setNewid(String newid) {
		this.newid = newid;
	}
	@Override
	public String toString() {
		return "CheckID [newid=" + newid + "]";
	}
	public void matchid () {
		if(newid.equals(ID)) {
				System.out.println("�� ���̵� ��ġ�մϴ�.");
		}else {
			System.out.println("�� ���̵� ��ġ���� �ʽ��ϴ�. �ۼ��� ���̵� : "+getNewid());
		}
	}
}
