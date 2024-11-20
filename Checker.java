/**
 * Our Connect Four Game for the comprehensive project!
 * @author Ashika Kamjula
 */

public class Checker {

    /** Default marker for Player 1 */ 
    public static final char PLAYER1_MARKER = 'X';
    
    /** Default marker for Player 2 */
    public static final char PLAYER2_MARKER = 'O';
    
    /** Placeholder for marker of current player */
    private char marker;

    /** 
     * Allows the user to assign/refer to marker of current player.
     * @param marker is the marker of the current player of the game
     */
    public Checker(char marker) {
        this.marker = marker;
    }

    /** 
     * Allows access to current player's marker.
     * @return the marker of the current player
     */
    public char getMarker() {
        return marker;
    }

    /** 
     * Allows ability to change marker of current player.
     * @param marker is the marker of the current player of the game
     */
    public void setMarker(char marker) {
        this.marker = marker;
    }
}

