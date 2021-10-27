package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.BankAccount;
import in.conceptarchitect.finance.OverDraft;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		String pin;
		String password="123";
		OverDraft a1=new OverDraft(222, "Vivek",password, 50000, 12);
		System.out.println("1.show account number \t");
		System.out.println("2.show balance ");
		System.out.println("3.deposit");
		System.out.println("4.withdraw");
		System.out.println("5.credit interest");
		System.out.println("6.overdraft");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("the account number is :"+a1.getAccountNumber());
			break;
		case 2:
			System.out.println("the account number is :"+a1.getAccountNumber()+"\n avaliable balance is :"+a1.getBalance());
			break;
		case 3:
			System.out.println("enter the amount to be depoisted :");
			amount=sc.nextInt();
			boolean a=a1.deposit(amount);
			if(a==true) {
				System.out.println("deposit sucess \n avaliable balance after deposit is :"+a1.getBalance());
			}
			else {
				System.out.println("deposit failed");
			}
			break;
		case 4:
			System.out.println("enter amount to be withdrawn :");
			amount=sc.nextInt();
			System.out.println("enter password :");
			pin=sc.next();
			boolean aa=a1.withdraw(amount,pin);
			System.out.println(aa);
			if(aa == true) {
				System.out.println("withdraw sucess");
			}
			else {
				System.out.println("withdraw failed");
			}
			break;	
		case 5:
			System.out.println("balance after 1 month with "+a1.getInterestRate()+" % interest rate is ");
			a1.creditInterest();
			System.out.print(a1.getBalance());
			break;
		case 6:
			System.out.println("enter amount to be withdrawn :");
			amount=sc.nextInt();
			System.out.println("enter password :");
			pin=sc.next();
			a1.overdraftWithdraw(amount,pin);
			System.out.println(a1.getBalance());
			break;
			
		}

		
		sc.close();
		
		
		
	}

}