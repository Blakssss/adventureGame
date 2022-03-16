package com.company;
import java.util.Scanner;
public class Main {
    Scanner go = new Scanner(System.in);
    String where;
    //String unlock;
    Map map = new Map();
    public static void main (String[]args){
        Main main = new Main();
        main.theGame();
    }
    public void theGame() {
        map.makeMap();
        Room currentRoom = map.getStartRoom();


        System.out.println(currentRoom.getDescription());
        do {
            System.out.println(currentRoom.getName());
            where = go.nextLine();


            if (where.equalsIgnoreCase("east") || where.equalsIgnoreCase("e")) {
                if (currentRoom.getEast() == null){
                    System.out.println("You cannot go that way.");
                } else
                    currentRoom = currentRoom.getEast();

               /* if (currentRoom == room1 || currentRoom == room7){
                    System.out.println("The door is locked. do you wanna \"unlock\" it?");
                    unlock = go.nextLine();
                    if(unlock.equalsIgnoreCase("unlock")){
                        currentRoom = currentRoom.getEast();
                    }
                }*/

                if (currentRoom.getFirstTime()) {
                    System.out.println(currentRoom.getDescription());
                    currentRoom.setFirstTime(false);
                }

            } else if (where.equalsIgnoreCase("west") || where.equalsIgnoreCase("w")) {
                if (currentRoom.getWest() == null){
                    System.out.println("You cannot go that way.");
                }   else
                    currentRoom = currentRoom.getWest();

                if (currentRoom.getFirstTime()) {
                    System.out.println(currentRoom.getDescription());
                    currentRoom.setFirstTime(false);
                }

            } else if (where.equalsIgnoreCase("north") || where.equalsIgnoreCase("n")) {
                if (currentRoom.getNorth() == null){
                    System.out.println("You cannot go that way.");

                }
                else
                    currentRoom = currentRoom.getNorth();

               /* if (currentRoom == room8 || currentRoom == room6){
                    System.out.println("The door is locked. do you wanna \"unlock\" it?");
                    unlock = go.nextLine();
                    if(unlock.equalsIgnoreCase("unlock")){
                        currentRoom = currentRoom.getNorth();
                    }
                } */

                if (currentRoom.getFirstTime()) {
                    System.out.println(currentRoom.getDescription());
                    currentRoom.setFirstTime(false);
                }


            } else if (where.equalsIgnoreCase("south") || where.equalsIgnoreCase("s")) {
                if (currentRoom.getSouth() == null){
                    System.out.println("You cannot go that way.");
                }   else
                    currentRoom = currentRoom.getSouth();

                if (currentRoom.getFirstTime()) {
                    System.out.println(currentRoom.getDescription());
                    currentRoom.setFirstTime(false);
                }

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
        }while(!where.equals("exit"));
    }
}
