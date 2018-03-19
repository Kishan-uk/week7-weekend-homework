package items;

import actions.ISell;

public class Sheetmusic extends Item implements ISell {

    private String song;

    public Sheetmusic(String type, String colour, int buyprice, int sellprice, String song) {
        super(type, colour, buyprice, sellprice);
        this.song = song;
    }

    public int calculateMarkup() {
        return sellprice - buyprice;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
