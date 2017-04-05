/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4;

import java.util.Scanner;
import tag2ver4.ItemsFactories.Armor;
import tag2ver4.ItemsFactories.HealingPotions;
import tag2ver4.ItemsFactories.Weapons;
import tag2ver4.ItemsFactories.HealingPotionsFactory;

/**
 *
 * @author Ejer
 */
public class BackpackController {

    Scanner putinsack = new Scanner(System.in);
    Scanner itemchoose = new Scanner(System.in);

    public void Search(Player n1, Room nextRoom) {

        HealingPotions item1 = nextRoom.getRoomItem1();
        Weapons item2 = nextRoom.getRoomItem2();
        Armor item3 = nextRoom.getRoomItem3();

        // sætter vores ny position for spilleren
        n1.setLocation(nextRoom);

        n1.setRoomNr(n1.getLocation().getCurrentRoom());
        // SETTING THE ARRAY OF ITEMS FROM ROOM TO PLAYER PICKUP
        // n1.setInventory(n1.getLocation().getRoomItem());
        // ACCESSING THE FIRST ITEM ON THE ARRAY OF ITEMS PICKED UP FROM A ROOM
        System.out.println("You've found: \n");

        if (item1 != null) {
            System.out.println(item1.getName() + "  \n");

        }

        if (item2 != null) {
            System.out.println(item2.getName() + "  \n");

        }
        if (item3 != null) {
            System.out.println(item3.getName() + "  \n");

        } else {
            System.out.println("");
        }

    }

    public void addToBackpack(Player n1, Room nextRoom) {

        System.out.println("Type 'add' if you want to put these items in your backpack");
        String putinyes = putinsack.nextLine();

        HealingPotions item1 = nextRoom.getRoomItem1();
        Weapons item2 = nextRoom.getRoomItem2();
        Armor item3 = nextRoom.getRoomItem3();

        if (putinyes.equalsIgnoreCase("add")) {  //&& (n1.getLocation().getGold() != 0)
            if (item1 != null) {
                n1.getBackPack().add(item1);
                n1.getLocation().getCurrentRoom();
                n1.getLocation().setRoomItem1(null);
            }
            if (item2 != null) {
                n1.getBackPack().add(item2);
                n1.getLocation().getCurrentRoom();
                n1.getLocation().setRoomItem2(null);
            }
            if (item3 != null) {
                n1.getBackPack().add(item3);
                n1.getLocation().getCurrentRoom();
                n1.getLocation().setRoomItem3(null);
            } else {
                n1.getLocation().getCurrentRoom();
            }
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("You have added:  " + item1 + "\n" + item2 + "\n" + item3 + " to your backpack");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }

    }

    public void rucksackOptions(Player n1) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Choose an item by typing it's name");//}
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String itemchoice = itemchoose.nextLine();
        

        HealingPotions[] selectahealingpotion = new HealingPotionsFactory().createPotions();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(selectahealingpotion[2].getDescription());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
       
        // her skal der være et if statement der sammenligner itemchoice indtastningen med objercter i rygsækken
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("You do not have such an item try again");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        

    }

    public void printBackPack(Player n1) {
        for (int i = 0; i < n1.getBackPack().size(); i++) {
            System.out.println(n1.getBackPack().get(i).toString());
        }
    }
}
