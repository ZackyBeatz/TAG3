package tag2ver4.Controllers;

import java.util.Random;
import java.util.Scanner;
import tag2ver4.Boundery;
import tag2ver4.Entities.Armor;
import tag2ver4.Factories.ArmorFactory;
import tag2ver4.Entities.HealingPotions;
import tag2ver4.Entities.Weapons;
import tag2ver4.Factories.HealingPotionsFactory;
import tag2ver4.Entities.Enemy;
import tag2ver4.Factories.EnemyFactory;
import tag2ver4.Factories.WeaponsFactory;
import tag2ver4.Entities.ItemsSuper;
import tag2ver4.Entities.Player;

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
    BackpackController bpc = new BackpackController();
    public boolean action;
    public boolean interaction;
    int ehealth;

    //Våben- og Armor Arrayene er her implementeret
    HealingPotions[] getpotion = new HealingPotionsFactory().createPotions();
    Weapons[] selectaweapon = new WeaponsFactory().defineWeapons();
    Armor[] selectanarmor = new ArmorFactory().defineArmor();

    public void Interaction(Player n1, Enemy e1) {
        ehealth = n1.getLocation().getEnemy().getEnemyHealth();
        while (n1.getHealth() > 0 && ehealth > 0) {

            interaction = true;
            while (interaction) {

                n1.setHealth(n1.getHealth() - n1.getLocation().getEnemy().getEnemyDamage());
                n1.getHealth();

                b.sufferDamage(n1);
                b.chooseInterAction(n1);

                if (b.actionchoice.equalsIgnoreCase("flee")) {
                    Flee(n1);
                }

                if (b.actionchoice.equalsIgnoreCase("bargain")) {

                    Bargain(n1, e1);
                }

                if (b.actionchoice.equalsIgnoreCase("fight")) {
                    b.checkPackback(n1);
                    Fight(n1, e1);

                }

                if (b.actionchoice.equalsIgnoreCase("help")) {
                    b.helpMenuInfight(n1);
                }

            }
        }
    }

    public void Fight(Player n1, Enemy e1) {
        GameController gc = new GameController();

//        CombatController cc = new CombatController();
        action = true;
        while (action) {

            bpc.printBackPack(n1);

            b.chooseItem(n1);
            ehealth = n1.getLocation().getEnemy().getEnemyHealth();
            ///////////////////////////////////////////////////////////
            ItemsSuper selectedItem = null;
            for (ItemsSuper it : n1.getBackPack()) {
                if (it.getName().equalsIgnoreCase(b.itemchoice)) {
                    selectedItem = it;
                    break;
                }
            }
            if (selectedItem == null) {
                // Spilleren har ikke dette item!
                b.Bugger(n1);
                return;
            }
            if (selectedItem instanceof Weapons) {
                Weapons w = (Weapons) selectedItem;
                System.out.println(w.getName());
                n1.getLocation().getEnemy().setEnemyHealth(ehealth - w.getWeapons());
                ehealth = n1.getLocation().getEnemy().getEnemyHealth();
                b.EnemyHealthIsDown(n1);

                if (ehealth <= 0) {
                    action = false;
                    b.EnemyisDeath(n1);
                    n1.setPlayerGold(n1.getPlayerGold() + n1.getLocation().getEnemy().getGoldfind());
                    interaction = false;
                    n1.getLocation().setEnemy(null);
                    n1.getLocation();
                    b.stillInRoom(n1);
                    gc.runGame(n1);

                }
                if (n1.getHealth() <= 0) {
                    interaction = false;
                    action = false;
                    b.youAreDead();
                    b.playAgain();

                } else {
                    Interaction(n1, e1);
                    Fight(n1, e1);
                }
            } else if (selectedItem instanceof HealingPotions) {
                HealingPotions p = (HealingPotions) selectedItem;
                if (p.getName().equalsIgnoreCase(b.itemchoice)) {
                    System.out.println(p.getName());
                    p.heal(n1);
                    p.setHeal(0);
                    b.YourHealthIsDown(n1);
                    Interaction(n1, e1);

                }

            } else {
                Armor a = (Armor) selectedItem;
                if (a.getName().equalsIgnoreCase(b.itemchoice)) {
                    System.out.println(a.getName());
                    n1.setHealth(n1.getHealth() - n1.getLocation().getEnemy().getEnemyDamage() + a.getProtect());
                    n1.getHealth();
                    b.deflectEnemyAttack(n1);
                    System.out.print(a.getProtect());
                    b.SufferLess(n1);
                    System.out.println(n1.getLocation().getEnemy().getDamage() + -a.getProtect());
                }

            }

            ///////////////////////////////////////////////////////////
        }
    }

    public void Bargain(Player n1, Enemy e1) {

        GameController gc = new GameController();

        if (!(n1.getLocation().getEnemy().getName().equals("Snorkl Snake")) || n1.getLocation().getEnemy().getName().equals("Politician")) {
            b.GoldOffer(n1);

            if (b.bargainoffer >= (n1.getLocation().getEnemy().getEnemyDamage())) {
                b.GenerousYou(n1);
                n1.setPlayerGold(n1.getPlayerGold() - b.bargainoffer);
                n1.getLocation();
                gc.runGame(n1);
                action = false;

            } else {
                b.insultEnemy(n1);
                Interaction(n1, e1);
                n1.setPlayerGold(n1.getPlayerGold() - b.bargainoffer);
                n1.getLocation();
                gc.runGame(n1);
                action = false;

            }

        }
        if (n1.getLocation().getEnemy().getName().equals("Snorkl Snake")) {
            b.notHarryPotter(n1);
            action = true;

        }

        if (n1.getLocation().getEnemy().getName().equals("Politician")) {
            b.noBargeningSucces(n1);
            action = true;
        }
    }

    public void Flee(Player n1) {
        GameController gc = new GameController();
        b.LoseGoldFleeing(n1);
        n1.setPlayerGold(n1.getPlayerGold() / 2);
        int newroomgold = n1.getPlayerGold() / 2;
        n1.getLocation().setGold(newroomgold);
        n1.setLocation(n1.getLocation());
        action = false;
        interaction = false;
        gc.runGame(n1);
    }
    //    // This kinda sucks since it is almost a copy of the origrinal helpmenu

    public void HelpInFight(Player n1) {

        b.helpMenuInfight(n1);
        action = false;

        switch (b.helpInput) {
            case "1":
                action = true;
                break;

            case "2":
                b.collectedGold(n1);
                HelpInFight(n1);
                break;

            case "3":
                b.healthMessage(n1);
                HelpInFight(n1);
                break;

            case "4":
                bpc.printBackPack(n1);
                HelpInFight(n1);
                break;

            case "5":
                b.gameOver(n1);
                System.exit(0);
                break;

        }
    }
}
