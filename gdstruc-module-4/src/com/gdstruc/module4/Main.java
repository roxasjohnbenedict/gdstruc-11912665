package com.gdstruc.module4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // increased initial size to 20 so resizing won't happen too fast
        ArrayQueue queue = new ArrayQueue(20);
        Scanner scanner = new Scanner(System.in);

        int gamesCount = 0;
        int playerIDCounter = 1;   // this will give unique IDs
        boolean gameStarted = false;

        while (gamesCount < 10) {

            System.out.println("Press ENTER to continue to next round...");
            scanner.nextLine();   // waits for enter key

            // random number of players entering the queue this turn
            int playersJoining = (int)(Math.random() * 7) + 1;
            System.out.println(playersJoining + " player(s) joined the queue.");

            // add the new players into the match queue
            for (int i = 0; i < playersJoining; i++) {

                int randomLevel = (int)(Math.random() * 100);

                Player p = new Player(playerIDCounter, "Player" + playerIDCounter, randomLevel);
                playerIDCounter++;

                queue.add(p);
                System.out.println(" → " + p.getName() + " (Lvl " + p.getLevel() + ") entered the queue");
            }

            System.out.println("Current queue size: " + queue.size());

            // check to form a match
            while (queue.size() >= 5 && gamesCount < 10) {

                System.out.println("\nA match is starting...");

                // remove 5 players from queue
                for (int i = 0; i < 5; i++) {
                    Player matched = queue.remove();
                    System.out.println(" → " + matched.getName() + " has joined the match");
                }

                gamesCount++;
                System.out.println("Match #" + gamesCount + " completed!\n");
            }

            System.out.println("Players remaining in queue: " + queue.size());
            System.out.println("-----------------------------------------");
        }

        System.out.println("\nAll 10 games have been created.");
    }
}


