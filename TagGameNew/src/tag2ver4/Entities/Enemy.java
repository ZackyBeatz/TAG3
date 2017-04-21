/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.Entities;

import java.util.Random;

/**
 *
 * @author Zack
 */
public class Enemy extends ItemsSuper {

   

    
    
    public Random getAttack() {
        return attack;
    }

    public void setAttack(Random attack) {
        this.attack = attack;
    }

   
  
    
    private String name;
    private String description;
    private int enemyDamage;
    private int enemyHealth;
    Random attack = new Random();
    private int goldfind;
    private Jewel jewel;

 

    public Enemy(String name, String description, int enemyDamage, int enemyHealth, int goldfind, Jewel jewel) {
        this.name = name;
        this.description = description;
        this.enemyDamage = enemyDamage;
        this.enemyHealth = enemyHealth;
        this.goldfind = goldfind;
        this.jewel = jewel;
    }
   public Jewel getJewel() {
        return jewel;
    }

    public void setJewel(Jewel jewel) {
        this.jewel = jewel;
    }
  
    

    @Override
    public String toString() {
        return  "A  "+name +   "  attacks you!\n   It is " + description + "\n with an attack that damages your health minimum: " + enemyDamage + "\nYou enemy's health:  " + enemyHealth;
    }
    
     public int getGoldfind() {
        return goldfind;
    }

    public void setGoldfind(int goldfind) {
        this.goldfind = goldfind+attack.nextInt(5);
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
    
  

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
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
