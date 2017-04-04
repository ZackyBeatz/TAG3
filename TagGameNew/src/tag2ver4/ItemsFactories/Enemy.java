/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.ItemsFactories;

import tag2ver4.ItemsSuper;
import tag2ver4.Player;
import tag2ver4.Room;

/**
 *
 * @author Zack
 */
public class Enemy extends ItemsSuper {

   
  
    
    private String name;
    private String description;
    private int enemyDamage;
    private int enemyHealth;
    
    
    

     public Enemy(String name, String description, int enemyDamage, int enemyHealth) {
        this.name = name;
        this.description = description;
        this.enemyDamage = enemyDamage;
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyHealth() {
      
        return enemyHealth;
    }
    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }
   
    public int getEnemyDamage() {
        return enemyDamage;
    }
    
    public int decreaseEnemyHealth(Player n1){
        return enemyHealth-n1.attack();
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public void enemyHit(Player n1){
        n1.setHealth(n1.getHealth()-enemyDamage);
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

  
}
