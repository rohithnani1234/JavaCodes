package com.constructor;

public class Rectangle {
	int length;
	int breadth;
	public Rectangle() {
		length=0;
		breadth=0;
	}
	public Rectangle(int len,int bread) {
		length=len;
		breadth=bread;
	}
	public int area() {
		return length*breadth;
	}
	public static void main(String[] args) {
		Rectangle rect=new Rectangle(3,5);
		int ret=rect.area();
		System.out.println("Area of rectangle is:"+ret);
	}

}
