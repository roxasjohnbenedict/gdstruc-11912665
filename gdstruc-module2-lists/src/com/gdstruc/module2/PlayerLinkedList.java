package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;
    private int size; // Tracks the number of elements in the linked list

    // Add a player to the front of the list
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        size++; // Increase size whenever a new node is added
    }

    // Remove the first element of the list
    public void removeFirst() {
        if (head != null) {
            head = head.getNextPlayer();
            size--; // Decrease size after removal
        } else {
            System.out.println("List is already empty!");
        }
    }

    // Get the current size of the list
    public int getSize() {
        return size;
    }

    // Check if the list contains a player
    public boolean contains(Player player) {
        PlayerNode current = head;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return true;
            }
            current = current.getNextPlayer();
        }
        return false;
    }

    // Get the index of a player in the list (-1 if not found)
    public int indexOf(Player player) {
        PlayerNode current = head;
        int index = 0;
        while (current != null) {
            if (current.getPlayer().equals(player)) {
                return index;
            }
            current = current.getNextPlayer();
            index++;
        }
        return -1; // Not found
    }

    // Print the list
    public void printList() {
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}

