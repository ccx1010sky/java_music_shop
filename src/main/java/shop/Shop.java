package shop;

import behaviour.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private double profit;
    ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.profit = 0.00;
        this.stock = new ArrayList<>();
    }


    public void addItem(ISell item){
         this.stock.add(item);
    }
    public void removeItem(ISell item){
        this.stock.remove(item);
    }

    public String getName() {
        return name;
    }

    public int getStockCount(){
        return stock.size();
    }

    public double getTotalProfit(){
        for (ISell item : stock){
            profit += item.calculateMakeup();
        }
        return profit;
    }
}
