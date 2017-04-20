/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tag2ver4.ItemsFactories;

/**
 *
 * @author Ticondrus
 */
public class SkatekisteFactory {
    
    public Skatekiste[] defineSkatekiste() {
        
        Skatekiste Defineskatekiste[] = new Skatekiste[2];
        
        Defineskatekiste[0] = new Skatekiste(1, "A nice tressure to have. \n", "Platinumpakage");
        
        Defineskatekiste[1] = new Skatekiste(1, "A nice tressure to have. \n", "Platinumpakage2");
        
        return Defineskatekiste;
        
    }
    
    
    
}
