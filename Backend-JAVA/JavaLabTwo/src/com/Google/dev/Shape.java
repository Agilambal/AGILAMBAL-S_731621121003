package com.Google.dev;

import java.util.Scanner;

class Shape1{
	public double getArea() {
		return 0;
	}
}
class Rectangle extends Shape1{
	private double width;
	private double height;
	
	public Rectangle(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
}
public class Shape {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Width: ");
		int width = s.nextInt();
		System.out.print("Enter the Height :");
		int height = s.nextInt();
		
		Rectangle r=new Rectangle(width,height);
		
		System.out.println("The area of the Rectangle is: "+r.getArea());
	}

}

