package in.conceptarchitect.finance;

import java.util.Scanner;

public class BankAccount {
	
	int accountNumber;
	String name;
	String password;
	double balance;
	double interestRate;
	
	
	public int getAccountNumber() {
		return accountNumber;
	}

	//account number can't be changed
	//public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

	//should there be a getPassword and setPassword
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		
		this.password = encrypt(password);
	}

	

	private String encrypt(String password) {
		
		String s1="";
		
		for(int i=0;i<password.length();i++) {
			int ch= (int) password.charAt(i);
			s1+=Integer.toHexString(ch);
		}
		return s1;
	}

	public BankAccount(int accountNumber, String name, String password, double amount,double interestRate) {
		
		balance=amount; //this is optional here as there is a single balance in the context	
		this.name=name;
		setPassword(password);
		this.interestRate=interestRate;
		this.accountNumber=accountNumber;
		
	}
	
	public void show() {
		System.out.println("account number\t"+accountNumber);
		System.out.println("name         \t"+name);
		System.out.println("password     \t"+password);
		System.out.println("balance      \t"+balance);
		System.out.println("interest rate\t"+interestRate);
		System.out.println();
		
	}

	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance+=amount;
			return true;
		} else {
			return false;
		}
	}

	public boolean withdraw(double n, String password) {
		if(this.password==password){
	        if(n<balance && n>0 ){
	            balance-=n;
	            return true;
	        }
	        else if(n==0 || n<0){
	        	return false;	        
	        }
	        else { 
	        	return false;
	        }
	    }
	    else{
	        return false;
	    }
	    }
	
	public void creditInterest() {
		balance+=(balance*interestRate/1200);
	}


}
