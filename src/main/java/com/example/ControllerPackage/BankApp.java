package com.example.ControllerPackage;

public class BankApp {
	
	public static void checkwithdraw(double amount, double balance) {
		if(amount>balance) {
			throw new InsufficientBalance("amount is more than balance...........");
		}
		else {
			System.out.println("withdraw successfull.......");
		}
	}

	public static void main(String[] args) {
		try {
			checkwithdraw(100000, 20000);		
			}catch(InsufficientBalance e) {				
			System.out.println("The mesg is :"+e.getMessage());
		}
	}
}

class InsufficientBalance extends RuntimeException{
	public InsufficientBalance(String mesg) {
		super(mesg);
	}
}
