package com.company;

public class Map {
    Room startRoom = makeMap();

    public Room getStartRoom() {
        return startRoom;
    }

    public Room makeMap(){
        Room room1 = new Room();
        room1.setName("You're in room 1. ");
        room1.setDescription("There's a bunch of skeletons here.");
        room1.getItem().add(new Item("skeleton"));

        Room room2 = new Room();
        room2.setName("You're in room 2. ");
        room2.setDescription("There's a bunch of bunnies here.");
        room2.getItem().add(new Item("bunny"));

        Room room3 = new Room();
        room3.setName("You're in room 3. ");
        room3.setDescription("There's a bunch of alcohol here.");
        room3.getItem().add(new Item("alcohol"));

        Room room4 = new Room();
        room4.setName("You're in room 4. ");
        room4.setDescription("There's a bunch of furniture here.");
        room4.getItem().add(new Item("furniture"));

        Room room5 = new Room();
        room5.setName("You're in room 5. ");
        room5.setDescription("There's a bunch of GOLD here!!");
        room5.getItem().add(new Item("GOLD"));

        Room room6 = new Room();
        room6.setName("You're in room 6. ");
        room6.setDescription("There's a bunch of ruined books here.");
        room6.getItem().add(new Item("book"));

        Room room7 = new Room();
        room7.setName("You're in room 7. ");
        room7.setDescription("There's a bunch of lit candles here.");
        room7.getItem().add(new Item("candle"));

        Room room8 = new Room();
        room8.setName("You're in room 8. ");
        room8.setDescription("There's a bunch of nothing here.");

        Room room9 = new Room();
        room9.setName("You're in room 9. ");
        room9.setDescription("There's a bunch of rotten food here.");
        room9.getItem().add(new Item("food"));

        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setEast(room3);
        room2.setWest(room1);
        room3.setSouth(room6);
        room3.setWest(room2);
        room4.setSouth(room7);
        room4.setNorth(room1);
        room5.setSouth(room8);
        room6.setSouth(room9);
        room6.setNorth(room3);
        room7.setEast(room8);
        room7.setNorth(room4);
        room8.setEast(room9);
        room8.setNorth(room5);
        room8.setWest(room7);
        room9.setNorth(room6);
        room9.setWest(room8);
        return room1;
    }
}