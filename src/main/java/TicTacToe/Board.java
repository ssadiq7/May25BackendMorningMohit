package TicTacToe;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> grid;
    private int size;

    public Board(int size) {
        this.size = size;
        // Initialize the grid with empty cells based on the size
        grid = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            grid.add(new ArrayList<>());
            for (int j = 0; j < size; j++) {
                grid.get(i).add(new Cell(i, j)); // Create a new cell for each
            }
        }
    }

    public void display() {
        // Logic to display the board
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid.get(i).get(j).display();
            }
            System.out.println(); // New line after each row
        }
    }
}
