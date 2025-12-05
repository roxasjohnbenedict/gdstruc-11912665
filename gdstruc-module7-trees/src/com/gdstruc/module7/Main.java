package com.gdstruc.module7;

public class Main
{
    public static void main(String[] args)
    {
        Tree tree = new Tree();

        tree.insert(25);
        tree.insert(17);
        tree.insert(29);
        tree.insert(10);
        tree.insert(16);
        tree.insert(-5);
        tree.insert(60);
        tree.insert(55);

        System.out.println("\nAscending order: ");
        tree.traverseInOrder();

        System.out.println("\nMin: " + tree.getMin());
        System.out.println("Max: " + tree.getMax());

        System.out.println("\nDescending order: ");
        tree.traverseInOrderDescending();
    }
}
