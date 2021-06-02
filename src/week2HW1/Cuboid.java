package week2HW1;

public class Cuboid extends Rectangle{

	double height;
	
	public Cuboid(double length, double width, double height) {
		super(width, length);
		
		this.length = length;
		this.width = width;
		
		if (height <= 0) {
			height = 0;
			this.height = height;
		}
		else {
			this.height = height;
		}
		
	}
	public double getHeight() {
		System.out.println(this.height);
		return this.height;
		}
	
	public double getVolume() {
		this.getArea();
		this.getHeight();
		double Volume = this.getArea() * this.height;
		return Volume;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cuboid cuboid = new Cuboid(5,10,5);
		
		System.out.println("cuboid width= " + cuboid.getWidth());
		System.out.println("cuboid length= " + cuboid.getLength());
		System.out.println("cuboid area= " + cuboid.getArea());
		System.out.println("cuboid height= " + cuboid.getHeight());
		System.out.println("cuboid volume= " + cuboid.getVolume());
	}

}
