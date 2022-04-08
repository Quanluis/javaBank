package javaBank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AccountInfo {
	
	// Attributes 
	
	String accountNumberToString;
	int AccountNumber;
	String accountPassword;
	String securityQuestion;
	String securityQuestionAnswer;
	double accountBalance;
	char accountStatus;
	double accountLimit;
	
	String file = "src/account.txt";
	
	
	// Methods
	
	public void FindAccountData(){
		
		try {
			
			File file = new File(this.file);
			Scanner run = new Scanner(file);
			
			while(run.hasNext()) {
				
			this.accountNumberToString = run.nextLine();
			this.accountPassword = run.nextLine();
					
			}
			
			this.AccountNumber = Integer.parseInt(this.accountNumberToString);

			
		run.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	

	

}
