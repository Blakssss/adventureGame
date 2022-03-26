package com.company;

import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room currentRoom;
    private Room lastRoom;
    private Room east;
    private Room south;
    private Room north;
    private Room west;
    private boolean firstTime = true;
    private ArrayList<Item> items = new ArrayList<>(9);
    private ArrayList<Food> food = new ArrayList<>();
    private boolean lock = true;

    public ArrayList<Food> getFood() {
        return food;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void dropItem(Item item) {
        items.add(item);
    }

    void setWest(Room west) {
        this.west = west;
    }

    void setNorth(Room north) {
        this.north = north;
    }

    void setSouth(Room south) {
        this.south = south;
    }

    void setEast(Room east) {
        this.east = east;
    }

    void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    void setName(String name) {
        this.name = name;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setFirstTime(boolean firstTime) {
        this.firstTime = firstTime;
    }

    String getName() {
        return name;
    }

    String getDescription() {
        return description;
    }

    Room getWest() {
        return west;
    }

    Room getNorth() {
        return north;
    }

    Room getEast() {
        return east;
    }

    Room getSouth() {
        return south;
    }

    boolean getFirstTime() {
        return firstTime;
    }

    public boolean setLock(boolean lock) {
        this.lock = lock;
        return lock;
    }

    public boolean getLock() {
        return lock;
    }

    public boolean setUnlock() {
        this.lock = true;
        return lock;
    }

    public Room setLastRoom(Room lastRoom) {
        this.lastRoom = lastRoom;
        return lastRoom;
    }

    Room() {
        setCurrentRoom(currentRoom);
        setEast(east);
        setSouth(south);
        setNorth(north);
        setWest(west);
        setFirstTime(firstTime);
        setLock(false);
        setLastRoom(lastRoom);

    }
}



