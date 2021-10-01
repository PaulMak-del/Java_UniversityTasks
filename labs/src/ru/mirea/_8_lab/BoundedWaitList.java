package ru.mirea._8_lab;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BoundedWaitList<E> extends WaitList<E>
{
    private final int capacity;

    public BoundedWaitList(int capacity)
    {
        this.capacity = capacity;
        this.content = new ConcurrentLinkedQueue<E>();
    }

    public int getCapacity()
    {
        return this.capacity;
    }

    public void add(E element)
    {
        if (this.content.size() < this.capacity)
        {
            this.content.add(element);
        }
        else
        {
            System.out.println("The WaitList Full");
        }
    }
}
