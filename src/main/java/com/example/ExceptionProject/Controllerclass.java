package com.example.ExceptionProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllerclass {
	
	@GetMapping("/hello")
	public String display() {
		return "Hi venkateshwara";
	}
	
	@GetMapping("/CheckAge")
	public String checkAge(@RequestParam int age) throws AgeException {
		try {
		if (age<18){
			throw new AgeException("Age is less that expected ");
		}}
		catch(AgeException e) {
			System.out.println("Exception caught :"+e.getMessage());
			e.printStackTrace();
			return "Age is less than 18";
		}
		return "Age is Coreect";
	}
	
	@GetMapping("/withdraw")
	public String makeWithdraw(@RequestParam int amount,@RequestParam int balance) throws OverallCheckedException{
		try {
			if (amount>balance) throw new OverallCheckedException("Please make withdraw less that or equal to balance");
		}catch(OverallCheckedException e) {
			System.out.println("Exception caught :"+e.getMessage());
			e.printStackTrace();
			return "The amount "+amount+" is greater than "+balance+" withdraw not possible";
		}
		return "withdraw successful";
		}
	
	

}
