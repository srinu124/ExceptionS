package com.nt;

public class Example {
	void m1(){
	m2();
	System.out.println("m1 method");
	}
	void m2()  {
		m3();
		System.out.println("m2 method");
	}
	void m3()  {
		System.out.println("m3 method");
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
   public static void main(String[] args) {
	
	   Example e=new Example();
	     e.m1();
}
}
