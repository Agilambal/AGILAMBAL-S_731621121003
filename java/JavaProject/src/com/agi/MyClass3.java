package com.agi;

public class MyClass3 {
	String name;
	MyClass3(String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	MyClass3(int a,int b){
		System.out.println("Addition: "+(a+b));
	}
	void greeting() {
		System.out.println("Welcome " +name);
	}
	public static void main(String args[]) {
		MyClass3 obj=new MyClass3("Agi");
	}
}
