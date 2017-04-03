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

   
    
    private String accdescription;
    private String accName;
    private int heal;

    public HealingPotions(String accdescription, String accName, int heal) {
        this.accdescription = accdescription;
        this.accName = accName;
        this.heal = heal;
    }
    
   
    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccDescription() {
        return accdescription;
    }

    public void setAccDescription(String accdescription) {
        this.accdescription = accdescription;
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
        return "  " + accdescription + "  " + accName + " Increases health:  " + heal ;
    }
    
   
    
}
