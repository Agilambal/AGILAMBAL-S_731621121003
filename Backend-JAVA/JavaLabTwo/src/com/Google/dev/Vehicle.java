package com.Google.dev;

class Vehicle1 {
	void drive() {
		System.out.println("Repairing a Car");
	}
}
	class Car extends Vehicle1{
		@Override
		void drive() {
			// TODO Auto-generated method stub
			super.drive();
		}
		
	}
public class Vehicle {
	public static void main(String args[]) {
		Car c= new Car();
		c.drive();
	}
}
