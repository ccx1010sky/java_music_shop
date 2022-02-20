package goods;

import org.junit.Before;
import shop.Instrument;

import static org.junit.Assert.*;

public class TrumpetTest {

    private Trumpet Trumpet;

    @Before
    public void before(){
        Trumpet = new Trumpet("Trumpet","black","metal",100.00,50.00,"Brass");
    }


}