package com.agi;
//Method Overloading
public class MyClass4 {
	void myMethod(String name) {
		System.out.println("Welcome "+name);
	}
	void myMethod(int a,int b) {
		System.out.println("Sum :"+(a+b));
	}
	void myMethod(int n) {
		System.out.println("Sum :"+(n+n));
	}
	public static void main(String args[]) {
		MyClass4 obj=new MyClass4();
		obj.myMethod(5);
		obj.myMethod("Agi");
		obj.myMethod(10,20);
	}
}
