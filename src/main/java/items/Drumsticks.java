package items;

import actions.ISell;

public class Drumsticks extends Item implements ISell {

    private int numberofsticks;

    public Drumsticks(String type, String colour, int buyprice, int sellprice, int numberofsticks) {
        super(type, colour, buyprice, sellprice);
        this.numberofsticks = numberofsticks;
    }

    public int calculateMarkup() {
        return sellprice - buyprice;
    }

    public int getNumberofsticks() {
        return numberofsticks;
    }

    public void setNumberofsticks(int numberofsticks) {
        this.numberofsticks = numberofsticks;
    }

}
