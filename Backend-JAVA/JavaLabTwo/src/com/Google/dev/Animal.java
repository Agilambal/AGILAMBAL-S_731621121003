package com.Google.dev;

class Animal1{
void makeSound() {
	System.out.println("Bark");
}
}
class Cat extends Animal1{
	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		super.makeSound();
		
	}
}

public class Animal {
	public static void main (String args[]) {
		Cat c=new Cat();
		//c.animalName();
		c.makeSound();
	}
}
