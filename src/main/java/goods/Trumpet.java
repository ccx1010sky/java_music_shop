package goods;

import shop.Instrument;

public class Trumpet extends Instrument  {
    private int numberOfValves;

    public Trumpet(String name, String color, String madeFrom, double sellPrice, double purchasePrice, String classification) {
        super(name, color, madeFrom, sellPrice, purchasePrice, classification);
    }

    @Override
    public String playMusic() {
        return "didida";
    }

    @Override
    public double calculateMakeup() {
        return 0;
    }
}
