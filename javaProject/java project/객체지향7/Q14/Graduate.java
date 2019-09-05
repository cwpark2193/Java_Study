package Q14;

public class Graduate extends Student{
	private static String[] defaultType= {"교육조교","연구조교"};
	//조교 유형과 장학금비율 추가
	private String assistuntType;
	private double scholarshipRate;
	
	public Graduate(String assistuntType,double scholarshipRate) {
		this(null,0,null,0,0,assistuntType,scholarshipRate);
	}
	public Graduate(String name, int studentnumber, String major, int grade, int creditearned,String assistuntType,double scholarshipRate) {
		super(name, studentnumber, major, grade, creditearned);
		int returnValue=1;
		this.assistuntType = "교육조교";
		for(int i=0;i<defaultType.length;i++) {
			returnValue=assistuntType.compareTo(defaultType[i]);
			if(returnValue==0) {this.assistuntType = assistuntType; break;}
		}
		this.scholarshipRate = 1.0;
		if(scholarshipRate>=0.0 && scholarshipRate<=1.0) {
			this.scholarshipRate = scholarshipRate;
		}		
	}
	@Override
	public String toString() {
		return "Graduate [assistuntType=" + assistuntType + ", scholarshipRate=" + scholarshipRate + ", toString()="
				+ super.toString() + "]";
	}
}
