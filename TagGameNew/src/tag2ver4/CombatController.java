package tag2ver4;

import java.util.Random;
import java.util.Scanner;
import tag2ver4.ItemsFactories.Armor;
import tag2ver4.ItemsFactories.ArmorFactory;
import tag2ver4.ItemsFactories.HealingPotions;
import tag2ver4.ItemsFactories.Weapons;
import tag2ver4.ItemsFactories.HealingPotionsFactory;
import tag2ver4.ItemsFactories.Enemy;
import tag2ver4.ItemsFactories.EnemyFactory;
import tag2ver4.ItemsFactories.WeaponsFactory;

/**
 *
 * @author BenedikteEva
 */
public class CombatController {

    //CombatRules just so you know
    //the monster attacks first the first time you meet it. You can choose to flee, fight or bargain
    // if you choose flee you loose half you gold. Why because you run so fast that this is what happens 
    // The goldamount you loose is of cause dropped in the room if you should return and fight
    // if you choose to bargain you will need to bargain at least the amount of gold equivalent 
    // of the monster attackdammage or the monster will strike again. 
    // at any time you can type help and then  sack and see whats in your backpack
    Boundery b = new Boundery();
    Scanner combat = new Scanner(System.in);
    String actionchoice;
    Scanner itemchoose = new Scanner(System.in);
    BackpackController bpc = new BackpackController();
    Random enemygold = new Random();
    

    public void Combat(Player n1, Enemy e1) {
        System.out.println(n1.getLocation().getEnemy());
        enemyAttacks(n1, e1);
        Action(n1, e1);
    }

    public void chooseAction(Player n1) {

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("What a monster!!! Do you wanna flee, fight or bargain?\n"
                + "type 'flee' for flight,  'fight' for combat, and 'bargain' for bargain");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        actionchoice = combat.nextLine();

    }

    public void Action(Player n1, Enemy e1) {

        chooseAction(n1);

        if (actionchoice.equalsIgnoreCase("flee")) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("You lose " + (n1.getPlayerGold() / 2) + "  gold");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            n1.setPlayerGold(n1.getPlayerGold() / 2);
            int newroomgold = n1.getPlayerGold() / 2;
            n1.getLocation().setGold(newroomgold);
            n1.setLocation(n1.getLocation());

        }

        if (actionchoice.equalsIgnoreCase("bargain")) {

            Bargain(n1, e1);
        }

        if (actionchoice.equalsIgnoreCase("fight")) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Check you backpack to see if you have any weapon or armor \n"
                    + "you can use against your enemy");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            FightBack(n1, e1);
        }

    }

    public void enemyAttacks(Player n1, Enemy e1) {
        n1.setHealth(n1.getHealth() - n1.getLocation().getEnemy().getEnemyDamage());
        n1.getHealth();
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("You suffer " + n1.getLocation().getEnemy().getEnemyDamage() + " damage");
        System.out.println("Your health is now:  " + n1.getHealth());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    public void FightBack(Player n1, Enemy e1) {
        int goldfind = enemygold.nextInt(6) + 1;
        bpc.printBackPack(n1);
        System.out.println("Choose weapon, armor or potion");
        HealingPotions[] getpotion = new HealingPotionsFactory().createPotions();
        Weapons[] selectaweapon = new WeaponsFactory().defineWeapons();
        Armor[] selectanarmor = new ArmorFactory().defineArmor();

//        //Våben- og Armor Arrayene er her implementeret
//        
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Choose an item by typing it's name");//}
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        String itemchoice = itemchoose.nextLine();

        for (int i = 0; i < n1.getBackPack().size(); i++) {
            if (getpotion[i].getName().equalsIgnoreCase(itemchoice)) {
                System.out.println(getpotion[i]);
                getpotion[i].heal(n1);
            }
            if (selectaweapon[i].getName().equalsIgnoreCase(itemchoice)) {
                System.out.println(selectaweapon[i]);
                e1.enemyHealth = n1.getLocation().getEnemy().enemyHealth - selectaweapon[i].getWeapons();
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("You enemy's health is down to:  " + e1.enemyHealth);
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                enemyAttacks(n1,e1);
            }
            if (e1.enemyHealth <= 0) {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("The  " + n1.getLocation().getEnemy().getName() + "  is dead!");
                System.out.println("You get  " + goldfind + " gold pieces from the belly of the dead monster");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                n1.setPlayerGold(n1.getPlayerGold() + goldfind);
                n1.getLocation().setEnemy(null);
                b.chooseDirection();

            }

            if (selectanarmor[i].getName().equalsIgnoreCase(itemchoice)) {
                System.out.println(selectanarmor[i]);

            }
            if (!((getpotion[i].getName().equalsIgnoreCase(itemchoice)) || (selectaweapon[i].getName().equalsIgnoreCase(itemchoice)) || (selectanarmor[i].getName().equalsIgnoreCase(itemchoice)))) {
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                System.out.println("Bugger! You do not have such a thing, choose again? 'yes' for 'yes' 'no' for \n"
                        + "getting back to the monster");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                if (itemchoice.equalsIgnoreCase("yes")) {
                    FightBack(n1, e1);
                }
                if (itemchoice.equalsIgnoreCase("no")) {
                    Action(n1, e1);
                } else {
                    System.out.println("Say what!");
                    FightBack(n1, e1);
                }

                if (n1.getBackPack().isEmpty()) {
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                }
                System.out.println("You backpack is empty. Flee og bargain");
                System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                chooseAction(n1);

            }
        }
    }

    public void Bargain(Player n1, Enemy e1) {
        Scanner bargainscan = new Scanner(System.in);
        int bargainoffer;

        if (!(n1.getLocation().getEnemy().getName().equals("Snorkl Snake")) || n1.getLocation().getEnemy().getName().equals("Politician")) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("How much gold are you willing to give?");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            bargainoffer = bargainscan.nextInt();

            if (bargainoffer >= (n1.getLocation().getEnemy().getEnemyDamage())) {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("You are very generous. You can pass");
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
                n1.setPlayerGold(n1.getPlayerGold() - bargainoffer);
            } else {
                enemyAttacks(n1, e1);
                n1.setPlayerGold(n1.getPlayerGold() - bargainoffer);

            }

        }
        if (n1.getLocation().getEnemy().getName().equals("Snorkl Snake")) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("You are not Harry Potter. You do not speak parsel tongue.\n You are  " + n1.name + "  be fucking proud of your self and go get that snake");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            Action(n1, e1);

        }

        if (n1.getLocation().getEnemy().getName().equals("Politician")) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("I haven't got a great bargening story yet but it will come");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            Action(n1, e1);

        }

    }

}
