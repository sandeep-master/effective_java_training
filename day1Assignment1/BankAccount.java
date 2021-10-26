import java.util.Scanner;

public class BankAccount{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        details d=new details();
        d.setName(sc.nextLine());
        d.withdraw(1000,"123");
        d.Deposit(1000);
        d.setRate(7);
        d.ratecalculate();
        System.out.println(d.getAccountNumber());
        System.out.println(d.getRate());
        System.out.println(d.getBalance());

    }
}