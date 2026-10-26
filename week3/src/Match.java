public class Match {

    public void main(String[] args) {
        Player p1 = new Player ("bob");
        Player p2 = new Player ("bob2");
        Game game = new Game();
        System.out.println(game.playGame(p1,p2).name);
    }
}
