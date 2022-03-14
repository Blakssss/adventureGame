package com.company;

public class Room {
    private  String name;
    private  String description;
    private Room currentRoom;
    private Room east;
    private Room south;
    private Room north;
    private Room west;

    void setWest(Room west){

    }
    void setNorth(Room north){

    }
    void setSouth(Room south){

    }
    void setEast(Room east){

    }
    void setCurrentRoom(Room currentRoom){
        this.currentRoom=currentRoom;
    }
    void setName(String name){
        this.name=name;
    }
    void setDescription(String description){
        this.description=description;
    }
    Room getCurrentRoom(){
        return currentRoom;
    }
    String getName(){
        return name;
    }
    String getDescription(){
        return description;
    }
    Room(String name, String description){
        setDescription(description);
        setName(name);
        setCurrentRoom(currentRoom);
    }
}

