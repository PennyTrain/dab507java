public class Match {
    public static void main(String[] args) {
        Player player1 = new Player("Jane", "Doe", false);
        Player player2 = new Player("Joe", "Bloggs", false);

        do {
            player1.getRandomPlayer();
            player2.getRandomPlayer();

        } while (player1.active == player2.active);

        if (player1.active) {
            player1.sayName();
        }

        if (player2.active) {
            player2.sayName();
        }
    }
}

