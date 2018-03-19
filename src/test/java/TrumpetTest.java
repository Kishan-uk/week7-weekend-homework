import instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet("Black", "Brass","A",
                150,  199, 3,"Yamaha");
    }

    @Test
    public void trumpetHaveColour(){
        assertEquals("Black", trumpet.getColour());
    }


    @Test
    public void trumpetMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void trumpetType(){
        assertEquals("A", trumpet.getType());
    }

    @Test
    public void trumpetHasValves(){
        assertEquals(3, trumpet.getValves() );
    }

    @Test
    public void trumpetMake(){
        assertEquals("Yamaha", trumpet.getMake());
    }

    @Test
    public void trumpetMarkup(){
        assertEquals(49, trumpet.calculateMarkup());
    }

    @Test
    public void trumpetCanPlaySound(){
        assertEquals("Zonk!", trumpet.play());
    }


}
