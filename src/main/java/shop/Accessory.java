package shop;

import shop.Instrument;

public abstract class Accessory extends Stock {
    private Instrument instrument;

    public Accessory(String name, String color, String madeFrom, double sellPrice, double purchasePrice, Instrument instrument) {
        super(name, color, madeFrom, sellPrice, purchasePrice);
        this.instrument = instrument;
    }
}
