package ru.mirea._16_lab.Collection;

import ru.mirea._16_lab.Menu.Item;

public class Node
{
    public Item item;
    public Node next;
    public Node prev;

    public Node(Item dData)
    {
        this.item = dData;
    }

    public void displayNode()
    {
        System.out.print("{ " + item + " } ");
    }

}
