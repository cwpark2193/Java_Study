package chapter9.rectangle;

import org.omg.CORBA.OBJ_ADAPTER;
import org.w3c.dom.css.Rect;

public class Rectangle {
	public int width;
	public int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}
	public int getArea() {
		return width*height;
	}
	public int compareTo(Object other) {
		Rectangle r1 = null;
		Circle c1=null;
		int returnValue=0;
		if(other instanceof Rectangle) {
			r1 = (Rectangle)other;
		if (this.getArea() < r1.getArea()) {
			returnValue= -1;
		}
		else if (this.getArea() > r1.getArea()) {
			returnValue= 1;}
		else {
			returnValue= 0;}
	}
	else if(other instanceof Circle) {
		c1=(Circle)other;
		if(this.getArea()>c1.getArea()) {
			returnValue=1;
		}
		else if(this.getArea()<c1.getArea()) {
			returnValue=-1;
		}else {
			returnValue=0;
		}
	}
		return returnValue;
}
}
