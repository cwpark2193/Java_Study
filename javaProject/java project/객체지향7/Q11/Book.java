package Q11;

public class Book {
	private String bookname;
	private int pages;
	private String writername;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookname, int pages, String writername) {
		this.bookname = bookname;
		this.pages = pages;
		this.writername = writername;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getWritername() {
		return writername;
	}
	public void setWritername(String writername) {
		this.writername = writername;
	}
	@Override
	public String toString() {
		return "[bookname=" + bookname + ", pages=" + pages + ", writername=" + writername;
	}
	
}
