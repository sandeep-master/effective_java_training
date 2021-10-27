package in.conceptarchitect.finance;
import java.util.*;

public class OverDraft extends BankAccount {

	public OverDraft(int accountNumber, String name, String password, double amount, double interestRate) {
		super(accountNumber, name, password, amount, interestRate);
	}
	
	
public void overdraftWithdraw(double amount,String password) {
	
		Scanner sc=new Scanner(System.in);
    if (this.balance - amount - 5 < 0) {
        System.out.println("Insufficent funds");
        System.out.println("Would you like to apply for an ovedraft?");
        System.out.println("1:Yes");
        System.out.println("2:No, return me back to menus");
        String Choice = sc.nextLine();
        if (Choice.equalsIgnoreCase("1")) {
            if (this.balance - amount - 5 <= -150000) {
                System.out.println("You have exceeded your Overdraft Limit, you will now be returned back to the menus");
            } else {
               this.balance -= amount + 5;
                System.out.println("You have withdrawen " +amount);
                System.out.println("You now have a balance of " + this.balance);
            }

}
    }
    sc.close();
}

}
