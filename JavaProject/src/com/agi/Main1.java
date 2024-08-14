package com.agi;

class Animal3{
	int a=10;
	void move() {
		System.out.println("All animals move from one place to another pplace");
	}
	void eat() {
		
		System.out.println("All animals will eat something");
	}
}
	class Dog1 extends Animal3{
		int a=20;
		void move() {
			System.out.println("Dog will walk");
		}
		void eat() {
			System.out.println("Dog will eat chicken");
		}
	}
	class Bird1 extends Animal3{
		void move() {
			System.out.println("Bird will fly");
		}
		void eat() {
			System.out.println("Bird will eat rice");
		}
	}
	class Fish1 extends Animal3{
		void move() {
			System.out.println("Fish will swim");
		}
		void eat() {
			System.out.println("Fish will eat food");
		}
	}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal3 animal;
		animal=new Dog1();
		animal.move();
		animal.eat();
		animal = new Bird1();
		animal.move();
		animal.eat();
		animal=new Fish1();
		animal.move();
		animal.eat();
		System.out.println(animal.a);
	}

}
