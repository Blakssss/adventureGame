package com.company;

import java.util.ArrayList;

public class Item {
    private ArrayList<Item> item = new ArrayList<>();
    Item skeleton;
    Item bunny;
    Item alcohol;
    Item furniture;
    Item GOLD;
    Item book;
    Item candle;
    Item food;

    public ArrayList<Item> item(){
        item.add(skeleton);
        item.add(bunny);
        item.add(alcohol);
        item.add(furniture);
        item.add(GOLD);
        item.add(book);
        item.add(candle);
        item.add(food);
        return item;
    }

    public ArrayList<Item> getItem() {
        return item;
    }

    public void setItem(ArrayList<Item> item) {
        this.item = item;
    }

    public Item getSkeleton() {
        return skeleton;
    }

    public void setSkeleton(Item skeleton) {
        this.skeleton = skeleton;
    }

    public Item getBunny() {
        return bunny;
    }

    public void setBunny(Item bunny) {
        this.bunny = bunny;
    }

    public Item getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Item alcohol) {
        this.alcohol = alcohol;
    }

    public Item getFurniture() {
        return furniture;
    }

    public void setFurniture(Item furniture) {
        this.furniture = furniture;
    }

    public Item getGOLD() {
        return GOLD;
    }

    public void setGOLD(Item GOLD) {
        this.GOLD = GOLD;
    }

    public Item getBook() {
        return book;
    }

    public void setBook(Item book) {
        this.book = book;
    }

    public Item getCandle() {
        return candle;
    }

    public void setCandle(Item candle) {
        this.candle = candle;
    }

    public Item getFood() {
        return food;
    }

    public void setFood(Item food) {
        this.food = food;
    }
    Item(){
        setSkeleton(skeleton);
        setBunny(bunny);
        setAlcohol(alcohol);
        setFurniture(furniture);
        setGOLD(GOLD);
        setBook(book);
        setCandle(candle);
        setFood(food);

    }
}
