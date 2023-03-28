package com.firstdemo;

public class A {
	int a=10; //instance varables
	static int b=20;  //static varables
	{
		System.out.println("inside instance blocks");
	}
	
	static {
		System.out.println("inside static blocks");
	}
	
	void m1() {
		System.out.println("inside instance method");
		System.out.println("a==="+a);
		System.out.println("b==="+b);
	}
	static void m2() {
		System.out.println("inside static method");
		A a1=new A();
		System.out.println("a==="+a1.a);
		a1.m1();
	}
	
	
public static void main(String[] args) {
	int c=30;  //local varables
}
}
