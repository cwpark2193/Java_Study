package Q11;

public class BookTest {

	public static void main(String[] args) {
		Magazine magazineNews = new Magazine("Micro Software",292,"마소팀","2019.7.08");
		System.out.println(magazineNews);
		System.out.println("이 잡지의 이름은 "+magazineNews.getBookname()+"으로 총 "+magazineNews.getPages()+"페이지이며 저자는 "+magazineNews.getWritername()+"이고 발행 날짜는"+magazineNews.getOpendate()+"이다.");
		}

}
