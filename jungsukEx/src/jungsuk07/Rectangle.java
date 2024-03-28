package jungsuk07;

public class Rectangle extends Shape {
	
	double width;
	double height;
	
	

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
		return false;
	}

}
