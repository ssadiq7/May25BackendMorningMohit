package TicTacToe;

public class Human extends Player {
    private int level;
    private int coins;
    private String name;
    private Symbol symbol;

    public Human(int id, String name, PlayerType playerType, Symbol symbol) {
        super(id, name, playerType, symbol);
        this.level = 1; // Default level
        this.coins = 50; // Default coins
    }
}
