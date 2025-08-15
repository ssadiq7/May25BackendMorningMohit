package TicTacToe;

public abstract class Player {
    private int id;
    private String name;
    private Symbol symbol;
    private PlayerType playerType;

    public Player(int id, String name, PlayerType playerType, Symbol symbol) {
        this.id = id;
        this.name = name;
        this.playerType = playerType;
        this.symbol = symbol;
    }
}
