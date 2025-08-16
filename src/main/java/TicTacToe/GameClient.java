package TicTacToe;

public class GameClient {
    public static void main(String[] args) {

        System.out.println("Welcome to Tic Tac Toe!");
        GameController gameController = new GameController(); // Implement Singleton pattern if needed

        /*
        * 1. To start the game, we need to create the Game object
        * 2. If we check the Game class, it has dependencies on Board, Player(list of players) and WinningStrategy.
        * * 2.1. Client will pass dimensions of the board
        * * 2.2. Player details
        * * 2.3. Select the winning strategies
        * 3. Keep on playing the game until the game is in IN_PROGRESS state.
        * * 3.1. Display the board
        * * 3.2. Ask the current player to make a move
        * * * 3.2.1. We will also check the winner and update the state if required        *
        * 4. Check the winner / draw state and announce the result
        * 5. Ask the players if they want to play again
        * * 5.1. If yes, then reset the game state and start again
        * * 5.2. If no, then exit the game
         */

        // 2. Create the Game object: start the game
        Game game = gameController.startGame();
        gameController.display(game);
        // 3. Keep on playing the game until the game is in IN_PROGRESS state
        while(gameController.getGameState(game).equals(GameState.NOT_STARTED)) {
            // 3.1. Display the board
            gameController.display(game);
            // 3.2. Ask the current player to make a move
            gameController.makeMove(game);
        }
        // 4. Check the winner / draw state and announce the result
        if(gameController.getGameState(game).equals(GameState.SUCCESS)) {
            System.out.println("Congratulations! The winner is: " + gameController.getWinner(game));
        } else if(gameController.getGameState(game).equals(GameState.DRAW)) {
            System.out.println("The game is a draw!");
        } else {
            System.out.println("The game has ended in an unexpected state.");
        }
    }
}
