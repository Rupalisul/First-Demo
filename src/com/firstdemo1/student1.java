package com.firstdemo1;

public class student1 {
	private int a=10;
	static int b=20;
	 protected int d=30;
	 public int e=40;
	void m1() {
		System.out.println("inside m1 student1");
	}
	
	static void m2() {
		System.out.println("inside m2 student1");
	}
	
public static void main(String[] args) {
	
}
}
class A{
	private int aa=10;
	static int bb=20;
	protected int dd=30;
	public int ee=40;
	void m1() {
		student1 a1=new student1();
		System.out.println("inside m1 A");
	}
	
	static void m2() {
		System.out.println("inside m2 A");
	}
}