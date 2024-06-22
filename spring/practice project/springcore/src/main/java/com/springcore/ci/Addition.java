package com.springcore.ci;

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Constructor: int, int");
	}
	public Addition(double a, double b) {
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor: double, doule");
	}
	public Addition(String a, String b) {
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor: String, String");
	}
	public void doSum() {
		System.out.println("Sum is" +(this.a+this.b));
	}
}
//in this class if we donot specify the type in config class, bean will try to inject values as per order
// of functions but if string is passed then it will pick string method by default 