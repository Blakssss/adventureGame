package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        Room room1 = new Room("You're in room 1","There's a bunch of skeletons here");
        Room room2 = new Room("You're in room 2","There's a bunch of bunnies here");
        Room room3 = new Room("You're in room 3","There's a bunch of gold here");
        Room room4 = new Room("You're in room 4","There's a bunch of furniture here");
        Room room5 = new Room("You're in room 5","There's a bunch of GOLD here!!");
        Room room6 = new Room("You're in room 6","There's a bunch of ruined books here");
        Room room7 = new Room("You're in room 7","There's a bunch of lit candles here");
        Room room8 = new Room("You're in room 8","There's a bunch of nothing here");
        Room room9 = new Room("You're in room 9","There's a bunch of rotten food here");
        Room currentRoom = room1;
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.setNorth(null);
        room1.setWest(null);
        room2.setEast(room3);
        room2.setSouth(null);
        room2.setNorth(null);
        room2.setWest(room1);
        room3.setEast(null);
        room3.setSouth(room6);
        room3.setNorth(null);
        room3.setWest(room2);
        room4.setEast(null);
        room4.setSouth(room7);
        room4.setNorth(room1);
        room4.setWest(null);
        room5.setEast(null);
        room5.setSouth(room8);
        room5.setNorth(null);
        room5.setWest(null);
        room6.setEast(null);
        room6.setSouth(room9);
        room6.setNorth(room3);
        room6.setWest(null);
        room7.setEast(room8);
        room7.setSouth(null);
        room7.setNorth(room4);
        room7.setWest(null);
        room8.setEast(room9);
        room8.setSouth(null);
        room8.setNorth(room5);
        room8.setWest(room7);
        room9.setEast(null);
        room9.setSouth(null);
        room9.setNorth(room6);
        room9.setWest(room8);

        String where = go.nextLine();
        if (where.equals("east")){

        }
        if (where.equals("west")){

        }
        if (where.equals("north")){

        }
        if (where.equals("south")){

        }
        if (where.equals("exit")){
            System.out.println("Thank you for playing.");
        }
        if (where.equals("help")){
            System.out.println("you stupid or something?");
        }
        if (where.equals("look")){
            System.out.println("omg, we JUST told you." + currentRoom);
        }




        System.out.println(room1.getName());
        System.out.println(room1.getDescription());
        System.out.println(currentRoom.getName());

    }
}
