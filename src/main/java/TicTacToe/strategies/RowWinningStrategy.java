package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;

public class RowWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}

// Maintain a hashmap and every time a player makes a move, check if the row has all the same symbols.
// If yes, then that player is the winner. If not, then continue the game.