/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.ItemsFactories;

/**
 *
 * @author Zack
 */
public class HealingPotionsFactory {

    // HERINDE KAN VI REDIGERE OG LAVE FLERE VÅBEN SAMT HEAL POTIONS...
    public HealingPotions[] createPotions() {

        HealingPotions[] potions = new HealingPotions[5];

        potions[0] = new HealingPotions("Golden Shot.", "A magic potion with a buzz", 8);
        potions[1] = new HealingPotions("Sparkling Fuzz.", "Pearly and white, good for your teeth", 5);
        potions[2] = new HealingPotions("Blue water.", "A potent potion", 10);
        potions[3] = new HealingPotions("Moon Well.", "Healing Water from springs", 11);
        potions[4] = new HealingPotions("Medicare Pack", "A potion of healthcare to strengthen your energy again", 12);

        return potions;
    }

    // Mixing Items for each room
}
