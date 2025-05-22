package com.constructor;

public class Circle {
	double radius;
	
	public Circle(double rad) {
		this.radius=rad;
	}
	public double getArea() {
		return (3.14*radius*radius);
	}
	public double getCircumference() {
		return 2*3.14*radius;
	}
	public static void main(String[] args) {
		Circle cir=new Circle(252);
		double area=cir.getArea();
		System.out.println("Area of Circle is:"+area);
		double circumference=cir.getCircumference();
		System.out.println("Circumference of Circle is:"+circumference);
	}

}
