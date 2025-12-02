package com.gdstruc.module3;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> deck = new Stack<String>();
        Stack<String> discardedPile = new Stack<String>();
        Stack<String> hand = new Stack<String>();

        CardStack cardStack = new CardStack();
        deck.addAll(cardStack.getCardStack());

        // The game runs while there are still cards in the deck
        while (!deck.isEmpty())
        {

            // Random command (1, 2 or 3)
            int command = getRandomCommand();

            // Random number of cards from 1 to 5
            int x = getRandomValue(1, 5);

            String commandName;

            // Decide what to do based on the command
            switch (command)
            {
                case 1:
                    commandName = "Draw";
                    drawCards(deck, hand, x);
                    break;

                case 2:
                    if (!hand.isEmpty())
                    {
                        commandName = "Discard";
                        discardCards(hand, discardedPile, x);
                    }
                    else
                    {
                        // If no cards in hand, just draw instead
                        commandName = "Draw (no cards to discard)";
                        drawCards(deck, hand, x);
                    }
                    break;

                case 3:
                    if (!discardedPile.isEmpty())
                    {
                        commandName = "Get from discarded pile";
                        getCardsFromDiscardedPile(discardedPile, hand, x);
                    }
                    else
                    {
                        // If discard pile is empty, draw instead
                        commandName = "Draw (discard pile empty)";
                        drawCards(deck, hand, x);
                    }
                    break;

                default:
                    commandName = "Invalid Command";
                    break;
            }
            System.out.println("Command: " + commandName);
            System.out.println("Hand: " + hand);
            System.out.println("Remaining cards in deck: " + deck.size());
            System.out.println("Number of cards in discarded pile: " + discardedPile.size());
            System.out.println("--------------------------------------");
        }
        System.out.println("Player deck is empty. Game over.");
    }

    private static int getRandomCommand()
    {
        return getRandomValue(1, 3);
    }

    private static int getRandomValue(int min, int max)
    {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private static void drawCards(Stack<String> deck, Stack<String> hand, int numCards) {
        for (int i = 0; i < numCards; i++)
        {
            if (!deck.isEmpty())
            {
                // Take from top of deck and put into hand
                String card = deck.pop();
                hand.push(card);
            }
            else
            {
                // No more cards to draw
                break;
            }
        }
    }

    private static void discardCards(Stack<String> hand, Stack<String> discardedPile, int numCards) {
        for (int i = 0; i < numCards; i++)
        {
            if (!hand.isEmpty())
            {
                // Take from hand and put on top of discarded pile
                String card = hand.pop();
                discardedPile.push(card);
            }
            else
            {
                // No more cards to discard
                break;
            }
        }
    }

    private static void getCardsFromDiscardedPile(Stack<String> discardedPile, Stack<String> hand, int numCards) {
        for (int i = 0; i < numCards; i++)
        {
            if (!discardedPile.isEmpty())
            {
                // Take from discard pile and put in hand
                String card = discardedPile.pop();
                hand.push(card);
            }
            else
            {
                // No more cards to retrieve
                break;
            }
        }
    }
}
