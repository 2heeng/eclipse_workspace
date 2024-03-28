package jungsuk07;

public class Circle extends Shape {

	double r;

	public Circle(double r) {
		this.r = r;
	}
	
	@Override
	double calcArea() {
		double result = r*r*Math.PI;
		return result;
	}
}
