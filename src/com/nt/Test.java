package com.nt;

public class Test {
public static void main(String[] args) throws InSufficientAmountOfEx, InvalidAmountEx {
	int amount=1000;
	int bal=0;
	if(amount<900) {
		throw new   InvalidAmountEx("invalid amount Exception");
	}
	
	else if(amount>bal) {
		throw new  InSufficientAmountOfEx("invalid amount of Exception");
	}
	else {
		System.out.println("enter the currect bal");
	}
		
}
}
