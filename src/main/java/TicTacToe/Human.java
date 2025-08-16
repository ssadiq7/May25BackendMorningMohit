package TicTacToe;

import java.util.Scanner;

public class Human extends Player {
    private int level;
    private int coins;
    private static Scanner scanner = new Scanner(System.in);

    public Human(int id, String name, PlayerType playerType, Symbol symbol) {
        super(id, name, playerType, symbol);
        this.level = 1; // Default level
        this.coins = 50; // Default coins
    }

    @Override
    public Move makeMove() {
        // Making a move means taking the input from the user
        System.out.println("Hey! " + getName() + ", it's your turn!. Please make the move.");
        System.out.println("Enter the row in which you want to make the move (0-indexed):");
        int row = scanner.nextInt();
        System.out.println("Enter the column in which you want to make the move (0-indexed):");
        int column = scanner.nextInt();
        // Let's return the move as a Cell object to the caller (Game class)
        Cell cell = new Cell(row, column);
        // Create a Move object with the cell and the player
        // Now we can return the move to the caller
        return new Move(cell, this);
    }
}
