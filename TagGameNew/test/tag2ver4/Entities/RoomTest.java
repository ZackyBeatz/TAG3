/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.Entities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ejer
 */
public class RoomTest {
    Room r;
    public RoomTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r = new Room (8, "\n"
                + "--------------------------------------------------------------------\n"
                + "In this room the walls are sloping. \n"
                + "You can choose between a south or a west opening.\n"
                + "--------------------------------------------------------------------", 4);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEnemy method, of class Room.
    
     */
    @Test
    public void testGetEnemy() {
        Enemy e1 = new Enemy("Snorkl Snake", "A really weird looking snake with a snorkl like protusion on its head", 3, 10, 6);
        System.out.println("getEnemy");
        Room instance =r;
        Enemy expResult = e1;
        Enemy result = instance.getEnemy();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnemy method, of class Room.
     */
    @Test
    public void testSetEnemy() {
        System.out.println("setEnemy");
        Enemy e1 = new Enemy("Snorkl Snake", "A really weird looking snake with a snorkl like protusion on its head", 3, 10, 6);
        Room instance = r;
        instance.setEnemy(e1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomItem3 method, of class Room.
     */
    @Test
    public void testGetRoomItem3() {
        System.out.println("getRoomItem3");
        Room instance = null;
        Armor expResult = null;
        Armor result = instance.getRoomItem3();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomItem3 method, of class Room.
     */
    @Test
    public void testSetRoomItem3() {
        System.out.println("setRoomItem3");
        Armor roomItem3 = null;
        Room instance = null;
        instance.setRoomItem3(roomItem3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomItem2 method, of class Room.
     */
    @Test
    public void testGetRoomItem2() {
        System.out.println("getRoomItem2");
        Room instance = null;
        Weapons expResult = null;
        Weapons result = instance.getRoomItem2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomItem2 method, of class Room.
     */
    @Test
    public void testSetRoomItem2() {
        System.out.println("setRoomItem2");
        Weapons roomItem2 = null;
        Room instance = null;
        instance.setRoomItem2(roomItem2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoomItem1 method, of class Room.
     */
    @Test
    public void testGetRoomItem1() {
        System.out.println("getRoomItem1");
        Room instance = null;
        HealingPotions expResult = null;
        HealingPotions result = instance.getRoomItem1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoomItem1 method, of class Room.
     */
    @Test
    public void testSetRoomItem1() {
        System.out.println("setRoomItem1");
        HealingPotions roomItem1 = null;
        Room instance = null;
        instance.setRoomItem1(roomItem1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGold method, of class Room.
     */
    @Test
    public void testGetGold() {
        System.out.println("getGold");
        Room instance = null;
        int expResult = 0;
        int result = instance.getGold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGold method, of class Room.
     */
    @Test
    public void testSetGold() {
        System.out.println("setGold");
        int gold = 0;
        Room instance = null;
        instance.setGold(gold);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Room.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Room instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCurrentRoom method, of class Room.
     */
    @Test
    public void testGetCurrentRoom() {
        System.out.println("getCurrentRoom");
        Room instance = null;
        int expResult = 0;
        int result = instance.getCurrentRoom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCurrentRoom method, of class Room.
     */
    @Test
    public void testSetCurrentRoom() {
        System.out.println("setCurrentRoom");
        int currentRoom = 0;
        Room instance = null;
        instance.setCurrentRoom(currentRoom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWest method, of class Room.
     */
    @Test
    public void testGetWest() {
        System.out.println("getWest");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getWest();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEast method, of class Room.
     */
    @Test
    public void testGetEast() {
        System.out.println("getEast");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getEast();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNorth method, of class Room.
     */
    @Test
    public void testGetNorth() {
        System.out.println("getNorth");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getNorth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSouth method, of class Room.
     */
    @Test
    public void testGetSouth() {
        System.out.println("getSouth");
        Room instance = null;
        Room expResult = null;
        Room result = instance.getSouth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWest method, of class Room.
     */
    @Test
    public void testSetWest() {
        System.out.println("setWest");
        Room west = null;
        Room instance = null;
        instance.setWest(west);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEast method, of class Room.
     */
    @Test
    public void testSetEast() {
        System.out.println("setEast");
        Room east = null;
        Room instance = null;
        instance.setEast(east);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNorth method, of class Room.
     */
    @Test
    public void testSetNorth() {
        System.out.println("setNorth");
        Room north = null;
        Room instance = null;
        instance.setNorth(north);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSouth method, of class Room.
     */
    @Test
    public void testSetSouth() {
        System.out.println("setSouth");
        Room south = null;
        Room instance = null;
        instance.setSouth(south);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
