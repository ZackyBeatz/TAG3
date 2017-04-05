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
     public void chooseAction(Player n1){
         
         
}

    public void Action(Player n1) {
        
         Scanner combat = new Scanner(System.in);
          System.out.println("What a monster!!! Do you wanna flee, fight or bargain?\n"
                 + "type 'flee' for fligth,  'fight' for combat, and 'bargain' for bargain");
            actionchoice = combat.nextLine();
        chooseAction(n1);
        if ( actionchoice.equalsIgnoreCase("flee")){
         n1.setLocation(n1.getLocation().getWest());
        }
            
        }
}
    
