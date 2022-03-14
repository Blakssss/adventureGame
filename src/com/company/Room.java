package com.company;

public class Room {
    private String name;
    private String description;
    private Room currentRoom;
    private Room east;
    private Room south;
    private Room north;
    private Room west;

    void setWest(Room west){
        this.west=west;
    }
    void setNorth(Room north){
        this.north=north;
    }
    void setSouth(Room south){
        this.south=south;
    }
    void setEast(Room east){
        this.east=east;
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
    Room getWest(){
        return west;
    }
    Room getNorth(){
        return north;
    }
    Room getEast(){
        return east;
    }
    Room getSouth(){
        return south;
    }

    Room(String name, String description){
        setDescription(description);
        setName(name);
        setCurrentRoom(currentRoom);
        setEast(east);
        setSouth(south);
        setNorth(north);
        setWest(west);
        //getEast();
        //getCurrentRoom();
    }
}

