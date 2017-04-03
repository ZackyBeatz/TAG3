/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.ItemsFactories;

import tag2ver4.ItemsSuper;

/**
 *
 * @author Ticondrus
 */
public class Armor extends ItemsSuper {

   
    private int protect;
    String description;
    String name;
    
    
    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
   
   
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Armor(int protect, String description, String name) {
        this.protect = protect;
        this.description = description;
        this.name = name;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 @Override
    public String toString() {
        return "  " + description + "  " + name + "Decrease attack by:  " + protect;
    }
 
}
