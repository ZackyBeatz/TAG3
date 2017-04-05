/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.ItemsFactories;

import tag2ver4.ItemsSuper;
import tag2ver4.Player;

/**
 *
 * @author Zack
 */
public class HealingPotions extends ItemsSuper{

   
    
    private String description;
    private String name;
    private int heal;

    public HealingPotions(String description, String name, int heal) {
        this.description = description;
        this.name = name;
        this.heal = heal;
    }
    
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeal() {
        return heal;
    }

    public void setHeal(int heal) {
        this.heal = heal;
    }

        
    // heals player method
    public void heal(Player n1){
        n1.setHealth(n1.getHealth()+heal);
    }
    
    
     @Override
    public String toString() {
        return "  " + description + "  " + name + " Increases health:  " + heal ;
    }
    
   
    
}
