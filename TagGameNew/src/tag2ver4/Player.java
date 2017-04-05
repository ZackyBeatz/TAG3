package tag2ver4;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 *
 * @author Zack
 */
public class Player{

    
    String name;
    int health;
    private Room location;
    private int roomNr;
    private int playerGold;
    private ArrayList <ItemsSuper> backPack = new ArrayList<>();
    Random attack = new Random();
    int attack1;
    

   
        public Player(String name, int health, Room location, int roomNr, int playerGold) {
        this.name = name;
        this.health = health;
        this.location = location;
        this.roomNr = roomNr;
        this.playerGold = playerGold;
    }
        
    public int attack(){
        attack1 = attack.nextInt(6) + 1;
        return attack1;
    }    

  
    public int getPlayerGold() {
        return playerGold;
    }


    public void setPlayerGold(int playerGold) {
        this.playerGold = playerGold;
    }

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  "" + name + "";
    }

    public void setName(String name) {
        this.name = name;
        name= name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setLocation(Room location) {
        this.location = location;
    }

    public Room getLocation() {
        return location;
    }

          
    public ArrayList<ItemsSuper> getBackPack() {
        return backPack;
    }
}