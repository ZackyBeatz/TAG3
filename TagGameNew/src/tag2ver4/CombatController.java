package tag2ver4;

import java.util.Scanner;
import tag2ver4.ItemsFactories.Armor;
import tag2ver4.ItemsFactories.HealingPotions;
import tag2ver4.ItemsFactories.Weapons;
import tag2ver4.ItemsFactories.HealingPotionsFactory;
import tag2ver4.ItemsFactories.Enemy;
import tag2ver4.ItemsFactories.EnemyFactory;

/**
 *
 * @author BenedikteEva
 */
public class CombatController {

    Boundery b = new Boundery();
    String actionchoice;

    public void Combat(Player n1, Enemy e1) {
        System.out.println(n1.getLocation().getEnemy());
        enemyAttacks(n1, e1);
        System.out.println("You suffer " + n1.getLocation().getEnemy().getEnemyDamage() + " damage");
        System.out.println("Your health is now:  " + n1.getHealth());
        Action(n1);

    }

    public void enemyAttacks(Player n1, Enemy e1) {
        n1.setHealth(n1.getHealth() - n1.getLocation().getEnemy().getEnemyDamage());
        n1.getHealth();
    }

    public void chooseAction(Player n1) {

    }

    public void Action(Player n1) {

        Scanner combat = new Scanner(System.in);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("What a monster!!! Do you wanna flee, fight or bargain?\n"
                + "type 'flee' for fligth,  'fight' for combat, and 'bargain' for bargain");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        actionchoice = combat.nextLine();
        chooseAction(n1);
        if (actionchoice.equalsIgnoreCase("flee")) {
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("You lose half you gold "+n1.getPlayerGold()/2);
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            n1.setPlayerGold(n1.getPlayerGold()/2);
            n1.setLocation(n1.getLocation().getWest());
            
        }
        if (actionchoice.equalsIgnoreCase("fight")){
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println("Check you backpack to see if you have any weapon or armor you can use against your enemy");
            System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        }
         if (actionchoice.equalsIgnoreCase("bargain")){
             if (n1.getLocation().getEnemy().getName().equalsIgnoreCase("Snorkl Snake")){
                 System.out.println("You are not Harry Potter. You do not speak parsel tongue.\n You are"+n1.name+"be proud and go get that snake");
                 Action(n1);
             }
             else{
            System.out.println("How much gold are you willing to give?");
        }

    }
}
}