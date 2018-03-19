import items.Sheetmusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SheetmusicTest {

    Sheetmusic sheetmusic;

    @Before
    public void before(){
        sheetmusic = new Sheetmusic("music accessory", "white", 4,6, "Symphony No. 9 ");
    }

    @Test
    public void sheetmusicType(){
        assertEquals("music accessory", sheetmusic.getType());
    }

    @Test
    public void sheetmusicHaveColour(){
        assertEquals("white", sheetmusic.getColour());
    }

    @Test
    public void sheetmusicHasSong(){
        assertEquals("Symphony No. 9 ", sheetmusic.getSong());
    }

    @Test
    public void sheetmusicMarkup(){
        assertEquals(2, sheetmusic.calculateMarkup());
    }
}
