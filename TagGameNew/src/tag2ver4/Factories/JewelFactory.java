/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.Factories;

import tag2ver4.Entities.Jewel;

/**
 *
 * @author Benedikte
 */
public class JewelFactory {
    public Jewel[]createJewels(){
        Jewel makeJewels [] = new Jewel[4];
        
        makeJewels[0]=new Jewel (5, "Red, with a deep glow", "Ruby");
        makeJewels[1]=new Jewel (7, "Green, like the eyes of a perfect redhead", "Emerald");
        makeJewels[2]=new Jewel (10, "Blue, sparkly and flawless", "Sapphire");
        makeJewels[3]=new Jewel (20, "As the light shines through it, the room is lit in all the colours of the rainbow", "Diamond");
        
        return makeJewels;
    }
    
}
