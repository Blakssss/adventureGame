package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
    final String deadEnd = "You cannot go that way.";
    private String where;
    Item item = new Item("we");
    Map map = new Map();
    Room currentRoom = map.getStartRoom();
    ArrayList<String> inventory = new ArrayList<>();


    public String getWhere() {
        return where;
    }

    public void userCommand() {
        Scanner go = new Scanner(System.in);
        where = go.nextLine().toLowerCase(Locale.ROOT);
    }

    public void take(){
    if (where.equals("take")){
        inventory.add(currentRoom.getItem().toString());
        currentRoom.getItem().remove(0);
        System.out.println(inventory);
        }
    }
    public void checkInventory(){
        if(where.equals("inventory")){
            System.out.println("You check the contents of your bag and find: " + inventory);
        }
    }
    public void north() {
        if (where.equals("north") || where.equals("n")) {
            if (currentRoom.getNorth() == null) {
                System.out.println(deadEnd);
            } else
                currentRoom = currentRoom.getNorth();
            System.out.println(currentRoom.getName());
            if (currentRoom.getFirstTime()) {
                System.out.println(currentRoom.getDescription());
                currentRoom.setFirstTime(false);
            }
        }
    }

    public void south() {
        if (where.equals("south") || where.equals("s")) {
            if (currentRoom.getSouth() == null) {
                System.out.println(deadEnd);
            } else
                currentRoom = currentRoom.getSouth();
            System.out.println(currentRoom.getName());
            if (currentRoom.getFirstTime()) {
                System.out.println(currentRoom.getDescription());
                currentRoom.setFirstTime(false);
            }
        }
    }

    public void west() {
        if (where.equals("west") || where.equals("w")) {
            if (currentRoom.getWest() == null) {
                System.out.println(deadEnd);
            } else
                currentRoom = currentRoom.getWest();
            System.out.println(currentRoom.getName());
            if (currentRoom.getFirstTime()) {
                System.out.println(currentRoom.getDescription());
                currentRoom.setFirstTime(false);
            }
        }
    }

    public void east() {
        if (where.equals("east") || where.equals("e")) {
            if (currentRoom.getEast() == null) {
                System.out.println(deadEnd);
            } else
                currentRoom = currentRoom.getEast();
            System.out.println(currentRoom.getName());
            if (currentRoom.getFirstTime()) {
                System.out.println(currentRoom.getDescription());
                currentRoom.setFirstTime(false);
            }
        }
    }

    public void look() {
        System.out.println("omg, we JUST told you." + currentRoom.getName() + currentRoom.getDescription());
    }

    public void findItem() {
        if(currentRoom.getName().equals("You're in room 8. ")){
            System.out.println("We told you.. there's nothing here.");
        }else
        System.out.println("You look around and find " + currentRoom.getItem());
    }
}