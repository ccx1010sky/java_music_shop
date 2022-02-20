public class Instrument extends Stock {
    private String classification;

    public Instrument(String name, String color, String madeFrom, double sellPrice, double purchasePrice, String classification) {
        super(name, color, madeFrom, sellPrice, purchasePrice);
        this.classification = classification;
    }
}
