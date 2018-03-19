package instruments;

import actions.IPlay;
import actions.ISell;

public class Bagpipes extends Instrument implements IPlay, ISell{

    private String make;
    private int pipes;

    public Bagpipes(String colour, String material, String type, int pipes, String make, int buyprice,
                    int sellprice) {
        super(colour, material, type, buyprice, sellprice);
        this.pipes = pipes;
        this.make = make;
    }

    public String play(){
        return "Loud annoying noise";
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

    public int getPipes() {
        return pipes;
    }

    public void setStrings(int pipes) {
        this.pipes = pipes;
    }

}