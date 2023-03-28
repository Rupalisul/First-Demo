package com.firstdemo;

public class Abc {
	{
		System.out.println("inside instance blocks");
	}
	
	static {
		System.out.println("inside static blocks");
	}
	int a;
	static int b;
	void m1() {
		System.out.println("inside instance method");
	}
	static void m2() {
		System.out.println("inside static method");
	}
public static void main(String[] args) {
	int c;
}
}
class student{
	{
		System.out.println("inside instance blocks");
	}
	
	static {
		System.out.println("inside static blocks");
	}
	int aa;
	static int bb;
	void m1() {
		System.out.println("inside instance method");
		System.out.println("b==="+Abc.b);
	}
	static void m2() {
		System.out.println("inside static method");
		Abc a1=new Abc();
		System.out.println("inside m1 student"+a1.a);
	}
public static void main(String[] args) {
	int cc;
}
}

