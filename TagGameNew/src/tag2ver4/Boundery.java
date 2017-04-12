package tag2ver4;

import java.util.Scanner;

/**
 *
 * @author BendikteEva
 */
public class Boundery {

    String itemchoice;
    String helpInput;
    String actionchoice;
    String enterchoice;
    String nextlevel;
    String brugerInput;
    String startover;
    String helpInFight;
    Scanner exitopt = new Scanner(System.in);
    int bargainoffer;

//   1. Intro and outro text and scans:
    public void intro(Player n1) {

        System.out.println(">> Hello " + n1.getName() + " " + "Welcome to Text Based Adventure Game! <<\n "
                + "--------------------------------------------------------------------\n");
        System.out.println("The objective of this game is to find your way through\n"
                + "the dungeons and collect as much gold as possible. \n\n"
                + "You forgot to eat so you have to finish your quest\n"
                + "before you faint and are eaten by moths and bats \n"
                + "and big ugly spiders and then eventually die,  \n"
                + "which in that case you have lost. \n\n"
                + "There is also a great risk that monsters will attack you, \n"
                + "as you enter a room, and you can choose to either fight, flee \n"
                + "or bargain with the monsters\n\n"
                + "Your health is at 100 when you start, but as you walk around hungry\n"
                + "and are attacked by monsters frequently, you will gradually lose your health\n\n"
                + "At any time during your quest, type help and get some options\n"
                + "<< This is very important  " + n1.getName() + "  so please pay attention >>\n\n"
                + "**********************************************************\n"
                + "Sometimes there are valuable items in the rooms and you can \n"
                + "type 'search' to look around, and this is something you should do as soon\n"
                + "as you enter the dungeon\n\n"
                + "**********************************************************\n"
                + "You have won the game when you have found the Exit of the last dungeon.\n"
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
        Scanner rumA = new Scanner(System.in);

        System.out.println("Will you like to enter the cave or are you a coward");
        System.out.println("type '0' for being a coward!");
        System.out.println("type '1' for entering.");

        enterchoice = rumA.next();
    }

    public void youAreDead() {
        System.out.println("You Died. Game Over");
    }

    public void youWon(Player n1) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>FIREWORKS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Congratulations    " + n1.getName() + "! You won");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>FIREWORKS<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("You collected " + n1.getPlayerGold() + " gold coins");
        System.out.println("--------------------------------------------------------------------");
    }

    public void nextLevelOrNot() {

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Do you wanna go to next level? Type 'Yes' for yes og 'No' for no");
        System.out.println("--------------------------------------------------------------------");
        nextlevel = exitopt.nextLine();
    }

    public void playAgain() {

        System.out.println("Do you wanna play again? Type 'Yes' for yes og 'No' for no");
        startover = exitopt.nextLine();
    }

    public void thankYouForPlaying(Player n1) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Thank you for playing  " + n1.getName() + " !");
        System.out.println("--------------------------------------------------------------------");
    }

    public void gameOver(Player n1) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Bye  " + n1.getName() + "  Game Over");
        System.out.println("--------------------------------------------------------------------");
    }

    // 2. A lot of text used frequently during the game:
    //  2a. Navigation-text:
    public void chooseDirection(Player n1) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Where do you wanna go?");
        System.out.println("Press:\n"
                + "'n' for north, 's' for south, 'e' for east, 'w' for west\n");
        System.out.println("--------------------------------------------------------------------");

        brugerInput = userInput.nextLine();
    }

    public void noRoomSouth(Player n1) {
        System.out.println("No room south for room " + n1.getRoomNr() + "\n"
                + "--------------------------------------------------------------------");
    }

    public void noRoomEast(Player n1) {
        System.out.println("No room east for room " + n1.getRoomNr() + "\n"
                + "--------------------------------------------------------------------");
    }

    public void noRoomNorth(Player n1) {
        System.out.println("No room north for room " + n1.getRoomNr() + "\n"
                + "--------------------------------------------------------------------");
    }

    public void noRoomWest(Player n1) {
        System.out.println("No room west for room " + n1.getRoomNr() + "\n"
                + "--------------------------------------------------------------------");
    }

    public void roomAndGold(Player n1) {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("" + n1.getLocation() + "\n");
        System.out.println("You found " + n1.getLocation().getGold() + " gold coins" + "\n");
        //System.out.println("Your health is " + n1.getHealth() + "\n");
        System.out.println("--------------------------------------------------------------------");
    }
