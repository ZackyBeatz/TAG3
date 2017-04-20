
package tag2ver4.Entities;

import java.util.Random;

/**
 *
 * @author Ticondrus
 */
public class Weapons extends ItemsSuper {
    private int weapons;
    String description;
    String name;
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapons(int weapons, String description, String name) {
        this.weapons = weapons;
        this.description = description;
        this.name = name;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public int getWeapons() {
        
        return weapons;
    }
   
    public void setWeapons(int weapons) { 
        
        this.weapons = weapons;
    }
 
  
      @Override
    public String toString() {
        return"  " +name + "  " + weapons  +  "Damage:" + weapons;
    }


}
