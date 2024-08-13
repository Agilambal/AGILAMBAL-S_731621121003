package com.agi;
//Single and Multilevel Inheritance
class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
  class TwoWheeler extends Vehicle {
	void nOfWheels() {
		System.out.println("I have two wheels");
	}
}
	class Bike extends TwoWheeler{
		void brandName() {
			System.out.println("Brand Name is Honda");
		}
	}
	class Car extends TwoWheeler{
		void brandName() {
			System.out.println("Brand Name is Mahendra-THAR");
		}
	}
	 public class Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new Bike();
		bike.nOfWheels();
		bike.brandName();
		bike.noOfEngine();
		
		Car c=new Car();
		c.brandName();
		c.nOfWheels();
		c.noOfEngine();
		
	}
	 }
