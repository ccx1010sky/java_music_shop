package goods;

import org.junit.Before;
import  goods.Drum;
import org.junit.Test;
import shop.Stock;

import static org.junit.Assert.*;

public class DrumstickTest {
    private Drumstick drumstick;
    private Drum drum;

    @Before
    public void before(){
        drumstick = new Drumstick("drumstick","grey","wood",20,10,drum);
    }

    @Test
    public void hasName(){
        assertEquals("drumstick",drumstick.getName());
    }
}