package StockAccountManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StockPortfolio {
    ArrayList<Stock> stockList = new ArrayList<>();

    public void addStock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stock");
        int N = sc.nextInt();
        int totalValues;
        for (int i = 0; i < N; i++) {
            Stock report = new Stock();
            System.out.println("Enter stock name");
            report.setStockName(sc.next());
            System.out.println("Enter number of shares");
            report.setNoOfShares(sc.nextInt());
            System.out.println("Enter share price");
            report.setSharePrice(sc.nextInt());
            stockList.add(report);
        }
        for (int i = 0; i < stockList.size(); i++) {
            totalValues = stockList.get(i).getNoOfShares() * stockList.get(i).getSharePrice();
            System.out.println("Stock value of " + i + 1 + " : " + totalValues);
        }
    }

    public void totalValue() {
        int totalValues = 0;
        for (Stock details : stockList) {
            totalValues = totalValues + details.getNoOfShares() * details.getSharePrice();
        }
        System.out.println("TotalValue : " + totalValues);
    }

    public static void main(String[] args) {
        StockPortfolio stock = new StockPortfolio();
        stock.addStock();
        stock.totalValue();
    }
}
