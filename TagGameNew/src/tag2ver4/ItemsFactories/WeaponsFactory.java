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
        defineWeapons[0].setDamage(4);

        defineWeapons[1] = new Weapons(2, " A powerful rocket launcher wich does a heavy amount of damage.", "Patriot Rocket Launcher");
        defineWeapons[1].setDamage(6);

        defineWeapons[3] = new Weapons(4, " An Arrow that fires a deadly chemical strike.", "Poison Arrow");
        defineWeapons[3].setDamage(6);

        defineWeapons[4] = new Weapons(5, " A strong electricity Attack that can kill an enemy monster with a single shot.", "lightning thunder strike");
        defineWeapons[4].setDamage(8);
        
        defineWeapons[5] = new Weapons(6, " A Rifle that can aim and shot at a monster's most valnuable place, ex. right at it's head.", "Sniper Rifle");
        defineWeapons[5].setDamage(10);
        
        return defineWeapons;

    }
       
        
}

