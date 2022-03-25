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
        room1.getItems().add(new Item("skeleton",10));
        room1.getFood().add(new Food("Apple Pie",1,10));

        Room room2 = new Room();
        room2.setName("You're in room 2. ");
        room2.setDescription("There's a bunch of bunnies here.");
        room2.getItems().add(new Item("bunny",5));
        room2.getFood().add(new Food("carrot",1,5));

        Room room3 = new Room();
        room3.setName("You're in room 3. ");
        room3.setDescription("There's a bunch of alcohol here.");
        room3.getItems().add(new Item("alcohol",3));
        room3.getFood().add(new Food("rotten steak",1,-10));

        Room room4 = new Room();
        room4.setName("You're in room 4. ");
        room4.setDescription("There's a bunch of furniture here.");
        room4.getItems().add(new Item("furniture",50));
        room4.getFood().add(new Food("watermelon",1,15));

        Room room5 = new Room();
        room5.setName("You're in room 5. ");
        room5.setDescription("There's a bunch of GOLD here!!");
        room5.getItems().add(new Item("gold",100));
        room5.getFood().add(new Food("dead rat",1,-15));

        Room room6 = new Room();
        room6.setName("You're in room 6. ");
        room6.setDescription("There's a bunch of ruined books here.");
        room6.getItems().add(new Item("book",1));
        room6.getFood().add(new Food("old wine bottle",1,-25));

        Room room7 = new Room();
        room7.setName("You're in room 7. ");
        room7.setDescription("There's a bunch of lit candles here.");
        room7.getItems().add(new Item("candle",1));
        room7.getFood().add(new Food("sushi",1,20));

        Room room8 = new Room();
        room8.setName("You're in room 8. ");
        room8.setDescription("There's a bunch of nothing here.");

        Room room9 = new Room();
        room9.setName("You're in room 9. ");
        room9.setDescription("There's a bunch of wooden planks here.");
        room9.getItems().add(new Item("plank",3));
        room9.getFood().add(new Food("moldy bread",1,-5));

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