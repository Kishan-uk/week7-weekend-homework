package instruments;

import actions.IPlay;
import actions.ISell;

public class Guitar extends Instrument implements IPlay, ISell{

    private String make;
    private int strings;

    public Guitar(String colour, String material, String type, String make, int strings, int buyprice, int sellprice) {
        super(colour, material, type, buyprice, sellprice);
        this.strings = strings;
        this.make = make;
    }

    public String play(){
        return "Boing!";
    }

    public int calculateMarkup(){
        return sellprice - buyprice;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

}