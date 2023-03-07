package Commercial_data_processing;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount implements CompanyShares{
    static Scanner input = new Scanner(System.in);
    static ArrayList<CompanyShares> array = new ArrayList<>();
    static int valueOfShare;

    StockAccount() {

    }

    double valueOf() {
        return 0;
    }

    @Override
    public void buy() {
// to add shares
        System.out.print("Enter num of shares you want to buy - ");
        int numToBuy = input.nextInt();
        System.out.print("Enter value of each share - ");
        int valueToBuy = input.nextInt();
        int totalShareAmountBuy = numToBuy * valueToBuy;
        valueOfShare += totalShareAmountBuy;
        System.out.println("Value of share = " + valueOfShare);
    }

    @Override
    public void sell() {
// to subtract shares
        System.out.print("Enter num of shares you want to sell - ");
        int numToSell = input.nextInt();
        System.out.print("Enter value of each share - ");
        int valueToSell = input.nextInt();
        int totalShareAmtSell = numToSell * valueToSell;
        valueOfShare -= totalShareAmtSell;
        System.out.println("Value of share = " + valueOfShare);
    }

    @Override
    public void save() {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        System.out.println("Time saved = " + date + " " + time);
    }

    @Override
    public void printReport() {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter value of share in account - ");
        valueOfShare = input.nextInt();
        CompanyShares obj = new StockAccount();
        String choice = "Continue";
        while (!choice.equals("print")) {
            System.out.println("What do you want to perform for Shares ");
            System.out.print("Buy / Sell / Save / Print - ");
            choice = input.next();
            switch (choice) {
                case "buy":
                    obj.buy();
                    break;
                case "sell":
                    obj.sell();
                    break;
                case "save":
                    obj.save();
                    break;
                case "print":
                    obj.printReport();
                    break;
            }
            array.add(obj);
        }
    }
}
