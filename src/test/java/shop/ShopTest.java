package shop;

import behaviour.ISell;
import goods.Guitar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop1;
    private Guitar guitar;
    private ArrayList<ISell> stock;

    @Before
    public void before(){
        shop1 = new Shop("shop1");
        guitar = new Guitar("guitar","blue","wood",200,100,"chordophone",6);
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




}