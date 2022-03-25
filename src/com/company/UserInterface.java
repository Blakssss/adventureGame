package com.company;

public class UserInterface {
    Map map = new Map();
    Room currentRoom = map.getStartRoom();
    Player player = new Player();

    public void hello(){
        System.out.println("Welcome to the dungeon of doom. " + currentRoom.getName() + currentRoom.getDescription());
    }
    public void help(){
            System.out.println("""
                    Your commands are as follows:
                    type east to go to the room to the east.
                    type west to go to the room to the west.
                    type north to go the room to the north.
                    type south to go to the room to the south.
                    type help to all of this information again.
                    type look to ge the room description again.
                    type exit to exit this fun fun fun game.""");
    }
    public void health(){
        System.out.println("Your current health is at: " + player.getHP());
        if(player.getHP() == 100){
            System.out.println("You're in perfect health!");
        }
        else if(player.getHP() < 100 && player.getHP() >= 75){
            System.out.println("You're doing pretty good. Keep going.");
        }
        else if(player.getHP() < 75 && player.getHP() >= 25){
            System.out.println("You're starting to look pretty banged up. You should eat some.");
        }
        else
            System.out.println("Jesus! You're almost dead! Get some food quick!");
    }
    public void exit(){
            System.out.println("Thank you for playing.");
    }

}

