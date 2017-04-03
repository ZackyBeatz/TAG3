/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.ItemsFactories;

/**
 *
 * @author Ticondrus
 */
public class WeaponsFactory {
    
    
        public Weapons[] defineWeapons() {
            
        Weapons[] defineWeapons = new Weapons[2];

        defineWeapons[0] = new Weapons(1, " is a standard mele weapon.", "Sword");
        defineWeapons[0].setDamage(1);

        defineWeapons[1] = new Weapons(2, " A powerful rocket launcher wich does a heavy amount of damage.", "Patriot Rocket Launcher");
        defineWeapons[0].setDamage(2);
        
        return defineWeapons;

    }
       
        
}

