public class Match {

    private Player playerOne;
    private Player playerTwo;
    public Player winner;
    public int numberOfGames;

    public Match(Player playerOne, Player playerTwo, Player winner) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.winner = winner;
    }

    public Player startMatch(Player playerOne, Player playerTwo) {
    }
}