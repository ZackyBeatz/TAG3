package tag2ver4;

/**
 *
 * @author Zack
 */
public class TextBasedGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Room[][] roomMatrix = new RoomFactory().createRooms();
        GameController g = new GameController();
        Boundery b = new Boundery();
        String name = b.askNamed();
        Player n1 = new Player(name, 100, roomMatrix[0][0], 1, 0);
        b.intro(n1);
        g.StartGame(n1);
//        g.runGame(n1);


        // Highscores
        HighScoreManager hm = new HighScoreManager();
        // VI KAN EVT. LAVE ET ARRAY AF SPILLERE, SOM BLIR ADDED TIL VORES HIGH SCORE
        // LIGENU ER DER KUN EN SPILLER
        hm.addScore(n1.getName(), n1.getPlayerGold());
        
        /*
        --------------------------------------------------------
        ------------FOR AT PRINTE EN HIGHSCORE -----------------
        hm.addScore("Bart",734);
        hm.addScore("Marge",530);
        hm.addScore("Maggie", 320);
        hm.addScore("Homer",700);
        hm.addScore("Lisa",270);

        System.out.print(hm.getHighscoreString());
        */
        
        
    }

}
