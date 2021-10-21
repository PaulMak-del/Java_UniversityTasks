package ru.mirea._31_32_lab.Collection;

import ru.mirea._31_32_lab.Menu.MenuItem;

public class Node
{
    public MenuItem item;
    public Node next;
    public Node prev;

    public Node(MenuItem dData)
    {
        this.item = dData;
    }

    public void displayNode()
    {
        System.out.print("{ " + item + " } ");
    }

}
