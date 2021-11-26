import java.util.*;
public class Driver
{
    public Driver()
    {
        boolean play = true;
        
        System.out.println("** Hero & Monsters **\n");
        
        // Generate the map
        
        // 1. Has a map that consists of a 2D array.
        Object[][] map = new Object[10][10];
        System.out.println("* The map has been generated *");
        
        // Creating the objects
        Hero hero = new Hero();
        
        // Fill up the map with objects (Monsters, townspeople, and weapons)
        Monster monster1 = new Monster(map);
        Monster monster2 = new Monster(map);
        Monster monster3 = new Monster(map);
        Monster monster4 = new Monster(map);
        Monster monster5 = new Monster(map);
        Monster monster6 = new Monster(map);
        
        System.out.println("* The enemies have been placed *");
        
        TownsPeople farmer1 = new TownsPeople(map);
        TownsPeople farmer2 = new TownsPeople(map);
        
        Potion potion1 = new Potion(map);
        Potion potion2 = new Potion(map);
        
        System.out.println("* The items have been placed *\n");
        
        // placing the hero
        map[hero.getXPos()][hero.getYPos()] = hero;
        
        do{
            // print the map
            System.out.println("\n");
            printMap(map);

            // take input from the user
            Scanner input = new Scanner(System.in);
            
            // printing out hero information
            System.out.println("\nHero Health: " + hero.getHealth());
            System.out.println("\nMonsters Killed: " + hero.getMonstersKilled());
            System.out.println("Number of potions: " + hero.getNumberOfPotions());
        
            // 10. Has a game loop that reads in user input.
            System.out.print("Enter an action (wasd) or 'p' to use a potion: ");
            String direction = input.nextLine();
            
            // move the hero
            if(validMove(direction, hero) == true && direction.equals("w")){
                 map[hero.getXPos()][hero.getYPos()] = null;
                 hero.setXPos(-1);
                 map[hero.getXPos()][hero.getYPos()] = hero;
            }
      
            else if(validMove(direction, hero) == true && direction.equals("a")){
                map[hero.getXPos()][hero.getYPos()] = null;
                hero.setYPos(-1);
                map[hero.getXPos()][hero.getYPos()] = hero;
            }
           
            else if(validMove(direction, hero) == true && direction.equals("s")){
                map[hero.getXPos()][hero.getYPos()] = null;
                hero.setXPos(1);
                map[hero.getXPos()][hero.getYPos()] = hero;
            }
            
            else if(validMove(direction, hero) == true && direction.equals("d")){
                map[hero.getXPos()][hero.getYPos()] = null;
                hero.setYPos(1);
                map[hero.getXPos()][hero.getYPos()] = hero;
            }
            //16. Allows hero to use potions when walking on the map.
            else if(direction.equals("p")){
               if(hero.getNumberOfPotions() != 0){
                   hero.setHealth(100);
                   hero.setNumberOfPotions(-1);
               }
               else{
                  System.out.println("You have no potions to use");
               }
            }
            
            // 11.User input is error checked.
            else{
                System.out.print("Error\n");
            }
            
            // adding objects you have interacted with to an Array List
            ArrayList<Object>interaction = new ArrayList<Object>();


            // check if touching anything
            
            // 12. Determines if an item has been encountered around the Hero.
            if (hero.getXPos() + 1 <= 9 && map[hero.getXPos() + 1][hero.getYPos()] != null){
                Object objC = map[hero.getXPos()+1][hero.getYPos()];
                interaction.add(objC);
                ((Character) objC).updateIsHidden(false);
                printMap(map);
            }
            
            if(hero.getYPos() + 1 <= 9 && map[hero.getXPos()][hero.getYPos() + 1] != null){
                Object objC = map[hero.getXPos()][hero.getYPos() + 1];
                interaction.add(objC);
                ((Character) objC).updateIsHidden(false);
                printMap(map);
            }
            
            if (hero.getYPos() - 1 >= 0 && map[hero.getXPos()][hero.getYPos() - 1] != null){
                Object objC = map[hero.getXPos()][hero.getYPos() - 1];
                interaction.add(objC);
                ((Character) objC).updateIsHidden(false);
                printMap(map);
            }
            
            if (hero.getXPos() - 1 >= 0 && map[hero.getXPos() - 1][hero.getYPos()] != null){
                Object objC = map[hero.getXPos() - 1][hero.getYPos()];
                interaction.add(objC);
                ((Character) objC).updateIsHidden(false);
                printMap(map);
            }
            
            
            // interacting in the order: Poitons, farmers, and townspeople
            for(int i = 0; i < interaction.size(); i++){
                if(interaction.get(i) instanceof Potion){
                    play = detectInteraction(map, interaction.get(i), hero);
                }
            }
            
            for(int i = 0; i < interaction.size(); i++){
                if(interaction.get(i) instanceof TownsPeople){
                    play = detectInteraction(map, interaction.get(i), hero);
                }
            }
            
            for(int i = 0; i < interaction.size(); i++){
                if(interaction.get(i) instanceof Monster){
                    play = detectInteraction(map, interaction.get(i), hero);
                }
            }
            
            // 21. When all objects have been interacted with and all monsters killed, shows an ending.
            if(hero.getMonstersKilled() >= 6){
                play = false;
                System.out.println("Congratulations you have defeated all the monsters and saved the village. \nThe townspeople thank you for your hardships.");
                System.out.println("☺︎");
            }
        }while(play);
        
        System.out.println("*Thank you for playing Heros & Monsters*");
    }
    
