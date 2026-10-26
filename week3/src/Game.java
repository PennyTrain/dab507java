import java.util.Random;

public class Game {
    public Player playGame(Player p1, Player p2) {
        Random random = new Random();
        int index = random.nextInt(999);

        if (index % 2 == 0) {
            return p1;
        } else {
            return p2;
        }
    }
}
