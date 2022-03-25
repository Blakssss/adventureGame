package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
  Scanner go = new Scanner(System.in);
  final String deadEnd = "You cannot go that way.";
  Map map = new Map();
  Room currentRoom = map.getStartRoom();
  ArrayList<Item> inventory = new ArrayList<>();
  ArrayList<Food> foodBag = new ArrayList<>();
  private String where;
  private int maxWeight = 100;
  private int HP = 100;

  public int getHP() {
    return HP;
  }

  public String getWhere() {
    return where;
    }

  public void userCommand() {
    where = go.nextLine().toLowerCase(Locale.ROOT);
    }
  public void takeFood() {
    System.out.println("What food do you wanna pick up?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
    for (int i = 0; i < currentRoom.getFood().size(); i++) {
      if (currentRoom.getFood().get(i).getItemName().equals(where)) {
        foodBag.add(currentRoom.getFood().get(i));
        maxWeight = maxWeight - currentRoom.getFood().get(i).getItemWeight();
      }
    }
    System.out.println("Taking this food item puts your remaining max weight at: " + maxWeight);
    System.out.println("Your bag now contains: " + inventory + foodBag);
    currentRoom.getFood().removeAll(foodBag);
    while(maxWeight < 0){
      System.out.println("You're carrying so much, you can't even move! You have to drop something.");
      //dropItem();
    }
  }
  public void eat(){
    System.out.println("What you do you wanna eat?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
    for (int i = 0; i < foodBag.size(); i++) {
      if (foodBag.get(i).getItemName().equals(where)) {
        //HP = HP + foodBag.get(i).getFoodHealth;
        maxWeight = maxWeight + foodBag.get(i).getItemWeight();
        foodBag.remove(i);
      }
    }
  }

  public void take() {
    if (currentRoom.getItems().size() == 0) {
      System.out.println("the room is empty");
    } else {
      System.out.println("Which item do you wanna pick up?");
      where = go.nextLine().toLowerCase(Locale.ROOT);
      for (int i = 0; i < currentRoom.getItems().size(); i++) {
        if (currentRoom.getItems().get(i).getItemName().equals(where)) {
          inventory.add(currentRoom.getItems().get(i));
          maxWeight = maxWeight - currentRoom.getItems().get(i).getItemWeight();
        }
      }
      System.out.println("Taking this item puts your remaining max weight at: " + maxWeight);
      System.out.println("Your bag now contains: " + inventory);
      currentRoom.getItems().removeAll(inventory);
      while(maxWeight < 0){
        System.out.println("You're carrying so much, you can't even move! You have to drop something.");
        dropItem();
      }
    }
  }

  public void dropItem() {
      System.out.println("Which item do you wanna drop?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
      for (int i = 0; i < inventory.size(); i++) {
        if (inventory.get(i).getItemName().equals(where)) {
          currentRoom.dropItem(inventory.get(i));
          maxWeight = maxWeight + inventory.get(i).getItemWeight();
          inventory.remove(i);
        }
      }
    System.out.println("You see the room now contains: " + currentRoom.getItems() + "\nDropping this item puts your max weight at: " + maxWeight);
  }

  public void checkInventory () {
      if (inventory.size() > 0) {
        System.out.println("You check the contents of your bag and find: " + inventory + "\nSensing the weight of your bag you feel your remaining max weight must be: " + maxWeight);
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
      else if (currentRoom.getItems().size() == 0 && currentRoom.getFood().size() == 0){
            System.out.println("You look around and find nothing.");
      }
      else
        System.out.println("You look around and find " + currentRoom.getItems() + currentRoom.getFood());
    }
  }
