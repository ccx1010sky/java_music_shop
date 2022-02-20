package shop;

import behaviour.ISell;
import goods.Guitar;
import goods.Trumpet;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop1;
    private Guitar guitar;
    private Trumpet trumpet;

    private ArrayList<ISell> stock;

    @Before
    public void before(){
        shop1 = new Shop("shop1");
        guitar = new Guitar("guitar","blue","wood",200,100,"chordophone",6);
        trumpet = new Trumpet("Trumpet","black","metal",100.00,50.00,"Brass");
        stock = new ArrayList<>();
        }


    @Test
    public void hasName(){
        assertEquals("shop1",shop1.getName());
    }
    @Test
    public void canAddItem(){
        shop1.addItem(guitar);
        assertEquals(1,shop1.getStockCount());
    }
    @Test
    public void canRemoveItem(){
        shop1.addItem(guitar);
        shop1.addItem(trumpet);
        shop1.removeItem(guitar);
        assertEquals(1,shop1.getStockCount());
    }




}