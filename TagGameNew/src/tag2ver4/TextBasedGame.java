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

    }

}
