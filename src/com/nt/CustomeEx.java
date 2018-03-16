package com.nt;

public class CustomeEx extends Exception {
 static void m1(int age) {
	 if(age>18) {
		 System.out.println("you are eligible for vote");
	 }else if(age<18) {
		 System.out.println("you are not eligible for vote");
	 }
	 else {
		 System.out.println("enter the currect age");
	 }
	
 }
 public static void main(String[] args) {
	m1(15);
}
}
