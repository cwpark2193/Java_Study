package Q11;

public class Magazine extends Book{
	private String opendate;

	public Magazine() {
		super();
		this.opendate=null;
	}
	public Magazine(String bookname, int pages, String writername,String opendate) {
		super(bookname, pages, writername);
		this.opendate=opendate;
	}
	public String getOpendate() {
		return opendate;
	}
	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}
	@Override
	public String toString() {
		return "Magazine = "+super.toString() +", opendate="+opendate+"]";
	}
	
}

