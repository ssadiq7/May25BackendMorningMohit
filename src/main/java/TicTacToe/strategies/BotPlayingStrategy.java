package TicTacToe.strategies;

import TicTacToe.Board;
import TicTacToe.Move;
import TicTacToe.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}
