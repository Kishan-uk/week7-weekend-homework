package shop;

import actions.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public int countStock() {
        return stock.size();
    }

    public void addStock(ISell stock) {
        this.stock.add(stock);
    }

    public void removeStock() {
        this.stock.clear();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
