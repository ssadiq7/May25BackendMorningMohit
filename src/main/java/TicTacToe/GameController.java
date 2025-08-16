package TicTacToe;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    private static Scanner scanner = new Scanner(System.in);

    public Game startGame() {
        // Initialize game components
        // Set up the board, players, and any necessary game state

        // Ask for the dimensions of the board
        int dimension = getBoardDimension();

        // Ask for player details
        List<Player> players = getPlayers(dimension);

        // Ask for winning strategies
        // Do you want row winning strategy - Yes or No
        // Do you want column winning strategy - Yes or No
        // Do you want diagonal winning strategy - Yes or No
        List<WinningStrategy> winningStrategies = new ArrayList<>();

        // Create the game object
        return new Game(dimension, players, winningStrategies);
        // Ideally we should return the game object to the client, but for now we will just return it.
        // It is because the client can hamper with the game object and change the state of the game
        // After a new object for the game is created, we should send some ID about the game to the client
        // and the client can use that ID to get the game state
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }

    public void display(Game game) {
        // gameController -> game.display() -> board.display() -> cell.display()
        game.display();
    }

    public void makeMove(Game game) {
        // To-do: Implement the logic to make a move in the game
        // This should include checking if the move is valid, updating the board, and checking for a winner
        // This will eventually call the makeMove method on the Game
        game.makeMove();
    }

    public String getWinner(Game game) {
        return game.getWinner().getName();
    }

    private int getBoardDimension() {
        // Logic to get board dimensions from user input
        System.out.println("Please enter the dimensions of the board (e.g., 3 for a 3x3 board):");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for the board dimensions:");
            scanner.next(); // Clear the invalid input
        }
        return scanner.nextInt();
    }

    private List<Player> getPlayers(int dimension) {
        // Logic to get player details from user input
        System.out.println("Let's add the players now: ");
        // Modify this function to take Bot as well
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < dimension - 1; i++) {
//            System.out.println("Add Player details: Name <space> Symbol");
//            String details = scanner.nextLine();
//            String[] detailsArray = details.split(" ");
//            Player player = new Human(i, detailsArray[0], PlayerType.HUMAN, new Symbol(detailsArray[1]));
            System.out.println("Please enter the Player name: ");
            String name = scanner.next();
            System.out.println("Please enter the Player symbol: ");
            String symbol = scanner.next();
            Player player = new Human(i, name, PlayerType.HUMAN, new Symbol(symbol));
        }
        return players;
    }

}

// gameController -> game.display() -> board.display() -> cell.display()

// |-||-||-|
// |-||-||X|
// |O||-||-|