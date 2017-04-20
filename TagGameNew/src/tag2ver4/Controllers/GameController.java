package tag2ver4.Controllers;

import tag2ver4.Controllers.BackpackController;
import tag2ver4.Controllers.CombatController;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import tag2ver4.Boundery;
import tag2ver4.Entities.Enemy;
import tag2ver4.Entities.Weapons;
import tag2ver4.Factories.WeaponsFactory;
import tag2ver4.Entities.Player;
import tag2ver4.Entities.Room;
import tag2ver4.Factories.RoomFactory;
import tag2ver4.Factories.RoomFactory2;

/**
 *
 * @author Zack
 */
public class GameController {

    boolean gamerun;
    private boolean invalidInput = true;
    String name;
    String description;
    int gold;
    Room[][] roomMatrix = new RoomFactory().createRooms();
    Room[][] roomMatrix2 = new RoomFactory2().createRooms();
    Boundery b = new Boundery();
    BackpackController bpc = new BackpackController();
    Player n1 = new Player(name, 100, roomMatrix[0][0], 1, 0);
    Enemy e1 = new Enemy(name, description, 0, 0, 0);
    CombatController cc = new CombatController();

    public void StartGame(Player n1) {
       Weapons[] selectaweapon = new WeaponsFactory().defineWeapons();
      
 
        // choose to go inside the roomMatrix or not               
        b.chooseRoomStart();

        if (b.enterchoice.equals("1")) {
            System.out.println(n1.getLocation());
            roomMatrix[0][0].setRoomItem2(selectaweapon[0]);
            n1.getBackPack().add(roomMatrix[0][0].getRoomItem2());
       
            gamerun = true;
            runGame(n1);
        }

        if (b.enterchoice.equals("0")) {
            b.gameOver(n1);
            System.exit(0);
            gamerun = false;

        }
        if (!(b.enterchoice.equals("0") || b.enterchoice.equals("1"))) {
            b.SayWhat();
            StartGame(n1);
        }
    }

    public void runGame(Player n1) {
        gamerun = true;

        boolean game;

        // initalise room
        game = true;
        while (game) {
            while (gamerun) {

                // You win the game:
                if (n1.getRoomNr() == 9) {
                    b.youWon(n1);
                    printMethod(n1);
                    loadLevel2(n1);
                }
                invalidInput = true;

                while (invalidInput) {
                    // You lose the game:  
                    if (n1.getHealth() < 1) {
                        b.youAreDead();
                        restartGame(n1);

                    }
                    // You are inside the game and should be able to move around in the dungeon

                    b.chooseDirection(n1);

                    if (b.brugerInput.equalsIgnoreCase("help")) {
                        Help(n1);
                    }

                    if (b.brugerInput.equalsIgnoreCase("search")) {
                        bpc.Search(n1, n1.getLocation());
                        bpc.addToBackpack(n1, n1.getLocation());
                    }

// det ville være fedt hvis denne kode kunne forkortes...
                    // ROOM NORTH
                    if (b.brugerInput.equalsIgnoreCase("n")) {
                        if (n1.getLocation().getNorth() != null) {
                            direction(n1, n1.getLocation().getNorth());
                            if (n1.getLocation().getEnemy() != null) {
                                System.out.println(n1.getLocation().getEnemy()); //her har man mødt en fjende ved indgang til et rum 
                                
                                cc.Interaction(n1, e1);
                            }
                        } // IF NO ROOM TO THAT DIRECTION
                        else {
                            b.noRoomNorth(n1);
                        }
                    }
                    // ROOM SOUTH
                    if (b.brugerInput.equalsIgnoreCase("s")) {
                        if (n1.getLocation().getSouth() != null) {
                            direction(n1, n1.getLocation().getSouth());
                            if (n1.getLocation().getEnemy() != null) {
                                System.out.println(n1.getLocation().getEnemy()); //her har man mødt en fjende ved indgang til et rum 

                                cc.Interaction(n1, e1);
                            }
                        } // IF NO ROOM TO THAT DIRECTION
                        else {
                            b.noRoomSouth(n1);
                        }
                    }
                    // ROOM EAST
                    if (b.brugerInput.equalsIgnoreCase("e")) {
                        if (n1.getLocation().getEast() != null) {
                            direction(n1, n1.getLocation().getEast());
                            if (n1.getLocation().getEnemy() != null) {
                                System.out.println(n1.getLocation().getEnemy()); //her har man mødt en fjende ved indgang til et rum 
                                cc.Interaction(n1, e1);
                            }
                        } // IF NO ROOM TO THAT DIRECTION
                        else {
                            b.noRoomEast(n1);
                        }
                    }
                    // ROOM WEST
                    if (b.brugerInput.equalsIgnoreCase("w")) {
                        if (n1.getLocation().getWest() != null) {
                            direction(n1, n1.getLocation().getWest());
                            if (n1.getLocation().getEnemy() != null) {
                                System.out.println(n1.getLocation().getEnemy()); //her har man mødt en fjende ved indgang til et rum 
                                cc.Interaction(n1, e1);
                            }
                        } // // IF NO ROOM TO THAT DIRECTION
                        else {
                            b.noRoomWest(n1);
                        }
                    }

                }
            }
        }

    }

