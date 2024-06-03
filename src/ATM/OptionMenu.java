package ATM;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
			
	HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
	
	private Integer getPinNumber;
	private Object getChecking;
	
	
	public void getLogin() throws IOException {
		int x = 1;
		
		do {
			try {
				
				data.put(987556,2345);
				data.put(897676,1234);
				data.put(457567,4567);
				
				System.out.println("Welcome to the ATM Project!");
				
				System.out.println("Enter Your Customer Number:");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter Your Pin Number:");
				setPinNumber(menuInput.nextInt());
			}
				catch (Exception e) {
					System.out.println("\n" + "Invalid character(s).Only numbers." +"\n");
				    x = 2;
					
				}
			for(Entry<Integer, Integer> entry :data.entrySet()) {
				if (entry.getKey()== getCustomerNumber()&& entry.getValue() == getPinNumber);
				getAccountType();
				
			}
		
		
		System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
		}
	while (x == 1);

	}

    /* Dislpay Account Type Menu with selection*/

	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Checking Account ");
		System.out.println("Type 2 - Saving Account ");
		System.out.println("Type 3 - Exit");
		System.out.println("Choice:");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChecking();
			break;
			
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank You for Using Thisn ATM, bye.");
			break;
			
			
			default:
				System.out.println("\n" + "Invalid Choice." + "\n");
				getAccountType();
		}
	}
	
	
	  /*Display Checking Account Menu with selections */
	
	public void getChecking() {
		System.out.println("Checking Account:");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - Deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.println("Choice");
		
		selection = menuInput.nextInt();
		switch(selection) {
		
		case 1 :
			System.out.println("Checking Account Balance:" + moneyFormat.format(getChecking));
			getAccountType();
			break;
			
		case 2:
			getCheckingWithdrawlInput();
			getAccountType();
			break;
			
		case 3 :
			
			getCheckingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank You for using this ATM,bye");
			break;
			
			
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getChecking();
				}
		
		}

		/*Display Saving Account  menu with selections */
	 

		private void getCheckingDepositInput() {
		
	}

		public void getSaving() {
			System.out.println("Saving Account:");
			System.out.println("Type 1 - View Balance");
			System.out.println("Type 2 - Withdraw Funds");
			System.out.println("Type 3 - Deposit Funds");
			System.out.println("Type 4 - Exit");
			System.out.println("Choice");
			
			selection = menuInput.nextInt();
			
			switch (selection) {
			case 1:
				System.out.println("Saving Account Balance: " + moneyFormat.format(getSavingBalance()));
				getAccountType();
				break;
				
				
				
			case 2:
				getCheckingWithdrawlInput();
				getAccountType();
				break;
				
			case 3 :
				getSavingDepositInput();
				getAccountType();
				break;
				
			case 4:
				System.out.println("Thank You for using this ATM,bye.");
				break;
					
			default:
				System.out.println("\n" + "Invalid choice." + "\n");
				getSaving();
				}
				
			}

		private void getSavingDepositInput() {
			// TODO Auto-generated method stub
			
		}

		int selection; 
		
		
}
	

	
