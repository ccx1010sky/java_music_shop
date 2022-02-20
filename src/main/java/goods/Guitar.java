package goods;

import shop.Instrument;
public class Guitar extends Instrument{
    private int numberOfStrings;

    public Guitar(String name, String color, String madeFrom, double sellPrice, double purchasePrice, String classification, int numberOfStrings) {
        super(name, color, madeFrom, sellPrice, purchasePrice, classification);
        this.numberOfStrings = numberOfStrings;
    }



    @Override
    public String playMusic() {
        return "dinging";
    }
}
