package LLD3.DesignSnakeAndLadderGame;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private Dice dice;
    private int nextPlayerIndex;
    private GameState gameState;
    private Player winner;
    private List<Move> moves;
}
