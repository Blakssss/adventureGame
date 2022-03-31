package com.company;

public class Monster {
    private String name;
    private int healthPoint;
    private MonsterWeapon monsterWeapon;

    Monster(String name, int healthPoint, MonsterWeapon monsterWeapon){
        this.name = name;
        this.healthPoint = healthPoint;
        this.monsterWeapon = monsterWeapon;
    }

    public MonsterWeapon getMonsterWeapon() {
        return monsterWeapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }



}
