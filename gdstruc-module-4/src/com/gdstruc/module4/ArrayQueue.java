package com.gdstruc.module4;

import java.util.NoSuchElementException;

public class ArrayQueue {

    private Player[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity) {
        queue = new Player[capacity];
        front = 0;
        back = 0;
    }

    // add player to the "back" of the queue
    public void add(Player p) {

        // check if queue is full → resize
        if (back == queue.length) {
            Player[] bigger = new Player[queue.length * 2];

            // copy old values into new array
            for (int i = 0; i < queue.length; i++) {
                bigger[i] = queue[i];
            }

            queue = bigger;
        }

        queue[back] = p;
        back++;
    }

    // remove the player at the "front" of the queue
    public Player remove() {

        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Player removed = queue[front];
        queue[front] = null;   // optional cleanup
        front++;

        // If queue becomes empty, reset front and back to 0
        if (size() == 0) {
            front = 0;
            back = 0;
        }

        return removed;
    }

    // number of elements in the queue
    public int size() {
        return back - front;
    }
}

