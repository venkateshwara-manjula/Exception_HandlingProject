package com.example.BuilderDesignPattren;

public class Shop {

	public static void main(String[] args) {
		
//		Phone r= new Phone("Android",5,"snapdragon",4.5,5000);
//		System.out.println(r);
		
		Phone p=new PhoneBuilder().setOs("Andriod").setBattery(2000).getPhone();
		System.out.println(p);

	}

}
