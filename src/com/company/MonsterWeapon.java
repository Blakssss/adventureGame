package com.company;

public class MonsterWeapon extends Weapon{
private int damage;
    MonsterWeapon(String itemName, int itemWeight, int damage){
        super(itemName, itemWeight,damage);
        this.damage = damage;

    }
}
