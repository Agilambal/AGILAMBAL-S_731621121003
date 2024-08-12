package com.agi;

public class MyClass2 {
	void myMethod1() {
		System.out.println("Instance Method");
	}
	static void myMethod2() {
		System.out.println("Static Method");
	}
	public static void main(String args[]) {
		MyClass2 obj=new MyClass2();
		obj.myMethod1();
		MyClass2.myMethod2();
	}
}
