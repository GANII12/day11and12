package assignment;

public class Stocks {
    public static void main(String[] args) {

        StockPortfolio stock1 = new StockPortfolio();
        stock1.setName("Trident");
        stock1.sharePrice = 25;
        stock1.numberOfShares = 1;
        stock1.stockReport("Ganesh",30 ,5);
        System.out.println();
//        System.out.println(stock1.getSharePrice());
//        System.out.println(stock1.getNumberOfShares());

    }
    public Stocks(){

    }

}

class StockPortfolio{

    String stockName;
    int numberOfShares;
    double sharePrice;

    public void stockReport(String stockName, int sharePrice, int numberOfShares) {
        this.stockName = stockName;
        this.sharePrice = sharePrice;
        this.numberOfShares = numberOfShares;
    }

    public String getStockName() {
        return stockName;
    }

    public void setName(String stockName) {
        this.stockName = stockName;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

}

