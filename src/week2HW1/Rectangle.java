package week2HW1;

public class Rectangle {

	double length;
	double width;
	
	public Rectangle(double W, double L) {
		if (W <= 0) {
			W = 0;
			this.width = W;
			System.out.println("the Width is " + this.width);
		}	
		else {
			this.width = W;
		}
		if (L <= 0 ) {
			L = 0;
			this.length = L;
			System.out.println("the Length is " + this.length);
		}
		else {
			this.length = L;
		}
		
	}
	
	public double getWidth() {
		System.out.println(this.width);
			return this.width;	
			
		}
	
	public double getLength() {
			System.out.println(this.length);
			return this.length;
		}
	
	public double getArea() {
			System.out.println(this.width * this.length);
			return this.width * this.length;
		}
		

		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rectangle = new Rectangle(5,10);
		System.out.println("rectangle width= " + rectangle.getWidth());
		System.out.println("rectangle length= " + rectangle.getLength());
		System.out.println("rectangle area= " + rectangle.getArea());
	}
	
}

