package TicTacToe;

import java.util.List;

public class Board {
    private List<List<Cell>> grid;
    private int size;

    public Board(int size) {
        this.size = size;
        // Initialize the grid with empty cells based on the size
    }
}
