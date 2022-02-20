package shop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop1;

    @Before
    public void before(){
        shop1 = new Shop("shop1");
    }

    @Test
    public void hasName(){
        assertEquals("shop1",shop1.getName());
    }


}