/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.Factories;

import tag2ver4.Entities.Skattekiste;

/**
 *
 * @author Ticondrus
 */
public class SkattekisteFactory {
    
    public Skattekiste[] defineSkattekiste() {
        
        Skattekiste defineskattekiste[] = new Skattekiste[2];
        
        defineskattekiste[0] = new Skattekiste(1, "A nice tressure to have. \n", "Platinumpakage");
        
        defineskattekiste[1] = new Skattekiste(1, "A nice tressure to have. \n", "Platinumpakage2");
        
        return defineskattekiste;
        
    }
    
    
    
}
