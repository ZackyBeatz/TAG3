/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sun.security.x509.CertificateSubjectName;
import sun.security.x509.CertificateValidity;
import tag2ver4.ItemsFactories.Enemy;
import tag2ver4.Player;

/**
 *
 * @author Ticondrus
 */
public class CombatControllerTest {
    
    public CombatControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
     String name = null;
     Room[][] roomMatrix = new RoomFactory().createRooms();
     Player n1 = new Player(name, 100, roomMatrix[0][0], 1, 0);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Interaction method, of class CombatController.
     */
    @Test
    public void testInteraction() {
        System.out.println("Interaction");
        Player n1 = null;
        n1.getHealth();
        Enemy e1 = null;
        CombatController instance = new CombatController();
        instance.Interaction(n1, e1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Fight method, of class CombatController.
     */
    @Test
    public void testFight() {
        System.out.println("Fight");
        Player n1 = null;
        Enemy e1 = null;
        CombatController instance = new CombatController();
        instance.Fight(n1, e1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Bargain method, of class CombatController.
     */
    @Test
    public void testBargain() {
        System.out.println("Bargain");
        Player n1 = null;
        Enemy e1 = null;
        CombatController instance = new CombatController();
        instance.Bargain(n1, e1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Flee method, of class CombatController.
     */
    @Test
    public void testFlee() {
        System.out.println("Flee");
        Player n1 = null;
        CombatController instance = new CombatController();
        instance.Flee(n1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HelpInFight method, of class CombatController.
     * @param n1
     */
    @Test
    public void testHelpInFight() {
                Player n1 = new Player();
            Boundery b = new Boundery();
        System.out.println("HelpInFight");
              b.helpMenuInfight(n1);
        CombatController instance = new CombatController();
        instance.HelpInFight(n1);
       
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
