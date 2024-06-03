package ATM;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

	   Scanner input = new Scanner(System.in);
	   DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	private int customerNumber1;
	private int pinNumber1;
	private double CheckingBalance;
	private double savingBalance1;
	private Object money;
	  
	
		public int setCustomerNumber(int customerNumber) {
			this.customerNumber1 = customerNumber;	
			return customerNumber;
		}
		
		  /* Get THe Customer number*/
		
		public int getCustomerNumber() {
			return customerNumber1;
		}
		
		/* Get the pin number */ 
		
		public int setPinNumber(int pinNumber) {
			this.pinNumber1 = pinNumber;
			return pinNumber;
		}
		
		  /* Get Checking Account Balance*/ 
		
		public double getCheckingBalance() {
			   return CheckingBalance;
			}
		
		 /* Get 	Saving Account Balance*/ 
		
		public double getSavingBalance() {
		   return savingBalance1;
		}
		
		    /*Calculate Checking Account withdrawl */
		
		public double calcCheckingWithdraw(double amount) {
			CheckingBalance = (savingBalance1 - amount);
			return CheckingBalance;
		}
		
		    /*Calculate Saving  Account withdrawl */
		
		public double calcSavingWithdraw(double amount) {
			savingBalance1 = (savingBalance1 - amount);
			return savingBalance1;
		}
	   
		public double calcSavingsDeposit(double amount) {
			savingBalance1 = (savingBalance1 + amount);
			return savingBalance1;
		}
	   
	    
	        /*Calculate Saving Account deposit */
		
		public double calcSavingDeposit(double amount) {
			savingBalance1 = (savingBalance1 + amount);
			return savingBalance1;
		}
		
		  /*Customer Checking Account Withdraw input*/
		
		public void getCheckingWithdrawInput() {
			System.out.println("Checking Account Balance:" + moneyFormat.format(CheckingBalance));
			System.out.println("Amount you want to withdraw from Checking Account:");
			double amount = input.nextDouble();
			
			if ((CheckingBalance - amount)>= 0 ) {
				calcCheckingWithdraw(amount);
				System.out.println("New Checking Account balance: " + moneyFormat.format(CheckingBalance));
			} else {
				System.out.println("Balance cannot be negative." + "\n");
			}
			
		}
		
		        /*Customer Saving Account Withdrwal input */
		
		
		public void getSavingWithdrawlInput() {
			System.out.println("Saving Account Balance:" + savingBalance1 + "\n");
			System.out.println("Amount you want to withdraw from Saving Account:");
			double amount = input.nextDouble();
			
		if ((savingBalance1 - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance:" + savingBalance1 + "\n");
		} else {
			
			System.out.println("Balance cannot be negative." + "\n");
			
		}
}
		
		         /*Customer Checking Account Deposite input */
		
		public void getCheckingWithdrawlInput() {
			System.out.println("Checking Account Balance:" + moneyFormat.format(CheckingBalance) + "\n");
			System.out.println("Amount you want to deposit from Checking Account:");
			double amount = input.nextDouble();
			
		if ((	CheckingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Account balance:" + CheckingBalance + "\n");
		} else {
			
			System.out.println("Balance cannot be negative." + "\n");
			
		}
}
		   
		        /*Customer Saving Account Deposite input */
		
		public void getSavingWithdrawlInput1() {
			System.out.println("Saving Account Balance:" + moneyFormat.format(savingBalance1) + "\n");
			System.out.println("Amount you want to deposit from Checking Account:");
			double amount = input.nextDouble();
			
		if ((savingBalance1 - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Account balance:" + savingBalance1 + "\n");
		} else {
			
			System.out.println("Balance cannot be negative." + "\n");
			
		}
		}
}
		
	
