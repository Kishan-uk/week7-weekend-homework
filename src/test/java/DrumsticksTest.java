import items.Drumsticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumsticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks("drum kit accessory", "Beige", 10,15, 2);
    }

    @Test
    public void drumsticksType(){
        assertEquals("drum kit accessory", drumsticks.getType());
    }

    @Test
    public void drumsticksHaveColour(){
        assertEquals("Beige", drumsticks.getColour());
    }

    @Test
    public void drumsticksNumberOf(){
        assertEquals(2, drumsticks.getNumberofsticks());
    }

    @Test
    public void drumsticksMarkup(){
        assertEquals(5, drumsticks.calculateMarkup());
    }
}
