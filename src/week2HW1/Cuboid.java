package week2HW1;

//Write a class with the name Cuboid that extends Rectangle class. 
public class Cuboid extends Rectangle{

//	The class needs one field (instance variable) with name height of type double. 
	double height;
	
//	 The class needs to have one constructor with three parameters width, length, and height all of type double.
//	 It needs to call parent constructor and initialize a height field.	
	public Cuboid(double length, double width, double height) {
//		We call super() here to supersede the previous variables in the class of Rectangle that we are extending from
		super(width, length);
		
		this.length = length;
		this.width = width;
		
//		In case the height parameter is less than 0 it needs to set the height field value to 0.
		if (height <= 0) {
			height = 0;
			this.height = height;
		}
		else {
			this.height = height;
		}
		
	}
	
//	Write the following methods (instance methods):
	
	
//	Method named getHeight without any parameters, it needs to return the value of height field.
	public double getHeight() {
		return this.height;
		}
	
	
//	Method named getVolume without any parameters, it needs to return the calculated volume.
	public double getVolume() {
		this.getArea();
		this.getHeight();
		
//		 To calculate volume multiply the area with height.
		double Volume = this.getArea() * this.height;
		return Volume;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Test Code for main() method
		Cuboid cuboid = new Cuboid(5,10,5);
		
		System.out.println("cuboid width= " + cuboid.getWidth());
		System.out.println("cuboid length= " + cuboid.getLength());
		System.out.println("cuboid area= " + cuboid.getArea());
		System.out.println("cuboid height= " + cuboid.getHeight());
		System.out.println("cuboid volume= " + cuboid.getVolume());
	}

}
