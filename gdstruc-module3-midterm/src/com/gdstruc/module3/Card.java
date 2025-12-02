package com.gdstruc.module3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

 // To create list of card names.

public class Card {

    // This will store all the card names in the deck
    private List<String> deck;

    public Card()
    {
        deck = new ArrayList<String>();
        fillDeck();      // put cards in the deck
        shuffleDeck();   // randomize the order
    }

    private void fillDeck() {

        // 20 card names from MTG
        String[] cardNames = {
                "Abrupt Decay",
                "Cyclonic Rift",
                "Dreadbore",
                "Rakdos Cackler",
                "Underworld Connections",
                "Skymark Roc",
                "Dramatic Rescue",
                "Gore-House Chainwalker",
                "Rakdos Charm",
                "Dreg Mangler",
                "Angel of Serenity",
                "Archon of the Triumvirate",
                "Conjured Currency",
                "Collective Blessing",
                "Ash Zealot",
                "Slime Molding",
                "Common Bond",
                "Racecourse Fury",
                "Pyroconvergence",
                "Axebane Guardian"
        };

        Random random = new Random();

        // Make exactly 30 cards in total
        for (int i = 0; i < 30; i++)
        {
            // Get a random index in the cardNames array
            int randomIndex = random.nextInt(cardNames.length);

            // Get the card name and add it to the deck
            String cardName = cardNames[randomIndex];
            deck.add(cardName);
        }
    }

    private void shuffleDeck()
    {
        Collections.shuffle(deck);
    }

    public List<String> getDeck()
    {
        return deck;
    }
}

