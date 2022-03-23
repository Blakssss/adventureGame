package com.company;

public class Item {
    private String itemName;
    private int itemWeight;

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setItemWeight(int itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemWeight() {
        return itemWeight;
    }

    Item(String itemName, int itemWeight) {
        setItemName(itemName);
        setItemWeight(itemWeight);
    }

    @Override
    public String toString() {
        return itemName;
    }
}