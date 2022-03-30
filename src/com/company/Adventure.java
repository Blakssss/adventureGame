package com.company;

public class Adventure {
    private boolean isRunning = true;
    Player player = new Player();
    UserInterface userInterface = new UserInterface();

    public void run() {
        userInterface.hello();
        while (isRunning)
            action();
    }

    public void action() {
        player.userCommand();
        String where = player.getWhere();
        switch (where) {
            case "north", "n" -> player.north();
            case "south", "s" -> player.south();
            case "east", "e" -> player.east();
            case "west", "w" -> player.west();
            case "look", "where" -> player.look();
            case "find", "check" -> player.findItem();
            case "take", "pick" -> player.take();
            case "drop", "remove" -> player.dropItem();
            case "inventory", "i" -> player.checkInventory();
            case "equipment" -> player.checkEquipment();
            case "equip" -> player.equip();
            case "unequip" -> player.unequip();
            case "attack" -> player.attack();
            case "help", "?" -> userInterface.help();
            case "health" -> userInterface.health(player);
            case "exit", "escape" -> {
                userInterface.exit();
                isRunning = false;
            }
            case "eat" -> {
                player.eat();
                userInterface.health(player);

            }
        }
    }
}