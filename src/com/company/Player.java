package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
  final String deadEnd = "You cannot go that way.";
  Map map = new Map();
  Room currentRoom = map.getStartRoom();
  ArrayList<Item> inventory = new ArrayList<>();
  private String where;

  public String getWhere() {
    return where;
  }

  public void userCommand() {
    Scanner go = new Scanner(System.in);
    where = go.nextLine().toLowerCase(Locale.ROOT);
  }

  public void take() {
      if (currentRoom.getItems() == null) {
        System.out.println("the room is empty");
      } else
        for (Item i : currentRoom.getItems()) {
          inventory.add(i);
        }

      if (currentRoom.getItems() == null) {
        System.out.println("the room is empty");
      } else
        currentRoom.getItems().remove(0);
      System.out.println(inventory);
    }

  public void dropItem() {
      System.out.println("which item to drop?");
      Scanner in = new Scanner(System.in);
      String komnu = in.nextLine();
      for (int i = 0; i < inventory.size(); i++) {
        if (inventory.get(i).getItemName().equals(komnu)) {
          currentRoom.dropItem(inventory.get(i));
          inventory.remove(i);
        }
      }
    }

    public void checkInventory () {
      if (inventory.size() > 0) {
        System.out.println("You check the contents of your bag and find: " + inventory);
      }
      else
          System.out.println("You check the contents of your bag and find nothing.");
    }
    public void north () {
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

    public void south () {
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

    public void west () {
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

    public void east () {
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

    public void look () {
      System.out.println("omg, we JUST told you." + currentRoom.getName() + currentRoom.getDescription());
    }

    public void findItem () {
      if (currentRoom.getName().equals("You're in room 8. ")) {
        System.out.println("We told you.. there's nothing here.");
      }
      else if (currentRoom.getItems().size() == 0){
            System.out.println("You look around and find nothing.");
      }
      else
        System.out.println("You look around and find " + currentRoom.getItems());
    }
  }