// 2b. Ingame help-texts 

    public void helpMenu(Player n1) {
        Scanner scanHelp = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Help Menu");
        System.out.println("Exit Help: Type '1' to get back to game");
        System.out.println("See Gold: Type '2' to see how much gold you've collected so far.");
        System.out.println("See Health: Type '3' to see your current health status");
        System.out.println("See Backpack: Type '4' to see items in your backpack");
        System.out.println("Quit game: Type '5' to end the game.");
        System.out.println("Search Room: Type '6' to search the room for items");
        System.out.println("--------------------------------------------------------------------");
        helpInput = scanHelp.nextLine();

    }

    public void stillInRoom(Player n1) {
        System.out.println("You are still in room " + n1.getRoomNr());
    }

    public void collectedGold(Player n1) {
        System.out.println("You have collected:  " + n1.getPlayerGold() + " gold pieces");
    }

    public void healthMessage(Player n1) {
        System.out.println("Your health is at:  " + n1.getHealth() + " %");
    }

    public void SayWhat() {
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Say what!"); // used when someone just don't get the words right.
        System.out.println("--------------------------------------------------------------------");
    }

    // 3. These methods belongs to combatcontroller:
    public void chooseInterAction(Player n1) {
        Scanner combat = new Scanner(System.in);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("What a monster!!! Do you wanna flee, fight or bargain?\n"
                + "type 'flee' for flight,  'fight' for combat, and 'bargain' for bargain");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        actionchoice = combat.nextLine();

    }

    // 3a. When you choose to fight:
    public void YourHealthIsDown(Player n1) {
        System.out.println("Your health is now:  " + n1.getHealth());
    }
    // an enemy have attacked you and you:

    public void sufferDamage(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("You suffer " + n1.getLocation().getEnemy().getEnemyDamage() + " damage");
        System.out.println("Your health is now:  " + n1.getHealth());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    //              using armor
    public void deflectEnemyAttack(Player n1) {
        System.out.print("Your enemy's attack was deflected with:  ");

    }

    public void SufferLess(Player n1) {
        System.out.print("You suffer only ");
    }

//                 this is when you use a weapon against an enemy and it is hurt
    public void EnemyHealthIsDown(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("You enemy's health is down to:  " + n1.getLocation().getEnemy().getEnemyHealth());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public void EnemyisDeath(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("The  " + n1.getLocation().getEnemy().getName() + "  is dead!");
        System.out.println("You get  " + n1.getLocation().getEnemy().getGoldfind() + " gold pieces from the belly of the dead monster");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

//          when you chose bargain
    public void notHarryPotter(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("You are not Harry Potter. You do not speak parsel tongue.\n You are  " + n1.name + "  be fucking proud of your self and go get that snake");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public void GoldOffer(Player n1) {
        Scanner bargainscan = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("How much gold are you willing to give?");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        bargainoffer = bargainscan.nextInt();
    }

    public void GenerousYou(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("You are very generous. You can pass");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public void insultEnemy(Player n1) {
        System.out.println("What an insult!!!!");
    }

    public void noBargeningSucces(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("I haven't got a great bargaining story yet but it will come");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    //      when you chose to flee
    public void LoseGoldFleeing(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("You lose " + (n1.getPlayerGold() / 2) + "  gold");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }
//          Help menu during interaction

    public void helpMenuInfight(Player n1) {
        Scanner scanHelpInFight = new Scanner(System.in);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("Help Menu");
        System.out.println("Exit Help: Type '1' to get back to the fight");
        System.out.println("See Gold: Type '2' to see how much gold you've collected so far.");
        System.out.println("See Health: Type '3' to see your current health status");
        System.out.println("See Backpack: Type '4' to see items in your backpack");
        System.out.println("Quit game: Type '5' to end the game.");
        System.out.println("--------------------------------------------------------------------");
        helpInFight = scanHelpInFight.nextLine();

    }

    // 3a. Backpack during battle
    public void checkPackback(Player n1) {
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("Here's what's in your backpack:");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public void backpackIsEmpty(Player n1) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("You backpack is empty. Flee og bargain");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void Bugger(Player n1) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Bugger! You do not have such a thing, try again? ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }

    public void chooseItem(Player n1) {

        Scanner itemchoose = new Scanner(System.in);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Choose an item by typing it's name");//}
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        itemchoice = itemchoose.nextLine();
    }
}
