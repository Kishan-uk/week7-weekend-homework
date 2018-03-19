package items;

import actions.ISell;

public class Guitarstrings extends Item implements ISell {

    private int numberofstrings;

    public Guitarstrings(String type, String colour, int buyprice, int sellprice, int numberofstrings) {
        super(type, colour, buyprice, sellprice);
        this.numberofstrings = numberofstrings;
    }

    public int calculateMarkup() {
        return sellprice - buyprice;
    }

    public int getNumberofstrings() {
        return numberofstrings;
    }

    public void setNumberofstrings(int numberofstrings) {
        this.numberofstrings = numberofstrings;
    }

}
