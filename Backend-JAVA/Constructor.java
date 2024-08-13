package com.agi;
class Z {
	Z(){
		System.out.println("A");
	}
	Z(int a){
		System.out.println("A1");
	}
}
class Y extends Z{
	Y(){
		super(5);
		System.out.println("B");
	}
	Y(int a){
		System.out.println("B1");
	}
}
public class Constructor {
	public static void main(String args[]) {
		Y b=new Y(5);
	}
}
