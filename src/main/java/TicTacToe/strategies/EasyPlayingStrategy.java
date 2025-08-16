package TicTacToe.strategies;

import TicTacToe.*;

import java.util.List;

public class EasyPlayingStrategy implements BotPlayingStrategy {

    // Difficulty - EASY could be Bot making move in the next empty cell
    @Override
    public Move makeMove(Board board, Player player) {
        for(List<Cell> row : board.getGrid()) {
            for(Cell cell : row) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    // Return the first empty cell as the move
                    return new Move(new Cell(cell.getRow(), cell.getCol()), player);
                }
            }
        }
        return null;
    }

}
