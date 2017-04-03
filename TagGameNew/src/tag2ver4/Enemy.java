/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4;

/**
 *
 * @author Zack
 */
public class Enemy extends Player{
    
    private String description;
    private int enemyDamage;

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    
    // UNNECCESARY ROOMNR, AND PLAYERGOLD FOR ENEMY.  I EXTENDED FROM PLAYER 
    public Enemy(String name, int health, Room location, int roomNr, int playerGold) {
        super(name, health,location, roomNr, playerGold);
        super.setLocation(location);
    }
    
    public void enemyHit(Player n1){
        n1.setHealth(n1.getHealth()-enemyDamage);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    
}
