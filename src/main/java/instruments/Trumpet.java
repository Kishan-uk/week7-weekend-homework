package instruments;

import actions.IPlay;
import actions.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private String make;
    private int valves;

    public Trumpet(String colour, String material, String type, int buyprice, int sellprice, int valves, String make) {
        super(colour, material, type, buyprice, sellprice);
        this.valves = valves;
        this.make = make;
    }

    public String play() {
        return "Zonk!";
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

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

}
