package com.company;

abstract class Weapon extends Item{
    int damage;
    Weapon(String itemName, int itemWeight, int damage) {
        super(itemName, itemWeight);
        this.damage= damage;
    }

    public int getDamage() {
        return damage;
    }
}
