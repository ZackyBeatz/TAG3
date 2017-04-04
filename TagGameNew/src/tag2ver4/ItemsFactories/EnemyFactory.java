/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.ItemsFactories;

import tag2ver4.ItemsFactories.HealingPotions;

/**
 *
 * @author Ejer
 */
public class EnemyFactory {

    public Enemy[] createenemy() {

        
        Enemy[] enemy = new Enemy[5];

        enemy[0] = new Enemy("Skeletom", "A thin and white son of a bitch, who can't evven figure out hes dead", 5, 10);
        enemy[1] = new Enemy("Snorkl Snake", "A really weird looking snake with a snorkl like protusion on its head", 3, 10);
        enemy[2] = new Enemy("Wicked Witch", "A clasic old witch with a dangourous spell attack", 4, 20);
        enemy[3] = new Enemy("Politician", "Blue suit and an ability to twitch your reality", 6, 50);
        enemy[4] = new Enemy("Dragon", "We all know them, we all fear their warm breath", 5, 100);

        return enemy;
    }

    // Mixing Items for each room
}


