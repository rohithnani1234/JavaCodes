package com.secnarios;

public class Scenario3 {
	public static void main(String[] args) {
		Shape circle=new Circle(5);
		System.out.println(circle.calcualateArea());
		System.out.println(((Circle)circle).calculateCircleArea());
		Shape rectangle=new Rectangle(3, 90);
		System.out.println(rectangle.calcualateArea());
		System.out.println(((Rectangle)rectangle).calcuateRectangleArea());
		Shape triangle=new Triangle(5, 12);
		System.out.println(triangle.calcualateArea());
		System.out.println(((Triangle)triangle).calculateTriangleArea());
	}
}
class Shape{
	public double calcualateArea() {
		return 0.0;
	}
}
class Circle extends Shape{
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double calculateCircleArea() {
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double calcuateRectangleArea() {
		return length*width;
	}
}
class Triangle extends Shape{
	double base;
	double height;
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	public double calculateTriangleArea() {
		return 0.5*base*height;
	}
}