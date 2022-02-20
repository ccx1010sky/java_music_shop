package goods;

import org.junit.Before;
import org.junit.Test;
import shop.Instrument;

import static org.junit.Assert.*;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("Trumpet","black","metal",100.00,50.00,"Brass");
    }
    @Test
    public void hasName(){
        assertEquals("Trumpet",trumpet.getName());
    }


}