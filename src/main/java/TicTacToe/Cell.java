package TicTacToe;

public class Cell {
    private int row;
    private int coll;
    private CellState cellState;
    private Player player;

    public Cell(int row, int coll) {
        this.row = row;
        this.coll = coll;
        this.cellState = CellState.EMPTY; // Default state is empty
        this.player = null; // No player assigned initially
    }

    public void display() {
        if(cellState == CellState.EMPTY) {
            System.out.print("| - |"); // Display empty cell
        } else if(cellState == CellState.FILLED) {
            System.out.print("| " + player.getSymbol().getSym() + " |");
        }
    }
}
