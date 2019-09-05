package 객체지향5;

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
				System.out.println("두 아이디가 일치합니다.");
		}else {
			System.out.println("두 아이디가 일치하지 않습니다. 작성한 아이디 : "+getNewid());
		}
	}
}
