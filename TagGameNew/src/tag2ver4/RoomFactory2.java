package tag2ver4;

import tag2ver4.ItemsFactories.Armor;
import tag2ver4.ItemsFactories.ArmorFactory;
import tag2ver4.ItemsFactories.Enemy;
import tag2ver4.ItemsFactories.EnemyFactory;
import tag2ver4.ItemsFactories.HealingPotions;
import tag2ver4.ItemsFactories.HealingPotionsFactory;
import tag2ver4.ItemsFactories.Weapons;
import tag2ver4.ItemsFactories.WeaponsFactory;

/**
 *
 * @author Henrik
 */
public class RoomFactory2 {
        public Room[][] createRooms() {

        // initalise room
        Room[][] roomMatrix2 = new Room[3][3];

        HealingPotions[] newPotions = new HealingPotionsFactory().createPotions();
        Weapons[] newWeapon = new WeaponsFactory().defineWeapons();
        Armor[] newArmor = new ArmorFactory().defineArmor();
        Enemy[] newEnemy = new EnemyFactory().CreateEnemy();
   

        // initalise position for each room
        roomMatrix2[0][0] = new Room(1, "\n"
                + "--------------------------------------------------------------------\n"
                + "You are in the entrance room.\n "
                + "You find some gold and pick it up \n"
                + "Suddenly you hear a large crash and see a lot of dust coming\n"
                + "out of the tunnel you just left. \n"
                + "There are two tunnels leading out of this room. One heading north\n"
                + "and one heading east.\n"
                + "--------------------------------------------------------------------", 3);

        roomMatrix2[0][1] = new Room(2, "\n"
                + "--------------------------------------------------------------------\n"
                + "Your enter a large room. It is so large\n"
                + "that you can hear the ecco of your breathing.\n"
                + "You find more some goldcoins and automatically pick them up.\n"
                + "There at two doors in this room.\n"
                + "One headed north and one headed west.\n"
                + "--------------------------------------------------------------------", 6);

        roomMatrix2[0][2] = new Room(3, "\n"
                + "--------------------------------------------------------------------\n"
                + "This a long, and narrow room. You can\n"
                + "choose an opening west or one south.\n"
                + " --------------------------------------------------------------------", 8);

        roomMatrix2[0][3] = new Room(4, "\n"
                + "--------------------------------------------------------------------\n"
                + "You are know entering a small room. It \n"
                + "has an opening to the east and one to the west.\n"
                + "--------------------------------------------------------------------", 4);

        roomMatrix2[1][0] = new Room(5, "\n"
                + "--------------------------------------------------------------------\n"
                + "In this room you see an old chair \n "
                + "and two openings. Choose south or east.\n"
                + "--------------------------------------------------------------------", 9);

        roomMatrix2[1][1] = new Room(6, "\n"
                + "--------------------------------------------------------------------\n"
                + "Now you find a room with a statue of an angel\n"
                + "There are 3 openings. Go east, north or south.\n"
                + "--------------------------------------------------------------------", 7);

        roomMatrix2[1][2] = new Room(7, "\n"
                + "--------------------------------------------------------------------\n"
                + "It looks as you have entered a tomb. \n"
                + "This room contains a large coffin. You can flee either to  \n"
                + "the north or the west.\n"
                + "--------------------------------------------------------------------", 6);
        roomMatrix2[1][3] = new Room(8, "\n"
                + "--------------------------------------------------------------------\n"
                + "In this room the walls are sloping. \n"
                + "You can choose between a south or a west opening.\n"
                + "--------------------------------------------------------------------", 4);

        roomMatrix2[2][0] = new Room(9, "\n"
                + "--------------------------------------------------------------------\n"
                + "You are almost blinded by the light of the outside world.\n"
                + "--------------------------------------------------------------------", 3);

        roomMatrix2[2][1] = new Room(10, "\n"
                + "--------------------------------------------------------------------\n"
                + "You are almost blinded by the light of the outside world.\n"
                + "--------------------------------------------------------------------", 2);
        

        roomMatrix2[2][2] = new Room(11, "\n"
                + "--------------------------------------------------------------------\n"
                + "You are almost blinded by the light of the outside world.\n"
                + "--------------------------------------------------------------------", 1);        
        

        roomMatrix2[2][3] = new Room(12, "\n"
                + "--------------------------------------------------------------------\n"
                + "You are almost blinded by the light of the outside world.\n"
                + "--------------------------------------------------------------------", 5);        
        
        
        
        
        
        
       // EXITS FOR EACH ROOM
        // DOOR 1
        roomMatrix2[0][0].setNorth(roomMatrix2[0][3]);
        roomMatrix2[0][0].setEast(roomMatrix2[0][1]);

        // DOOR 2
        roomMatrix2[0][1].setEast(roomMatrix2[0][0]);
        roomMatrix2[0][1].setWest(roomMatrix2[0][2]);

        // DOOR 3
        roomMatrix2[0][2].setNorth(roomMatrix2[1][1]);
        roomMatrix2[0][2].setWest(roomMatrix2[0][1]);

        // door 4
        roomMatrix2[0][3].setNorth(roomMatrix2[1][2]);
        roomMatrix2[0][3].setEast(roomMatrix2[1][0]);
        roomMatrix2[0][3].setSouth(roomMatrix2[0][0]);

        // door 5
        roomMatrix2[1][0].setEast(roomMatrix2[1][1]);
        roomMatrix2[1][0].setWest(roomMatrix2[0][3]);

        // door 6
        roomMatrix2[1][1].setNorth(roomMatrix2[2][0]);
        roomMatrix2[1][1].setSouth(roomMatrix2[0][2]);
        roomMatrix2[1][1].setWest(roomMatrix2[1][0]);

        // door 7
        roomMatrix2[1][2].setNorth(roomMatrix2[2][1]);
        roomMatrix2[1][2].setSouth(roomMatrix2[0][3]);

        // door 8
        roomMatrix2[1][3].setNorth(roomMatrix2[2][2]);

        // door 9
        roomMatrix2[2][0].setNorth(roomMatrix2[2][3]);
        roomMatrix2[2][0].setSouth(roomMatrix2[1][1]);

        // door 10
        roomMatrix2[2][1].setEast(roomMatrix2[2][2]);
        roomMatrix2[2][1].setSouth(roomMatrix2[1][2]);

        // door 11
        roomMatrix2[2][2].setEast(roomMatrix2[2][3]);
        roomMatrix2[2][2].setSouth(roomMatrix2[2][1]);
        roomMatrix2[2][2].setWest(roomMatrix2[1][3]);

        // door 12
        roomMatrix2[2][3].setSouth(roomMatrix2[2][0]);
        roomMatrix2[2][3].setWest(roomMatrix2[2][2]);        
        // door North == victory ???;// EXIT
        
     
        
        // SET ITEMS ON EACH ROOM 
        // PROBLEM ?? SO FAR I CAN ONLY HAVE ONE ITEM PER ROOM
        // DOOR 1 Items
        roomMatrix2[0][0].setRoomItem1(newPotions[0]);
        roomMatrix2[0][0].setRoomItem2(newWeapon[0]);
     
        // DOOR 2 items
        roomMatrix2[0][1].setRoomItem1(newPotions[0]);
        roomMatrix2[0][1].setRoomItem3(newArmor[1]);
        
        // DOOR 3 items
        roomMatrix2[0][2].setRoomItem3(newArmor[0]);
        
        // DOOR 4 items
        roomMatrix2[0][3].setRoomItem1(newPotions[1]);
        roomMatrix2[0][3].setRoomItem2(newWeapon[1]);
        
        // DOOR 5 items
        roomMatrix2[1][0].setRoomItem2(newWeapon[1]);
        roomMatrix2[1][0].setRoomItem1(newPotions[2]);
        
        // DOOR 6 items
        roomMatrix2[1][1].setRoomItem1(newPotions[1]);
        
        // DOOR 7 items
        roomMatrix2[1][2].setRoomItem3(newArmor[1]);
        
        // DOOR 8 items  
        roomMatrix2[1][3].setRoomItem2(newWeapon[0]);
        roomMatrix2[1][3].setEnemy(newEnemy[1]);
        
        // DOOR 9 items 
        roomMatrix2[2][0].setRoomItem1(newPotions[2]);
        
        // DOOR 10 items
        roomMatrix2[2][1].setRoomItem3(newArmor[1]);
        
        // DOOR 11 items
        roomMatrix2[2][2].setRoomItem2(newWeapon[0]);
        roomMatrix2[2][2].setEnemy(newEnemy[1]);
        
        // DOOR 12 items 
        roomMatrix2[2][3].setRoomItem1(newPotions[2]);
        
        return roomMatrix2;
    } 
}
