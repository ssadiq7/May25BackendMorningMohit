package TicTacToe;

import TicTacToe.strategies.BotPlayingStrategy;
import TicTacToe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(int id, String name, PlayerType playerType, Symbol symbol, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, playerType, symbol);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategyByDifficultyLevel(botDifficultyLevel);
    }

    @Override
    public Move makeMove(Board board) {
        System.out.println("Hey! " + getName() + ", it's your turn!. Please make the move.");
        return botPlayingStrategy.makeMove(board, this);
    }
}
