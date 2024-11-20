import java.util.*;

/**
 * Our Connect Four Game for the comprehensive project!
 * @author Ashika Kamjula, Sebastian Rivera, Emre Yilmazer, Layton Laurita
 * @since Wed, Nov 13 (12:30PM)
 */

public class ConnectFour {

    /** Number of pieces needed to be connected to win */
    public static final int PIECES_TO_WIN = 4;

    /** Column size of the grid */
    public static final int COLUMN_SIZE = 8;

    /** Row size of the grid */
    public static final int ROW_SIZE = 8;
    
    public static final char EMPTY_SLOT = ' ';

    /**
     * @param args command-line parameters (not used)
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean gameWon = false;

        System.out.print("Welcome to Connect Four.");
        System.out.print("Two players will take turns entering pieces until there is a win ");
        System.out.print("(four pieces in a column in either horizontal, vertical or diagonal orientation). ");
        System.out.println("Make sure to choose \'X\' or \'O\' only for markers.");

        setupPlayer();

        while (gameWon = false) {
            // display board

            // Player 1, place checker in column (1-8):

            // Check if move valid

            // Do move if valid, else ask again 

            // Check if game is won
        }
    }

    /**
     * Makes players choose valid markers
     */
    public static void setupPlayer() {
        String Player1 = "";
        String Player2 = "";
        boolean marker = false;
        while (marker == false) {
            System.out.print("Choose Marker (X or O):");
            String m = scanner.next();
            if (!m.equalsIgnoreCase("X") || !m.equalsIgnoreCase("O")) {
                marker = false;
            }
            else if (m.equalsIgnoreCase("X")) {
                Player1 += "X";
                Player2 += "O";
                marker = true;
            }
            else {
                Player1 += "O";
                Player2 += "X";
                marker = true;
            }
        }
    }

    /**
     * Our display method!
     * @param column controls the columns for the board
     * @return
     */
    public static void display(int column) {
        return;
    }

    /**
     * DropChecker
     */
    public static void dropChecker() {
        return;
    }

    /**
     * Checks if the move is valid or not
     * @param column the column that the player places the checker on
     * @return whether the move is valid or not
     */
    public static boolean validateMove(int column) {
        return;
    }
}
