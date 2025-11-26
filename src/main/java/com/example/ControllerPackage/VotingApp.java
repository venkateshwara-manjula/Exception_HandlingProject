package com.example.ControllerPackage;

public class VotingApp {
	
	public static void checkAge(int num) throws InvalidAgeException1{
		if (num<18) {
			throw new InvalidAgeException1("Age should be more than 18 for Eligibilty");
		}
		System.out.println("eligible");
	}

	public static void main(String[] args) {
		try {
		checkAge(2);
		}
		catch(InvalidAgeException1 e) {
			System.out.println("mesg is :"+e.getMessage());
		}

	}

}

class InvalidAgeException1 extends Exception{
	public InvalidAgeException1(String mesg) {
		super(mesg);
	}
}
  
