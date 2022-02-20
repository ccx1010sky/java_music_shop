package shop;

import behaviour.ISell;

public abstract class Stock implements ISell {
    private String name;
    private String color;
    private String madeFrom;
    private double sellPrice;
    private double purchasePrice;

    public Stock(String name, String color, String madeFrom, double sellPrice, double purchasePrice) {
        this.name = name;
        this.color = color;
        this.madeFrom = madeFrom;
        this.sellPrice = sellPrice;
        this.purchasePrice = purchasePrice;
    }
}
