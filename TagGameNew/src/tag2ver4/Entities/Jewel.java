/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.Entities;

/**
 *
 * @author Benedikte
 */
public class Jewel extends ItemsSuper {
    
    private int goldWorth;
    String description;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jewel(int goldWorth, String description, String name) {
        this.goldWorth = goldWorth;
        this.description = description;
        this.name = name;
    }

    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public int getGoldWorth() {
        
        return goldWorth;
    }
   
    public void setGoldWorth(int goldWorth) { 
        
        this.goldWorth= goldWorth;
    }
 
  
      @Override
    public String toString() {
        return"  " +name + "  " +description+  "Worth:  " + goldWorth;
    }
    
    
}
