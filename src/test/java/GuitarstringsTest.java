import items.Guitarstrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class GuitarstringsTest {

    Guitarstrings guitarstrings;

    @Before
    public void before(){
        guitarstrings = new Guitarstrings("guitar accessory", "clear", 5,8, 2);
    }

    @Test
    public void guitarstringsType(){
        assertEquals("guitar accessory", guitarstrings.getType());
    }

    @Test
    public void guitarstringsHaveColour(){
        assertEquals("clear", guitarstrings.getColour());
    }

    @Test
    public void guitarstringsNumberOf(){
        assertEquals(2, guitarstrings.getNumberofstrings());
    }

    @Test
    public void guitarstringsMarkup(){
        assertEquals(3, guitarstrings.calculateMarkup());
    }
}
