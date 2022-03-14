package com.company;

import java.util.Scanner;

public class Main {

  // public Room currentRoom(){
  // }
  public static void main(String[] args) {
    Main main = new Main();
    main.theGame();
  }

  public void theGame() {
    System.out.println("Welcome to Adventure game, you start of at the start of the dungeon in room 1");
    Scanner go = new Scanner(System.in);
    Room room1 = new Room("You're in room 1. ", "There's a bunch of skeletons here");
    Room room2 = new Room("You're in room 2. ", "There's a bunch of bunnies here");
    Room room3 = new Room("You're in room 3. ", "There's a bunch of gold here");
    Room room4 = new Room("You're in room 4. ", "There's a bunch of furniture here");
    Room room5 = new Room("You're in room 5. ", "There's a bunch of GOLD here!!");
    Room room6 = new Room("You're in room 6. ", "There's a bunch of ruined books here");
    Room room7 = new Room("You're in room 7. ", "There's a bunch of lit candles here");
    Room room8 = new Room("You're in room 8. ", "There's a bunch of nothing here");
    Room room9 = new Room("You're in room 9. ", "There's a bunch of rotten food here");

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

    Room currentRoom = room1;


    while (true) {
      String where = go.nextLine();
      if (where.equalsIgnoreCase("east") || where.equalsIgnoreCase("e")) {
        currentRoom = currentRoom.getEast();
      } else if (where.equalsIgnoreCase("west") || where.equalsIgnoreCase("w")) {
        currentRoom = currentRoom.getWest();
      } else if (where.equalsIgnoreCase("north") || where.equalsIgnoreCase("n")) {
        currentRoom = currentRoom.getNorth();
      } else if (where.equalsIgnoreCase("south") || where.equalsIgnoreCase("s")) {
        currentRoom = currentRoom.getSouth();
      } else if (currentRoom == null) {
        System.out.println("that path is not available, try again!");
      }
      if (where.equals("exit")) {
        System.out.println("Thank you for playing.");
      }
      if (where.equals("help")) {
        System.out.println("Your commands are as follows:" +
            "\ntype \"east\" to go to the room to the east." +
            "\ntype \"west\" to go to the room to the west." +
            "\ntype \"north\" to go the room to the north." +
            "\ntype \"south\" to go to the room to the south." +
            "\ntype \"help\" to all of this information again." +
            "\ntype \"look\" to ge the room description again." +
            "\ntype \"exit\" to exit this fun fun fun game.  ");
      }
      if (where.equals("look")) {
        System.out.println("omg, we JUST told you." + currentRoom.getName() + currentRoom.getDescription());
      }
      System.out.println(currentRoom.getName());
      System.out.println(currentRoom.getDescription());

    }
  }
}