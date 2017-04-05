package tag2ver4;

import java.util.Scanner;

/**
 *
 * @author BendikteEva
 */
public class Boundery {
  
    String itemchoice;
    String helpInput;
   
//    String named;

    public void intro(Player n1) {

        System.out.println(">> Hello " + n1.getName() + " " + "Welcome to Text Based Adventure Game! <<\n "
                + "--------------------------------------------------------------------\n");
        System.out.println("The objective of this game is to find your way through\n"
                + "the dungeon and collect as much gold as possible. \n\n"
                + "You don't have a map and only a flaslight at your \n"
                + "disposal to light up your quest.\n\n"
                + "You forgot to eat so you have to finish your quest\n"
                + "before you faint and is eaten by moths and bats \n"
                + "and big ugly spiders and then eventually die,  \n"
                + "which in that case you have lost. \n\n"
                + "Your health is at 100% when you start and you will\n"
                + "gradually lose your health while your walking around.\n"
                + "because you are hungry and no food is available.\n\n"
                + "At any time during your quest, type help and get some options\n"
                + "<< This is very important  "+n1.getName()+"  so please pay attention >>\n\n"
                + "**********************************************************\n"
                        + "Sometimes there are valuable items in the rooms and you can \n"
                + "type 'search' to look around\n"
                        + "**********************************************************\n"
                + "You have won the game when you have found the Exit.\n"
                + "--------------------------------------------------------------------\n\n");
    }

    public String askNamed() {

        Scanner nameInput = new Scanner(System.in);
        System.out.println("Hi there. What's your name? ");
        String named = nameInput.nextLine();
        named = named.toUpperCase();
        return named;
    }

    public void chooseRoomStart() {

        System.out.println("Will you like to enter the cave or are you a coward");
        System.out.println("type '0' for being a coward!");
        System.out.println("type '1' for entering.");

    }

    public void chooseDirection() {

        System.out.println("Where do you wanna go?");
        System.out.println("Press:\n"
                + "'n' for north, 's' for south, 'e' for east, 'w' for west\n");
    }
  
    public void helpMenu(Player n1) {
        
        System.out.println("Help Menu");
        System.out.println("Type 'exit' to get back to game");
        System.out.println("Type 'gold' to see how much gold you've collected so far.");
        System.out.println("Type 'health' to see your current health status");
        System.out.println("Type 'quit' to end the game.");
        System.out.println("Type 'sack' to see items in your backpack");

    }
    
    

 
}
