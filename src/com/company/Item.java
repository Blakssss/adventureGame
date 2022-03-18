package com.company;

import java.util.ArrayList;

public class Item {
    private ArrayList<Item> item = new ArrayList<>();
    private String itemName;


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    Item(String itemName) {
        setItemName(itemName);
    }

    @Override
    public String toString() {
        return itemName;
    }
}