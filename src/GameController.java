/**
 * Created by pivotal on 11/2/16.
 */
public class GameController {

    public static void main(String... args) {
        System.out.println("Starting game ...");
        Game game = new Game();
        game.start();

        int rollInput = Integer.valueOf(System.console().readLine());
        System.out.println("rollInput ["+rollInput+"]");

    }

}
