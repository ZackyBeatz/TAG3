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

        potions[0] = new HealingPotions("A magic potion with a buzz","Golden Shot",  8);
        potions[1] = new HealingPotions("Pearly and white, good for your teeth","Sparkling Fuzz",  5);
        potions[2] = new HealingPotions("A potent potion","Blue water",  10);
        potions[3] = new HealingPotions("Healing Water from springs","Moon Well",  11);
        potions[4] = new HealingPotions("A potion of healthcare to strengthen your energy again","Medicare Pack",  12);

        return potions;
    }

    // Mixing Items for each room
}
