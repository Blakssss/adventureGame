package com.company;

public class Monster {
    private String name;
    private int damage;
    private int healthPoint;
    Monster(String name, int damage, int healthPoint){
        this.name = name;
        this.damage = damage;
        this.healthPoint = healthPoint;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
}
