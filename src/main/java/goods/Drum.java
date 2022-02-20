package goods;

import shop.Instrument;

public class Drum extends Instrument {

    public Drum(String name, String color, String madeFrom, double sellPrice, double purchasePrice, String classification) {
        super(name, color, madeFrom, sellPrice, purchasePrice, classification);
    }

    @Override
    public String playMusic() {
        return "dongdongdong";
    }
}
