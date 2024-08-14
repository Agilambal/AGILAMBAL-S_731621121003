package com.agi;

class Animal2{
	void move() {
		System.out.println("All animals move from one place to another pplace");
	}
	void eat() {
		
		System.out.println("All animals will eat something");
	}
}
	class Dog extends Animal2{
		void move() {
			System.out.println("Dog will walk");
		}
		void eat() {
			System.out.println("Dog will eat chicken");
		}
	}
	class Bird extends Animal2{
		void move() {
			System.out.println("Bird will fly");
		}
		void eat() {
			System.out.println("Bird will eat rice");
		}
	}
	class Fish extends Animal2{
		void move() {
			System.out.println("Fish will swim");
		}
		void eat() {
			System.out.println("Fish will eat food");
		}
	}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.move();
		d.eat();
		Bird b=new Bird();
		b.move();
		b.eat();
		Fish f=new Fish();
		f.move();
		f.eat();
		
	}

}
