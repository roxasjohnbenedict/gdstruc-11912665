package com.gdstruc.module2;

public class Main {

    public static void main(String[] args)
    {
        // Create Player objects with id, name, and level
        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon= new Player(2, "LethalBacon", 205);
        Player hpDeskjet = new Player(3, "HPDeskjet", 34);

        // Create a linked list to store players
        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        // Add players to the front of the linked list
        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskjet);

        // Print the current linked list
        playerLinkedList.printList();
    }
}
