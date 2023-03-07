package MyWork;

import java.io.IOException;
import java.security.KeyStore.Entry;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat =new DecimalFormat("'$' ###,##0.00");
    
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(123456789, 1234);
				data.put(987654321, 4321);
				
				System.out.println("Welcome to the ATM");
				System.out.println("Enter your Account Number");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter your account Pin");
				setPinNumber(menuInput.nextInt());
				}catch(Exception e) {
					System.out.println("\n"+"Invalid Character(s). Only Numbers. "+"\n");
					x=2;
				}
			for(java.util.Map.Entry<Integer, Integer> entry :data.entrySet()) {
				if(entry.getKey()==getCustomerNumber() && entry.getValue()== getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n"+ " Wrong Pin Number or Account Number."+"\n");
		}while (x==1);
	}
	public void getAccountType() {
		System.out.println("Select the Account you want to access: ");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit ");
		System.out.println("Type 4 - Choice : ");
		
		switch(selection) {
		
		case 1:
			getChecking();
			System.out.println("fsdjkabk");
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thank You for using The ATM, have a Nice Day.");
			break;
		case 4:
			System.out.println("\n"+" Inavlid Choice"+"\n");
			getAccountType();
			}
		}
	public void getChecking() {
		    System.out.println(" Current Account : ");
		    System.out.println("Type 1- View Balance");
		    System.out.println("Type 2 - Withdraw Money");
		    System.out.println("Type 3 - Deposit Money");
		    System.out.println("Type 4 - Exit ");
		    System.out.println("Choice : ");
		    
		    selection = menuInput.nextInt();
		    
		    switch(selection) {
		    case 1:
		    	System.out.println("Checking Account Balance: "+ moneyFormat.format(getCheckingBalance()));
		    	getAccountType();
		    	break;
		    case 2:
		    	getCheckingWithdrawInput();
		    	getAccountType();
		    	break;
		    case 3:
		    	getCheckingDepositInput();
		    	getAccountType();
		    	break;
		    case 4:
		    	System.out.println("Thank You for using The ATM, have a Nice Day.");
				break;
			default :
				System.out.println("\n"+" Inavlid Choice"+"\n");
				getChecking();
		}
	}
public void getSaving() {
	System.out.println(" Saving Account : ");
    System.out.println("Type 1- View Balance");
    System.out.println("Type 2 - Withdraw Money");
    System.out.println("Type 3 - Deposit Money");
    System.out.println("Type 4 - Exit ");
    System.out.println("Choice : ");
    
    selection = menuInput.nextInt();
    
    switch(selection) {
    case 1:
    	System.out.println("Saving Account Balance: "+ moneyFormat.format(getSavingBalance()));
    	getAccountType();
    	break;
    case 2:
    	getSavingWithdrawInput();
    	getAccountType();
    	break;
    case 3:
    	getSavingDepositInput();
    	getAccountType();
    	break;
    case 4:
    	System.out.println("Thank You for using The ATM, have a Nice Day.");
		break;
	default :
		System.out.println("\n"+" Inavlid Choice"+"\n");
		getChecking();
     }
   }
int selection;
}
