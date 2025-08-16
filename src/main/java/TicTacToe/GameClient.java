package TicTacToe;

import java.util.Scanner;

public class GameClient {

    public static Scanner scanner = new Scanner(System.in);

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
//        gameController.display(game);
        // 3. Keep on playing the game until the game is in IN_PROGRESS state
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)) {
            // 3.1. Display the board
//            gameController.display(game);
            // 3.2. Ask the current player to make a move
            gameController.makeMove(game);
            gameController.display(game); // Display the board after the move

            // Support for undo functionality
            System.out.println("Do you want to undo the last move? (yes/no)");
            String undoResponse = scanner.nextLine().trim().toLowerCase();
            if (undoResponse.equals("yes")) {
                gameController.undo(game);
                System.out.println("Last move undone. Current board state:");
                gameController.display(game); // Display the board after undoing the move
            } else if (!undoResponse.equals("no")) {
                System.out.println("Invalid response. Please type 'yes' or 'no'.");
            }
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

// Until last commit, we have implemented the following:
// Set up the flow of the game
// Implemented the display

// Today we will implement the following:
// Implementing the makeMove method to allow players to make moves

// Human
    // Get the input from the player
    // Validate the input
    // Update the board with the move: Mark the cell with the player's symbol + state
    // Update the turn / Switch to the next player
    // Add moves to the history of moves for undo functionality
    // Check if the move results in a win or draw (using all selected winning strategies)
        // Assign the winner
        // Change the game state to SUCCESS or DRAW

// Bot
    // Some algorithm will suggest the move
    // Update the board with the move: Mark the cell with the player's symbol + state
    // Update the turn / Switch to the next player
    // Add moves to the history of moves for undo functionality
    // Check if the move results in a win or draw (using all selected winning strategies)
    // Assign the winner
    // Change the game state to SUCCESS or DRAW



// Summary:
// Requirements
// Class diagram
// Code all the classes (Game, Board, Cell, Player, Move, GameController, WinningStrategy, etc.)
// GameClient



// 1. We have implemented the makeMove method in the Game class to allow players to make moves.
// 2. We have implemented the undo method to allow players to undo their last move.
// 3. We have implemented the display method to show the current state of the board after each move.
// 4. We have implemented the logic to check for a winner or a draw after each move.
// 5. We have added a simple user interface to interact with the game, allowing players to make moves and undo them if needed.
// 6. We have implemented a basic game loop that continues until the game is in a terminal state (win or draw).
// 7. We have added a prompt to ask players if they want to undo their last move, and handle the response accordingly.
// 8. We have displayed the final result of the game, announcing the winner or if it was a draw.
// 9. We have ensured that the game can be played multiple times by resetting the game state and starting over if players choose to play again.
