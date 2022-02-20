package goods;

import shop.Instrument;
public class Guitar extends Instrument{
    private int numberOfStrings;

    public Guitar(String name, String color, String madeFrom, double sellPrice, double purchasePrice, String classification, int numberOfStrings) {
        super(name, color, madeFrom, sellPrice, purchasePrice, classification);
        this.numberOfStrings = numberOfStrings;
    }

    @Override


    public double calculateMakeup(){
        return 0.99;
    };
}
