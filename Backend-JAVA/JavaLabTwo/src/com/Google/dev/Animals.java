package com.Google.dev;

class Animals1{
	void move() {
		System.out.println("The animal moves");
	}
}
class Cheetah extends Animals1{
	@Override
	void move() {
		System.out.println("The Cheetah run");
		// TODO Auto-generated method stub
		super.move();
	}
}
public class Animals {
	public static void main(String args[]) {
		Cheetah c=new Cheetah();
		c.move();
	}
}
