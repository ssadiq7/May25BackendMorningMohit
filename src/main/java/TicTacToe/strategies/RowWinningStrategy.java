package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {

    private HashMap<Integer, HashMap<String, Integer>> rowCount= new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        String symbol = move.getCell().getPlayer().getSymbol().getSym();

        if(!rowCount.containsKey(row)) { // Check if the row is already initialized
            rowCount.put(row, new HashMap<>());
        }
        if(!rowCount.get(row).containsKey(symbol)) { // Check if the symbol is already counted in this row
            rowCount.get(row).put(symbol, 0); // Initialize the count with 0 for this symbol in the row
        }
        // Increment the count / frequency for the symbol in the row
        rowCount.get(row).put(symbol, rowCount.get(row).get(symbol) + 1);

        return rowCount.get(row).get(symbol) == board.getSize(); // Check if the count of this symbol in the row is equal to the board size
        // return true, stating this player is the winner
    }

    @Override
    public void handleUndo(Board board, Move move) {
        int row = move.getCell().getRow();
        String symbol = move.getPlayer().getSymbol().getSym();

        rowCount.get(row).put(symbol, rowCount.get(row).get(symbol) - 1); // Decrement the count for the symbol in the row
    }
}

// Maintain a hashmap and every time a player makes a move, check if the row has all the same symbols.
// If yes, then that player is the winner. If not, then continue the game.

// Visualization of the hashmap for rowCount:
// {
//     0: {
//          "X": 3,
//          "O": 0
//        },
//     1: {
//          "X": 2,
//          "O": 1
//        },
//     2: {
//          "X": 0,
//          "O": 3
//        }
// }
