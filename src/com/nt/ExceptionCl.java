package com.nt;

public class ExceptionCl extends Thread {
	static void m1() {
		m2();
		System.out.println("m1");
	}
	static void m2() {
	m3();
		System.out.println("m2");
	}
	static void m3() {
		
		System.out.println("hi");
		
	
		System.out.println("welcome");
		
		
	}
	public static void main(String[] args) {
		
	
		m1();
	}

}
