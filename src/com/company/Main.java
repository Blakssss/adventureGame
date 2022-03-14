package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner go = new Scanner(System.in);
        String where = go.nextLine();
        if (where.equals("east")){

        }
        if (where.equals("west")){

        }
        if (where.equals("north")){

        }
        if (where.equals("south")){

        }
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

        System.out.println(room1.getName());
        System.out.println(room1.getDescription());
        System.out.println(currentRoom.getName());


    }
}
