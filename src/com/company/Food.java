package com.company;

public class Food extends Item {
    int foodHealth;
    Food(String itemName, int itemWeight, int foodHealth){
        super(itemName, itemWeight);
        this.foodHealth = foodHealth;
    }

    public int getFoodHealth() {
        return foodHealth;
    }
}
