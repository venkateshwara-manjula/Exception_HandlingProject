package com.example.ControllerPackage;

public class StringException {
	
	public static void stringCheck(String mesg) {
		if(mesg==null || mesg.isEmpty()) {
			throw new EmptyStringException("String is empty.........");
		}else {
			System.out.println("string has matter.....that is :"+mesg);
		}
	}

	public static void main(String[] args) {
		try {
			stringCheck("venky");
		}catch(EmptyStringException e){
			System.out.println("The mesg is : "+e.getMessage());
		}

	}

}

class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(message);
    }
}
