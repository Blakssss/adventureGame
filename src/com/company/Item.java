package com.company;

import java.util.ArrayList;

public class Item {
    private ArrayList<Item> item = new ArrayList<>();
    String itemName;


    public ArrayList<Item> getItem() {
        return item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    Item(String name){
        this.itemName = name;}

}
