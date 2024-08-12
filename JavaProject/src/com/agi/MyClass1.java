package com.agi;

//Types of variables
public class MyClass1 {
	int b=20;//Instance or Object Variable
	static int c=30;//Static or Class Variable
public static void main(String args[]) {
	int a=10; //Local Variable
	System.out.println("Local Variable :"+a);
	
	MyClass1 obj=new MyClass1();
	System.out.println(obj.b);
	
	System.out.println(MyClass1.c);
}
}
