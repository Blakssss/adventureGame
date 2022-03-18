package com.company;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
    private ArrayList<Item> item = new ArrayList<>();
    final String deadEnd = "You cannot go that way.";
    Map map = new Map();
    Room currentRoom = map.getStartRoom();
    private String where;
    public String getWhere(){
        return where;
    }
    public void userCommand() {
        Scanner go = new Scanner(System.in);
        where = go.nextLine().toLowerCase(Locale.ROOT);
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
    public void east(){
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
}