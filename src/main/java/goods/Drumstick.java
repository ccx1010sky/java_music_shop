package goods;
import shop.Accessory;
import shop.Instrument;


public class Drumstick extends Accessory{


    public Drumstick(String name, String color, String madeFrom, double sellPrice, double purchasePrice, Instrument instrument) {
        super(name, color, madeFrom, sellPrice, purchasePrice, instrument);
    }

    @Override
    public double calculateMakeup() {
        return 0;
    }
}
