package model;

public class Player {
    // Attributes
    static private int playerCounter;
    private int playerId;
    private String playerName;
    private String playerPosition;
    private int playerNumber;
    private int teamId;

    // Constructor
    public Player(String playerName, String playerPosition, int playerNumber) {
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.playerNumber = playerNumber;
        this.playerId = ++playerCounter;
    }

    // Methods

    public int getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Override
    public String toString() {
        return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerPosition=" + playerPosition
                + ", playerNumber=" + playerNumber + ", teamId=" + teamId + "]";
    }

}
