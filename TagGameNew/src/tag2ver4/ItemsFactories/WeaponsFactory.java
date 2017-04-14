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

        Weapons[] defineWeapons = new Weapons[11];

        defineWeapons[0] = new Weapons(1, " you can slice your bread and spear a beatle", "Pocket Knife");

        defineWeapons[1] = new Weapons(4, " is a standard mele weapon.", "Sword");

        defineWeapons[2] = new Weapons(6, " A powerful rocket launcher wich does a heavy amount of damage.", "Patriot Rocket Launcher");

        defineWeapons[3] = new Weapons(6, " An Arrow that fires a deadly chemical strike.", "Poison Arrow");

        defineWeapons[4] = new Weapons(8, " A strong electricity Attack that can kill an enemy monster with a single shot.", "lightning thunder strike");

        defineWeapons[5] = new Weapons(10, " A Rifle that can aim and shot at a monster's most valnuable place, ex. right at it's head.", "Sniper Rifle");

        defineWeapons[6] = new Weapons(10, " A medium strong mele weapon that can handle level 2 monsters.", "Paladin Sword");

        defineWeapons[7] = new Weapons(13, " A Strong automatic Gun, that have a massive fireing rate and fires 5 shots pr. second when it is warmed up.", "Gattling Gun");

        defineWeapons[8] = new Weapons(16, " A a heavy canon that fires deadly laser strike trhough everything it lights on .", "Laser Canon");

        defineWeapons[9] = new Weapons(20, " A Rocket system that can fire nuclear misles. It do a heavy plast damage but it also leave a deadly nuclear area where it hits.", "Petriot Nuclear Luncher");

        defineWeapons[10] = new Weapons(30, " The ultimate superweapon that kills every hostile you posible can find in this area with a single strike.", "Particle Uplink Destroyer");

        return defineWeapons;

    }

}
