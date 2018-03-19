package items;

public abstract class Item {

    private String type;
    private String colour;
    protected int buyprice;
    protected int sellprice;

    public Item(String type, String colour, int buyprice, int sellprice) {
        this.type = type;
        this.colour = colour;
        this.buyprice = buyprice;
        this.sellprice = sellprice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
