/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.Factories;

import tag2ver4.Entities.Armor;

/**
 *
 * @author Ticondrus
 */
public class ArmorFactory {

    public Armor[] defineArmor() {

        Armor Definearmor[] = new Armor[3];

        Definearmor[0] = new Armor(1, "Armor is your shield against hostile monsters \n", "Armor");

        Definearmor[1] = new Armor(2, "Armor is your shield against hostile monsters \n", "Armor2");
        
        Definearmor[2] = new Armor(3, "This armor could be f.ex monsters immunity over a specific weapon...\n", "MonsterArmor");
       

        return Definearmor;

    }

   

}
