package 객체지향5;

public class RectangleTest {
	public static void main(String[] args) {
        Rectangle myRect=new Rectangle(0, 0);
        System.out.println(myRect.toString());
        myRect.setWidth(10);
        myRect.setHeight(20);
        System.out.println(myRect.toString());
        System.out.println("면적은 " + myRect.area());
    }
}
