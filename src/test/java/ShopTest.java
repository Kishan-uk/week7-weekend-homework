import instruments.Bagpipes;
import org.junit.Test;
import shop.Shop;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    Bagpipes bagpipes;

    @Before
    public void before(){
        shop = new Shop("Ray's music exchange");
    }

    @Test
    public void shopName(){
        assertEquals("Ray's music exchange", shop.getName());
    }

    @Test
    public void stockIsZero(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddItem() {
        shop.addStock(bagpipes);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void canRemoveItem() {
        shop.addStock(bagpipes);
        shop.removeStock();
        assertEquals(0,shop.countStock());
    }

}
