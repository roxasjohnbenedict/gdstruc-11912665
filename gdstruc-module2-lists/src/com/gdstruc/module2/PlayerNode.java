package com.gdstruc.module2;

public class PlayerNode {
    private Player player;          // The Player object stored in this node
    private PlayerNode nextPlayer;  // Reference to the next node in the linked list

    // Constructor to create a PlayerNode with a given Player
    public PlayerNode(Player player) {
        this.player = player;      // Initialize the player in this node
    }

    // Getter for the player stored in this node
    public Player getPlayer() {
        return player;
    }

    // Setter to update the player in this node
    public void setPlayer(Player player) {
        this.player = player;
    }

    // Getter for the next node in the linked list
    public PlayerNode getNextPlayer() {
        return nextPlayer;
    }

    // Setter to link this node to the next node in the list
    public void setNextPlayer(PlayerNode nextPlayer) {
        this.nextPlayer = nextPlayer;
    }
}
