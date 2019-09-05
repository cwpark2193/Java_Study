package chapter5;

public class Box {
	 private int width;
	 private int length;
	 private int height;

	 public Box(){
	      this.width=0;
	      this.length=0;
	      this.height=0;
	 }
	 public void setwidth ( int width) { // ºº≈ÕΩ∫
	      this.width=width;
	 }
	 public void setlength ( int length) {
	      this.length=length;
	 }
	 public void setheight ( int height) {
	      this.height=height;
	 }
	 public int getwidth(){
		 return width;
	 } 
	 public int getlength(){
	      return length;
     } 
	 public int getheight(){
	      return height;
	 } 
	 public int boxValume() {
	      int valume=0;
	      valume=width*length*height;
	      return valume;
	 }
}
