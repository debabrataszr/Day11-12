package Account_Test;

import java.util.Scanner;

public class Account {
    double accountBalance = 50000;

    public void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw");
        double withdraw = sc.nextDouble();
        if (withdraw > accountBalance)
            System.out.println("Insufficient Balance");
        else
            accountBalance = accountBalance - withdraw;
        System.out.println("Remaining balance : " + accountBalance);
    }
}
