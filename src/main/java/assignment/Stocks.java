package assignment;

import java.util.Scanner;

public class Stocks {
    private static final int INVENTORY_SIZE = 2;

    public   StockPortfolio [] stocks;

    public Stocks() {
        stocks = new StockPortfolio[INVENTORY_SIZE];

    }

    public  void StockReport(){
        for (int i = 1; i<=INVENTORY_SIZE; i++){
            Scanner console = new Scanner(System.in);

            System.out.println ("Stock's name:");
            String stockName = console.next();

            System.out.println ("Stock's price:");
            int sharePrice = console.nextInt();

            System.out.println ("Numbers of shares: ");
            int numberOfShares= console.nextInt();

//           StockPortfolio value = new StockPortfolio();
            int valueOfEachStock = sharePrice * numberOfShares;
            System.out.println("Total value of the stock :" + valueOfEachStock);

            stocks [i]= new StockPortfolio(stockName, sharePrice, numberOfShares , valueOfEachStock);
        }





//        StockPortfolio stock1 = new StockPortfolio();
//        stock1.setStockName("Trident");
//        stock1.sharePrice = 25;
//        stock1.numberOfShares = 10;
//        int valueOfEachStock = (int) (stock1.sharePrice * stock1.numberOfShares);
//
//        System.out.println(valueOfEachStock);
//        System.out.println(stock1.getStockName());
//        System.out.println(stock1.getSharePrice());
//        System.out.println(stock1.getNumberOfShares());

    }
    public static void main(String[] args) {
        System.out.println(" Stock Report : ");
        Stocks report = new Stocks();
        report.StockReport();
        System.out.println(report);
//        double totalValueOfStock =
    }

}

class StockPortfolio{

    private String stockName;
    private int numberOfShares;
    private double sharePrice;
    private double valueOfEachStock;

     StockPortfolio(String stockName, int sharePrice, int numberOfShares, int valueOfEachStock) {
        this.stockName = stockName;
        this.sharePrice = sharePrice;
        this.numberOfShares = numberOfShares;
        this.valueOfEachStock =sharePrice * numberOfShares;
    }

    public String getStockName() {
        return stockName;
    }

//    public void setStockName(String stockName) {
//        this.stockName = stockName;
//    }

    public int getNumberOfShares() {
        return numberOfShares;
    }
//
//    public void setNumberOfShares(int numberOfShares) {
//        this.numberOfShares = numberOfShares;
//    }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getValueOfEachStock() {
        return valueOfEachStock;
    }

//    public void setSharePrice(double sharePrice) {
//        this.sharePrice = sharePrice;
//    }
}

