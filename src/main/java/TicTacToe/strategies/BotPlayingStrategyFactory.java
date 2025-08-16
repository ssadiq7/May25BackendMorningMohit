package TicTacToe.strategies;

import TicTacToe.BotDifficultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategyByDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        switch (botDifficultyLevel) {
            case EASY:
                return new EasyPlayingStrategy();
            case MEDIUM:
                return new MediumPlayingStrategy();
            case HARD:
                return new HardPlayingStrategy();
            default:
                throw new IllegalArgumentException("Unknown bot difficulty level: " + botDifficultyLevel);
        }
    }
}
