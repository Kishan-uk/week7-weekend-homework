package instruments;

public abstract class Instrument {

    private String colour;
    private String material;
    private String type;
    protected int buyprice;
    protected int sellprice;

    public Instrument(String colour, String material, String type, int buyprice, int sellprice) {
        this.colour = colour;
        this.material = material;
        this.type = type;
        this.buyprice = buyprice;
        this.sellprice = sellprice;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
