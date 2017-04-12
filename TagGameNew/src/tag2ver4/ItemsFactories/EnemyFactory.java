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

    public Enemy[] CreateEnemy() {

        
        Enemy[] enemy = new Enemy[5];

        enemy[0] = new Enemy("Skeletom", "A thin and white son of a bitch, who can't evven figure out hes dead", 1, 10, 5);
        enemy[1] = new Enemy("Snorkl Snake", "A really weird looking snake with a snorkl like protusion on its head", 2, 10, 6);
        enemy[2] = new Enemy("Wicked Witch", "A classic old witch with a lot of dark magic ", 3, 20, 8);
        enemy[3] = new Enemy("Politician", "Blue suit and an ability to twitch your reality", 5, 50, 25);
        enemy[4] = new Enemy("Dragon", "We all know them, we all fear them, we all run screaming", 10, 100, 50);

        return enemy;
    }

    // Mixing Items for each room
}


