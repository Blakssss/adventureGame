package com.company;

public class Adventure {
    private  boolean isRunning = true;
    Player player = new Player();
    UserInterface userInterface = new UserInterface();

    public void run(){
        userInterface.hello();
        while(isRunning)
            action();
    }

    public void action(){
        player.userCommand();
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
            player.look();
        }
        if(where.equals("find")){
            player.findItem();
        }
        if(where.equals("exit")){
            userInterface.exit();
            isRunning = false;
        }
        if(where.equals("take")){
            player.take();
        }
        if(where.equals("drop")){
            player.dropItem();
        }
        if(where.equals("inventory")){
            player.checkInventory();
        }
        if (where.equals("health")){
            userInterface.health(player);
        }
        if (where.equals("eat")){
            player.eat();
            userInterface.health(player);
        }
        if(where.equals("equip")){
            player.equip();
        }
        if(where.equals("unequip")){
            player.unequip();
        }
        if(where.equals("attack")){
            player.attack();
        }
    }
}