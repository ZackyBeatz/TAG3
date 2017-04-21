/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.Controllers;

import java.util.ArrayList;
import tag2ver4.Entities.Enemy;
import tag2ver4.Entities.ItemsSuper;
import tag2ver4.Entities.Jewel;
import tag2ver4.Entities.Player;

/**
 *
 * @author Ejer
 */
public class TreasureController {

    @Override
    public String toString() {
        return "TreasureController{" + "TreasureChest=" + TreasureChest + '}';
    }
     private ArrayList <ItemsSuper> TreasureChest = new ArrayList<>();
     
public void addToTreasure (Enemy e1, Jewel jewel)   {
    TreasureChest.add(e1.getJewel());
    
    
}  

  public void printTreasure(TreasureController tc, Enemy e1) {
        for (int i = 0; i < tc.TreasureChest.size(); i++) {
            System.out.println(e1.getJewel().toString());
        }
    }
}

