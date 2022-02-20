package shop;

import behaviour.IPlay;

public abstract class Instrument extends Stock implements IPlay {
    private String classification;

    public Instrument(String name, String color, String madeFrom, double sellPrice, double purchasePrice, String classification) {
        super(name, color, madeFrom, sellPrice, purchasePrice);
        this.classification = classification;
    }
}
