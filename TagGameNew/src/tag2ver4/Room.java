/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4;


import tag2ver4.ItemsFactories.Armor;
import tag2ver4.ItemsFactories.HealingPotions;
import tag2ver4.ItemsFactories.Weapons;
import tag2ver4.ItemsFactories.Enemy;
/**
 *
 * @author Zack
 */
public class Room {

    private int currentRoom;
    private Room west;
    private Room east;
    private Room north;
    private Room south;
    private final String description;
    private int gold;
    private HealingPotions roomItem1;
    private Weapons roomItem2;
    private Armor roomItem3;
    private Enemy enemy;

    public Enemy getEnemy() {
        return enemy;
    }
    
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public Armor getRoomItem3() {
        return roomItem3;
    }

    public void setRoomItem3(Armor roomItem3) {
        this.roomItem3 = roomItem3;
    }

    public Weapons getRoomItem2() {
        return roomItem2;
    }

    public void setRoomItem2(Weapons roomItem2) {
        this.roomItem2 = roomItem2;
    }

    public HealingPotions getRoomItem1() {
        return roomItem1;
    }

    public void setRoomItem1(HealingPotions roomItem1) {
        this.roomItem1 = roomItem1;
    }
     
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    // initalize each room with the room to its left, right, up and down from current room, as well as if room is locked
    public Room(int currentRoom, String description, int gold ) {
        this.currentRoom = currentRoom;
        this.description = description;
        this.gold = gold;

    }

    @Override
    public String toString() {
        return  description  ;
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

  

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    // call method to get the room of the player depending on where he wants to go
    public Room getWest() {
        return west;
    }

    public Room getEast() {
        return east;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

}
