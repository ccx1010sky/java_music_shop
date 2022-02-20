public abstract class Accessory extends Stock{
    private Instrument instruments;

    public Accessory(String name, String color, String madeFrom, double sellPrice, double purchasePrice, Instrument instruments) {
        super(name, color, madeFrom, sellPrice, purchasePrice);
        this.instruments = instruments;
    }
}
