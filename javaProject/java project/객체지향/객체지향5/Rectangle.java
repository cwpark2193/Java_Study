package °´Ã¼ÁöÇâ5;

public class Rectangle {
		private int width, height;
		public Rectangle(int width, int height){
			this.width=width;
			this.height=height;
		}
		
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int area() { return width*height; }

		@Override
		public String toString() {
			return "Q3 [width=" + width + ", height=" + height + "]";
		}
}
