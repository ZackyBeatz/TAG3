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
 * @author Ticondrus
 */
public class Skatekiste extends ItemsSuper {
    
    private int skatte;
    String description;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skatekiste(int skatte, String description, String name) {
        this.skatte = skatte;
        this.description = description;
        this.name = name;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public int getSkatekiste() {
        
        return skatte;
    }
   
    public void setSkatekiste(int weapons) { 
        
        this.skatte = skatte;
    }
 
  
      @Override
    public String toString() {
        return"  " +name + "  " + skatte  +  "Skattefund:" + skatte;
    }
    
    
}
