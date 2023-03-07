package StockAccountManagement;

public class Stock {
    private String stockName;
    private int noOfShares;
    private int sharePrice;
    int totalValues;

    public Stock() {
        this.stockName = stockName;
        this.noOfShares = noOfShares;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockName='" + stockName + '\'' + ", noOfShares=" + noOfShares + ", " +
                "sharePrice=" + sharePrice + ", totalValues=" + totalValues + '}';
    }
}
