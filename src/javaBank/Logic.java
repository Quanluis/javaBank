package javaBank;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Logic {
	
	// Attributes 
	
	String file = "src/account.txt";
	String accountInput;
	String passwordInput;
	
	
	// Methods 
	
	AccountInfo run = new AccountInfo();
	
	public void inform() {
		JOptionPane.showMessageDialog(null, "Find the input file to process.");
	}
	
	public void findInput() {
		
		Scanner sc= new Scanner(System.in); 
		
		this.accountInput = sc.nextLine();	
		
		this.passwordInput = sc.nextLine();	
		
		sc.close();
		
	}
	
	
	public void checkInput() {
		
		run.FindAccountData();
		
		if(run.accountPassword == this.passwordInput) {
			System.out.println(run.accountPassword.length());
		}
		
		if(run.AccountNumber == Integer.parseInt(this.accountInput) && run.accountPassword.equals(this.passwordInput) ) {
			System.out.println(run.AccountNumber + " is equal to " + this.accountInput);
			
			System.out.println(run.accountPassword + " is equal to " + this.passwordInput);
			
		}else {
			System.out.println("Input is incorrect, try again.");
		}
		
	}
	
	
	
	public void run() {
		findInput();
		checkInput();
	}
	
	
	
	
	

}
