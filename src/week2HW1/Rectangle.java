package week2HW1;


//Write a class with the name Rectangle. 
public class Rectangle {
//	The class needs two fields (instance variable) with name width and length both of type double.
	double length;
	double width;
	
//	The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
	public Rectangle(double W, double L) {
		
//		In case the width parameter is less than 0 it needs to set the width field value to 0.
		if (W <= 0) {
			W = 0;
			this.width = W;
			System.out.println("the Width is needs to be greater than 0");
		}	
		else {
			this.width = W;
			
//		In case the length parameter is less than 0 it needs to set the length field value to 0
		}
		if (L <= 0 ) {
			L = 0;
			this.length = L;
			System.out.println("the Length needs to be greater than 0 ");
		}
		else {
			this.length = L;
		}
		
	}
//	Write the following methods (instance methods):
	
//	Method named getWidth without any parameters, it needs to return the value of width field
	public double getWidth() {
//		System.out.println("The width is " + this.width);
			return this.width;	
			
		}
//	Method named getLength without any parameters, it needs to return the value of length field
	public double getLength() {
//			System.out.println("The length is " +this.length);
			return this.length;
		}
	
//	Method named getArea without any parameters, it needs to return the calculated area (width * length).
	public double getArea() {
		double area = this.width * this.length;
//			System.out.println("The area is " + area);
			return area;
		}
		

		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Test Code for main() method
		
		Rectangle rectangle = new Rectangle(5,10);
		System.out.println(rectangle.getWidth());
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getArea());
	}
	
}