    private void direction(Player n1, Room nextRoom) {
        invalidInput = false;
        GameController gc = new GameController();
        // sætter vores ny position for spilleren
        n1.setLocation(nextRoom);
        n1.setRoomNr(n1.getLocation().getCurrentRoom());
        gold = nextRoom.getGold();
        b.roomAndGold(n1); // her har vi problemer med at få fat i int gold
        int health = n1.getHealth();
        n1.setPlayerGold(n1.getPlayerGold() + gold);
        n1.setHealth(health - 5);
        nextRoom.setGold(0);
    }

    public void Help(Player n1) {

        b.helpMenu(n1);
        invalidInput = false;

        switch (b.helpInput) {
            case "1":
                invalidInput = true;
                b.stillInRoom(n1);
                break;

            case "2":
                b.collectedGold(n1);
                Help(n1);
                break;

            case "3":
                b.healthMessage(n1);
                Help(n1);
                break;

            case "4":
                bpc.printBackPack(n1);

                break;

            case "5":
                b.gameOver(n1);
                System.exit(0);
                break;

            case "6":
                bpc.Search(n1, n1.getLocation());
                bpc.addToBackpack(n1, n1.getLocation());
                Help(n1);
                break;
        }
    }

    public void restartGame(Player n1) {

        b.playAgain();

        if (b.startover.equalsIgnoreCase("no")) {
            b.thankYouForPlaying(n1);
            System.exit(0);
        }

        if (b.startover.equalsIgnoreCase("yes")) {
            n1.setHealth(100);
            n1.setLocation(roomMatrix[0][0]);
            n1.setRoomNr(1);
            System.out.println(n1.getRoomNr() + "  " + n1.getLocation());
            gamerun = true;

        } else {
            restartGame(n1);
        }

    }

    // Level Loader (her vill det være rart med en level loader som loadede en roommatricx med samme nummer som level)
    public void loadLevel2(Player n1) {

        b.nextLevelOrNot();

        if (b.nextlevel.equalsIgnoreCase("no")) {
            b.thankYouForPlaying(n1);
            System.exit(0);
        }

        if (b.nextlevel.equalsIgnoreCase("yes")) {
            n1.setHealth(100);
            n1.setLocation(roomMatrix2[0][0]);
            n1.setRoomNr(4);
            System.out.println(n1.getRoomNr() + "  " + n1.getLocation());
            gamerun = true;

        } else {
            loadLevel2(n1);
        }
    }

    public static void printMethod(Player n1) {
        try {
            String file = "C:\\Users\\Ejer\\Desktop\\Datamatiker\\TagGame2\\TagGame2\\TagGameNew\\src\\tag2ver4\\Scores.txt";
            String text = "High scores:" + n1.getName() + "  " + n1.getPlayerGold();
            try (BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
                out.write(text);
            }
        } catch (IOException out) {
            System.out.print(out);
        }

    }

}
