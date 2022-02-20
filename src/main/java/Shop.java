import behaviour.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }
}
