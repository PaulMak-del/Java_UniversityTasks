package ru.mirea._16_17_lab.Collection;

import ru.mirea._16_17_lab.Menu.Item;

public class DoublyLinkList
{
    private Node node;
    private int size;

    public DoublyLinkList()
    {
        node = null;
        size = 0;
    }

    public boolean isEmpty()
    {
        return node == null;
    }

    public void display()
    {
        if (this.node == null)
        {
            System.out.println("List is empty");
            return;
        }

        System.out.print("List (first --> last): ");
        Node current = node;
        do
        {
            current.displayNode();
            current = current.next;
        } while (current != node);
        System.out.println();
    }

    public boolean insert(Item item)
    {
        Node newNode = new Node(item);
        if ( isEmpty() )
        {
            node = newNode;
            node.next = newNode;
            node.prev = newNode;
        }
        else
        {
            node.prev =  newNode;
            Node current = node;
            while(current.next != node)
            {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
            newNode.next = node;
        }
        size++;
        return true;
    }

    public boolean deleteItem(String itemName)
    {
        Node current = node;

        while (!current.item.getName().equals(itemName))
        {
            current = current.next;
            if (current == node)
                return false;
        }

        if (current == node)
        {
            node.next.prev = node.prev;
            node.prev.next = node.next;
            node = node.next;
        }
        else
        {
            current.next.prev = current.prev;
            current.prev.next = current.next;
        }

        size--;
        return true;
    }

    public Item get(int index)
    {
        assert (index <= size) : "ERROR: index > size";

        Node current = node;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }

        return current.item;
    }

    public int size()
    {
        return size;
    }
}
