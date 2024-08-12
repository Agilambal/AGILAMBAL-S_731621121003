package com.agi;
//Constructor overloading
public class MyClass5 {
	MyClass5(String name) {
		System.out.println("Welcome "+name);
	}
	MyClass5(int a,int b) {
		this("Agi");
		System.out.println("Sum :"+(a+b));
	}
	MyClass5(int n) {
		this(10,20);
		System.out.println("Sum :"+(n+n));
	}
	public static void main(String args[]) {
		MyClass5 obj=new MyClass5(5);
		

		
	}
}
