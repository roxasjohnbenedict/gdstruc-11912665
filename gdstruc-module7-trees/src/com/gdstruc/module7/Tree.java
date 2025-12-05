package com.gdstruc.module7;

public class Tree
{
    private Node root;

    public void insert(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverseInOrder();
        }
    }

    public void traverseInOrderDescending()
    {
        traverseInOrderDescending(root);
    }

    private void traverseInOrderDescending(Node node)
    {
        if (node == null)
        {
            return;
        }

        traverseInOrderDescending(node.getRightChild());
        System.out.println("Data: " + node.getData());
        traverseInOrderDescending(node.getLeftChild());
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public Node getMin()
    {
        if (root == null)
        {
            return null;
        }
        return root.getMin();
    }

    public Node getMax()
    {
        if (root == null)
        {
            return null;
        }
        return root.getMax();
    }
}
