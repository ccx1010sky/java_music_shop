package shop;

import shop.Instrument;

public abstract class Accessory extends Stock {
    private Instrument instrumentType;

    public Accessory(String name, String color, String madeFrom, double sellPrice, double purchasePrice, Instrument instrumentType) {
        super(name, color, madeFrom, sellPrice, purchasePrice);
        this.instrumentType = instrumentType;
    }
}
