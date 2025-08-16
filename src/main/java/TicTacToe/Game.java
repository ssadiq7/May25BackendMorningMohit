package TicTacToe;

import TicTacToe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private GameState gameState;
    private Player winner;
    private int nextPlayerIndex;
    private List<WinningStrategy> winningStrategies;
    private List<Move> moves;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.board = new Board(dimension);
        this.players = players;
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.IN_PROGRESS;
        this.nextPlayerIndex = 0; // Start with the first player
        this.moves = new ArrayList<>();
        this.winner = null;
    }

    public void display() {
        // This will call the display method of the board to show the current state
        board.display();
    }

    public void validateMove(Move move) {
        // Until we validate the move we should not update the board
        // Cell should be valid
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        if (row < 0 || row > getBoard().getSize() || col < 0 || col > getBoard().getSize() || getBoard().getSize() == 0) {
            throw new IllegalArgumentException("Invalid cell position: (" + row + ", " + col + ")");
        }

        //if(getBoard().getGrid().get(row).get(col).getCellState().equals(CellState.FILLED)) { // This is a chain of getters, better to be put in a utility and reuse wherever needed
        if (getBoard().getCell(row, col).getCellState().equals(CellState.FILLED)) {
            // If the cell is already filled, we should throw an exception
            throw new RuntimeException("Invalid move! Cell (\" + row + \", \" + col + \") is filled already.");
        }
    }

    public void updateGame(Move move, Player currentPlayer) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();

        Cell actualCell = getBoard().getCell(row, col);
        actualCell.setPlayer(currentPlayer);
        actualCell.setCellState(CellState.FILLED);

        nextPlayerIndex = (nextPlayerIndex + 1) % players.size(); // Move to the next player in a circular manner

        move.setCell(actualCell);
        moves.add(move); // Add the move to the list of moves
    }

    public boolean checkWinner(Move move) {
        for (WinningStrategy strategy : winningStrategies) {
            if(strategy.checkWinner(getBoard(), move)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDraw() {
        return moves.size() == (getBoard().getSize() * getBoard().getSize());
    }

    public void makeMove() {
        // First of all, it should identify who's turn it is
        Player currentPlayer = players.get(nextPlayerIndex);
        Move move = currentPlayer.makeMove();

        // Validate the move
        try {
            validateMove(move);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Please try again!");
            return; // Exit if the move is invalid
        }

        // Update the state of the game
        updateGame(move, currentPlayer);

        // Now check the winner
        if(checkWinner(move)) {
            winner = currentPlayer;
            setGameState(GameState.SUCCESS);
        } else if(checkDraw()) {
            setGameState(GameState.DRAW);
        }
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }
}

// To-Do: Modify the Game class to implement builder design pattern