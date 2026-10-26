import java.util.List;

public class Tournament {

    private List<Player> players;
    private Player winner;

    public Tournament(List<Player> players) {
        this.players = players;
        this.winner = null;
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }

    public int getNumberOfPlayers() {
        return players.size();
    }
}