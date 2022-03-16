package com.company;

public class Adventure {
    private  boolean isRunning = true;
    Player player = new Player();
    UserInterface userInterface = new UserInterface();

    public void run(){
        userInterface.hello();
        while(isRunning){
            player.userCommand();
            action();
        }
    }
    public void action(){
        String where = player.getWhere();
        if(where.equals("north")){
            player.north();
        }
        if(where.equals("south")){
            player.south();
        }
        if(where.equals("east")){
            player.east();
        }
        if(where.equals("west")){
            player.west();
        }
        if(where.equals("help")){
            userInterface.help();
        }
        if(where.equals("look")){
            userInterface.look();
        }
        if (where.equals("exit")){
            userInterface.exit();
            isRunning = false;
        }
    }
}
