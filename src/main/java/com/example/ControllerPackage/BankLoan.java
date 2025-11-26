package com.example.ControllerPackage;

public class BankLoan {
		public static void checkLoanEligibility(int salary) throws LoanEligility{
			if (salary <25000) {
				throw new LoanEligility("Salary must be more than 25K");
			}
			else {
				System.out.println("Loan will approve");
			}
		}
	public static void main(String[] args) {
		try {
			checkLoanEligibility(20000);
		}catch(LoanEligility e) {
			System.out.println("The mesg is :"+e.getMessage());
		}
	}
}

class LoanEligility extends Exception{
	public LoanEligility(String Mesg) {
		super(Mesg);
	}
}
