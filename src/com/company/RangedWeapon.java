package com.company;

public class RangedWeapon extends Weapon{
    int ammo;
    RangedWeapon(String itemName, int itemWeight, int damage, int ammo) {
        super(itemName, itemWeight, damage);
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }
    public void setAmmo(){
        this.ammo = ammo;
    }

    @Override
    public void durability() {
        super.durability();
    }
}
