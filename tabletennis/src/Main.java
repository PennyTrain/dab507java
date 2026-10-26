import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", true));
        players.add(new Player("Bob", true));
        players.add(new Player("Charlie", true));
        players.add(new Player("Diana", true));
        players.add(new Player("Alice", true));
        players.add(new Player("Bobby", true));
        players.add(new Player("Chuck", true));
        players.add(new Player("Donald", true));
        players.add(new Player("Alison", true));
        players.add(new Player("Roberta", true));
        players.add(new Player("Mike", true));
        players.add(new Player("Dian", true));
        players.add(new Player("Freya", true));
        players.add(new Player("Brian", true));
        players.add(new Player("Keith", true));
        players.add(new Player("Derreck", true));

        Tournament tournament = new Tournament(players);

        Player playerOne = tournament.getPlayer(0);
        Player playerTwo = tournament.getPlayer(1);

        startGame(Player playerOne, Player playerTwo)

        System.out.println(playerOne.getName());
        System.out.println(playerTwo.getName());
    }


}
