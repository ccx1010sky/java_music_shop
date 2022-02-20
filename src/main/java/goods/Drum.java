package goods;

import shop.Instrument;

public class Drum extends Instrument {
    private int numOfDrumSticks;

    public Drum(String name, String color, String madeFrom, double sellPrice, double purchasePrice, String classification, int numOfDrumSticks) {
        super(name, color, madeFrom, sellPrice, purchasePrice, classification);
        this.numOfDrumSticks = numOfDrumSticks;
    }

    @Override
    public String playMusic() {
        return "dongdongdong";
    }
}
