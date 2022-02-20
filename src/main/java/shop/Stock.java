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

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getMadeFrom() {
        return madeFrom;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMadeFrom(String madeFrom) {
        this.madeFrom = madeFrom;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
