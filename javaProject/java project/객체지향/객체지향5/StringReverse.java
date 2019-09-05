package °´Ã¼ÁöÇâ5;

public class StringReverse {
	private String exline;
	public StringReverse() {exline=null;}
	public StringReverse(String exline) {this.exline=exline;}
	public String getExline() {
		return exline;
	}
	public void setExline(String exline) {
		this.exline = exline;
	}
	public static String changeReverse(String exline) {
		String exchange="";
		for(int i=exline.length()-1;i>=0;i--) {
			exchange=exchange+exline.charAt(i);
		}
		return exchange;
	}
	@Override
	public String toString() {
		return "StringReverse [exline=" + exline + "]";
	}
	
}
