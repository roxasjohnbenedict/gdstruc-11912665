package com.gdstruc.module2;

import java.util.Objects;

public class Player {
    private int id;       // Unique identifier for the player
    private String name;  // Name of the player
    private int level;    // Player's level

    // Constructor to initialize a player
    public Player(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    // Getter and setter for id
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Getter and setter for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Getter and setter for level
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    // Display the player as a string
    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }

    // Check if two players are equal based on id, name, and level
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && level == player.level && Objects.equals(name, player.name);
    }

    // Generate hashcode based on id, name, and level
    @Override
    public int hashCode() {
        return Objects.hash(id, name, level);
    }
}

