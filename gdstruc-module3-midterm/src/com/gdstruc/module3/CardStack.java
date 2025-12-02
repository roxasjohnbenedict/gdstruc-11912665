package com.gdstruc.module3;

import java.util.Stack;

public class CardStack {

    private Stack<String> cardStack;

    public CardStack() {
        cardStack = new Stack<String>();
        initializeStack();
    }

    private void initializeStack() {
        Card card = new Card();
        cardStack.addAll(card.getDeck());
    }

    public void push(String card) {
        cardStack.push(card);
    }

    public String pop() {
        return cardStack.pop();
    }

    public String peek() {
        return cardStack.peek();
    }

    public boolean isEmpty() {
        return cardStack.isEmpty();
    }

    public int size() {
        return cardStack.size();
    }

    public Stack<String> getCardStack() {
        return cardStack;
    }
}

