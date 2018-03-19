import instruments.Bagpipes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BagpipesTest {

    Bagpipes bagpipes;

    @Before
    public void before() {
        bagpipes = new Bagpipes("Tartan", "Sheep skin","Great Highland",
                3,  "Connor Macleod's Bagpipe Co", 15, 25);
    }

    @Test
    public void bagpipesHaveColour(){
        assertEquals("Tartan", bagpipes.getColour());
    }


    @Test
    public void bagpipesMaterial(){
        assertEquals("Sheep skin", bagpipes.getMaterial());
    }

    @Test
    public void bagpipesType(){
        assertEquals("Great Highland", bagpipes.getType());
    }

    @Test
    public void bagpipesHasPipes(){
        assertEquals(3, bagpipes.getPipes());
    }

    @Test
    public void bagpipesMake(){
        assertEquals("Connor Macleod's Bagpipe Co", bagpipes.getMake());
    }

    @Test
    public void bagpipesMarkup(){
        assertEquals(10, bagpipes.calculateMarkup());
    }

    @Test
    public void bagpipesCanPlaySound(){
        assertEquals("Loud annoying noise", bagpipes.play());
    }


}
