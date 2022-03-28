package com.company;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Player {
  Scanner go = new Scanner(System.in);
  Map map = new Map();
  Room currentRoom = map.getStartRoom();

  ArrayList<Item> inventory = new ArrayList<>();
  ArrayList<Weapon> equipment = new ArrayList<>();

  final String deadEnd = "You cannot go that way.";
  private String where;
  private int maxWeight = 100;
  private int HP = 100;
  int monsterHP;

  public int getHP() {
    return HP;
  }

  public String getWhere() {
    return where;
  }

  public void userCommand() {
    where = go.nextLine().toLowerCase(Locale.ROOT);
  }
  public void attack(){
    System.out.println("What do you wanna attack?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
    for (int i = 0; i < currentRoom.getMonster().size(); i++) {
      if (currentRoom.getMonster().get(i).getName().equals(where)) {
       monsterHP = currentRoom.getMonster().get(i).getHealthPoint();
       monsterHP = monsterHP - equipment.get(i).getDamage();
      maxWeight = maxWeight - currentRoom.getItems().get(i).getItemWeight();
      }
    }
    System.out.println("You hurt the monster! it's hp is now down to: " + monsterHP);
  }

  public void equip() {
    System.out.println("What do you wanna equip?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i).getItemName().equals(where)) {
        if (!(inventory.get(i) instanceof Weapon)) {
          System.out.println("That's not a weapon, you dummy!");
        }
        if (inventory.get(i) instanceof Weapon) {
          equipment.add((Weapon) inventory.get(i));
          inventory.remove(i);
          System.out.println("You've equipped the weapon. Time to SLAY!");
        }
      }
    }
  }

  public void unequip() {
    System.out.println("What do you wanna unequip?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
    for (int i = 0; i < equipment.size(); i++) {
      if (equipment.get(i).getItemName().equals(where)) {
          inventory.add(equipment.get(i));
          equipment.remove(i);
          System.out.println("The weapon is now back in your inventory");
        }
      }
    }

  public void take() {
    System.out.println("What do you wanna pick up?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
    if (currentRoom.getItems().size() == 0 && currentRoom.getWeapon().size() == 0 && currentRoom.getFood().size() == 0) {
      System.out.println("the room is empty");
    } else {
      System.out.println("Which item do you wanna pick up?");

      for (int i = 0; i < currentRoom.getItems().size(); i++) {
        if (currentRoom.getItems().get(i).getItemName().equals(where)) {
          inventory.add(currentRoom.getItems().get(i));
          maxWeight = maxWeight - currentRoom.getItems().get(i).getItemWeight();
        }
      }
      for (int i = 0; i < currentRoom.getFood().size(); i++) {
        if (currentRoom.getFood().get(i).getItemName().equals(where)) {
          inventory.add(currentRoom.getFood().get(i));
          maxWeight = maxWeight - currentRoom.getFood().get(i).getItemWeight();
        }
      }
      for (int i = 0; i < currentRoom.getWeapon().size(); i++) {
        if (currentRoom.getWeapon().get(i).getItemName().equals(where)) {
          inventory.add(currentRoom.getWeapon().get(i));
          maxWeight = maxWeight - currentRoom.getWeapon().get(i).getItemWeight();
        }
      }
      System.out.println("Taking this item puts your remaining max weight at: " + maxWeight);
      System.out.println("Your bag now contains: " + inventory);
      currentRoom.getItems().removeAll(inventory);
      currentRoom.getFood().removeAll(inventory);
      currentRoom.getWeapon().removeAll(inventory);

      while (maxWeight < 0) {
        System.out.println("You're carrying so much, you can't even move! You have to drop something.");
        dropItem();
      }
    }
  }

  public void eat() {
    System.out.println("What you do you wanna eat?");
    where = go.nextLine().toLowerCase(Locale.ROOT);
    for (int i = 0; i < inventory.size(); i++) {
      if (inventory.get(i).getItemName().equals(where)) {
        if(!(inventory.get(i) instanceof Food)) {
          System.out.println("That's not food, you dummy!");
        }
        if (inventory.get(i) instanceof Food) {
          HP = HP + ((Food) inventory.get(i)).foodHealth;
          maxWeight = maxWeight + inventory.get(i).getItemWeight();
          inventory.remove(i);
        }
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

  public void checkInventory() {
    if (inventory.size() > 0) {
      System.out.println("You check the contents of your bag and find: " + inventory + "\nSensing the weight of your bag you feel your remaining max weight must be: " + maxWeight);
    } else
      System.out.println("You check the contents of your bag and find nothing.");
  }

  public void north() {
    if (where.equals("north") || where.equals("n")) {
      if (currentRoom.getLock()) {
        locked();
      }
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

  public void south() {
    if (where.equals("south") || where.equals("s")) {
      if (currentRoom.getLock()) {
        locked();
      }
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

  public void west() {
    if (where.equals("west") || where.equals("w")) {
      if (currentRoom.getLock()) {
        locked();
      }
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

  public void east() {
    if (where.equals("east") || where.equals("e")) {
      if (currentRoom.getLock()) {
        locked();
      }
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


  public void look() {
    System.out.println("omg, we JUST told you." + currentRoom.getName() + currentRoom.getDescription());
  }

  public void findItem() {
    if (currentRoom.getName().equals("You're in room 8. ")) {
      System.out.println("We told you.. there's nothing here.");
    } else if (currentRoom.getItems().size() == 0 && currentRoom.getFood().size() == 0 && currentRoom.getWeapon().size() == 0) {
      System.out.println("You look around and find nothing.");
    } else
      System.out.println("You look around and find " + currentRoom.getItems() + currentRoom.getFood() + currentRoom.getWeapon());
  }

  public void locked() {
    if (currentRoom.setLock(true)) {
      System.out.println("the door is locked, enter password");
      String answer = go.nextLine();
      if (answer.equals("iddqd")) {
        currentRoom.setLock(false);
        System.out.println("room is now unlocked");
        currentRoom.getEast();
      }
      if (!answer.equals("iddqd")) {
        System.out.println("you go back to the previous room");
        if (where.equals("east")) {
          currentRoom = currentRoom.getWest();
        } else if (where.equals("west")) {
          currentRoom = currentRoom.getEast();
        } else if (where.equals("north")) {
          currentRoom = currentRoom.getSouth();
        } else if (where.equals("south")) {
          currentRoom = currentRoom.getNorth();
        }
      }
    }
  }
}