    public boolean detectInteraction(Object[][] map, Object objC, Hero hero){
        Scanner input = new Scanner(System.in);
        Armor armor = new Armor();
        
        if(objC instanceof Potion){
            Potion potion = (Potion) objC;
            hero.potionsInteracted();
            System.out.println("\npotion");
            
            // 13.Adds a potion object to the hero when encountered.
            hero.setNumberOfPotions(1);
            
            map[potion.getXPos()][potion.getYPos()] = null;
        }
        else if (objC instanceof TownsPeople){
            TownsPeople farmer = (TownsPeople) objC;
            if(!farmer.getHasVisited()){
                hero.setFarmerNumber(1);
                if(hero.getFarmerNumber() == 1){
                    
                    // farmers message
                    // 17. Townsperson_1 says a standard message until 2 monsters are killed.
                    System.out.println("\nMy sheep have been taken… My family is gone and I have nothing left except for bronze amor I have buried… \nOnly a true hero will receive this\nIf you kill(ed) 2 monsters you will be granted the bronze armor");
                    
                    // 14. Farmer gives an armor object to the hero after defeating two monsters.
                    if(hero.getMonstersKilled() >= 2){
                        hero.setHasArmor(true);
                        farmer.setHasVisited();
                    }
                }
                else if(hero.getFarmerNumber() >= 2){
                   farmer.setHasVisited();
                   
                   // 18. Townsperson_2 says a standard message until 4 monsters are killed.
                   System.out.println("\nThe village is under attack from the townspeople, find the broad sword I have hidden away to save our town.\n If you kill(ed) 4 monsters you will be awarded with the sacred broad sword, used by the most worthy heros of all time");
                   
                   // 15. Farmer gives a weapon object to the hero after defeating four monsters.
                   if(hero.getMonstersKilled() >= 2){
                        hero.setHasArmor(true);
                    }
                    
                   if(hero.getMonstersKilled() >= 4){
                       // give the hero a new weapon, sword with the attack damage of 20 as a high and 50 as a low
                       hero.setSword("broad sword", 20, 50);
                       farmer.setHasVisited();
                   }
                }
            }
            System.out.println("farmer");
        }
        
        // 19. When a monster is encountered, a battle ensues according to specifications.
        else if (objC instanceof Monster){
            Monster monster = (Monster) objC;
            
            hero.updateMonstersEncountered(1);
            boolean canRun = false;
            while(!canRun){
                System.out.println("\nHero: ");
                // printing out hero attributes
                System.out.println("Hero Health: " + hero.getHealth());
                System.out.println("Monsters Killed: " + hero.getMonstersKilled());
                System.out.println("Type of weapon: " + hero.getSwordName() + " which has a attack damage of " + hero.getSwordDamage());
                System.out.println("Hero has armor: " + hero.hasArmor());
                
                // printing out monster attributes
                System.out.println("\nMonster: ");
                System.out.println("Monster Health: " + monster.getMonsterHealth());
                System.out.println("Monster Attack: " + monster.getAttackValue());
                System.out.println("Monster Speed: " + monster.getSpeed() + "\n");
            
                System.out.println("Do you want to attack or run? ");
                String attackOrRun = input.nextLine();
                
                if(attackOrRun.equals("run")){
                    double randomNum = Math.random();
                    if(monster.getSpeed() == 0){
                        if(randomNum <= 0.75){
                            canRun = true;   
                        }
                    }
                    else if(monster.getSpeed() == 1){
                        if(randomNum <= 0.50){
                            canRun = true;   
                        }
                    }
                    else if(monster.getSpeed() == 2){
                        if(randomNum <= 0.25){
                            canRun = true;   
                        }
                    }
                    else if(monster.getSpeed() == 3){
                        System.out.println("*The monster is too fast and the hero cannot run away.*");
                        canRun = false;
                        return false;
                        // exit out of game
                    }
                }
                
                else if(attackOrRun.equals("attack")){
                    int damage = hero.getSwordDamage();
                    if (hero.hasArmor() == true){
                        damage = hero.getSwordDamage() - (int)((armor.getArmorProtection())* hero.getSwordDamage());
                    }
                    
                    monster.setMonsterHealth(-damage);
                    if(monster.getAttackValue() <= 10){
                        hero.updateHealth(-monster.getAttackValue());
                    }
                    else{
                        hero.updateHealth(-((int)Math.random() * (monster.getAttackValue() - (monster.getAttackValue()-9)) + (monster.getAttackValue() - 10)));
                    }
                    
                    if(monster.getMonsterHealth() <= 0){
                        canRun = true;
                        hero.updateMonstersKilled(1);
                        map[monster.getXPos()][monster.getYPos()] = null;
                    }
                
                    if(hero.getHealth() <= 0){
                        System.out.println("* After putting up a hard fight, the hero collapses and is struck a deadly blow by Monster *");
                        System.out.println("* The village falls to ruins with no one to protect them *");
                        return false;
                        // exit the game
                    }
                }
            }
        }
        return true;
    }
    
    public boolean validMove(String direction, Hero hero){
        boolean isValid = false;
        // checking if a given move is able to happen, not off the map
        if(direction.equals("w") &&  hero.getXPos() != 0){
           isValid = true; 
        }
        else if(direction.equals("a") && hero.getYPos() != 0){
            isValid = true;
        }
        else if(direction.equals("s") && hero.getXPos() != 9){
            isValid = true;
        }
        else if(direction.equals("d") && hero.getYPos() != 9){
            isValid = true;
        }
        return isValid;
    }
    
    
    // 8. Has a printMap() function.
    public static void printMap(Object[][] map){
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                if(j % 10 == 0){
                    System.out.println();
                }
                
                if (map[i][j] == null){
                    System.out.print("- ");
                }
            
                // 20. All items are invisible unless previously interacted with.
                if(map[i][j] != null && ((Character)map[i][j]).getIsHidden()){
                    System.out.print("- ");
                }
                
                if (map[i][j] != null &&!((Character)map[i][j]).getIsHidden()){
                    System.out.print(((Character)map[i][j]).getName() + " ");
                }
            }
        }
    }
}