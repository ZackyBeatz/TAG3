package tag2ver4;

import tag2ver4.Factories.RoomFactory;
import tag2ver4.HighScoreRelated.HighScoreManager;
import tag2ver4.Entities.Player;
import tag2ver4.Entities.Room;
import tag2ver4.Controllers.GameController;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

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
        HighScoreManager hm = new HighScoreManager();

        b.intro(n1);
        g.StartGame(n1);
        g.runGame(n1);

        hm.addScore("Testy", 0);
        hm.addScore("Bart", 2);
        hm.addScore("sdart", 1);
        hm.addScore("Badrt", 20);
        hm.addScore("ast", 10);
//        hm.addScore(n1.getName(), n1.getPlayerGold());
        System.out.print(hm.getHighscoreString());

        // VI KAN EVT. LAVE ET ARRAY AF SPILLERE, SOM BLIR ADDED TIL VORES HIGH SCORE
        // LIGENU ER DER KUN EN SPILLER
        printMethod(hm);

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

    public static void printMethod(HighScoreManager hm) {
        try {
            String file = "C:\\Users\\Ejer\\Desktop\\Datamatiker\\TagGame3ver1\\TAG3\\TagGameNew\\src\\tag2ver4\\scores.txt";
            String text = hm.getHighscoreString();
            try (BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
                out.write(text);
            }
        } catch (IOException out) {
            System.out.print(out);
        }

    }
}
