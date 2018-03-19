import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("Amber natural", "Mahogany","electric",
                "Gibson",  4, 99, 149);
    }

    @Test
    public void guitarHaveColour(){
        assertEquals("Amber natural", guitar.getColour());
    }


    @Test
    public void guitarMaterial(){
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void guitarType(){
        assertEquals("electric", guitar.getType());
    }

    @Test
    public void guitarHasStrings(){
        assertEquals(4, guitar.getStrings());
    }

    @Test
    public void guitarMake(){
        assertEquals("Gibson", guitar.getMake());
    }

    @Test
    public void guitarMarkup(){
        assertEquals(50, guitar.calculateMarkup());
    }

    @Test
    public void guitarCanPlaySound(){
        assertEquals("Boing!", guitar.play());
    }


}
