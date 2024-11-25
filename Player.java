/**
    * Our Connect Four Game for the comprehensive project!
    * @author Ashika Kamjula, Sebastian Rivera, Emre Yilmazer, Layton Laurita
*/

public class Player {
    /** Sets the player_one var to 1 */
    public static final int PLAYER_ONE = 1;

    /** Sets the player_two var to 2 */
    public static final int PLAYER_TWO = 2;

    /** Private int id */
    private int id;

    /** Private String for the name */
    private String name;

    /**
     * Constructs player, and checks to make sure that the player ID/name is valid
     * @param id takes a player id
     * @param name takes a player name
     * @throws IllegalArgumentException If the players ID or name are invalid
     */
    public Player(int id, String name) {
        // Invalid ID!!
        if (id != PLAYER_ONE && id != PLAYER_TWO) {
            throw new IllegalArgumentException("Invalid player ID");
        }

        // Empty name case
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Player name cannot be empty");
        }
        this.id = id;
        this.name = name.trim();
    }

    /**
     * Getter for getting the player id
     * @return ID
     */
    public int getId() {
        return id;
    }

    /**
     * Getter for getting the player name
     * @return name
     */
    public String getName() {
        return name;
    }
}
