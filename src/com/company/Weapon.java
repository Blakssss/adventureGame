package com.company;

abstract class Weapon extends Item{
    private int damage;
    private int ammoCount;
    Weapon(String itemName, int itemWeight, int damage) {
        super(itemName, itemWeight);
        this.damage= damage;
        setAmmoCount(ammoCount);
    }

    public int getDamage() {
        return damage;
    }

    public void setAmmoCount(int ammoCount) {
        ammoCount--;
        this.ammoCount = ammoCount;
    }
   public void durability(){
       System.out.println("you have " + ammoCount + "shots left.");
    }
}