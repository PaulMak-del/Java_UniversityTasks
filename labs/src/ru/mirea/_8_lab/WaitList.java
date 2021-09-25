package ru.mirea._8_lab;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E>
{
    protected ConcurrentLinkedQueue<E> content;

    public WaitList()
    {
        this.content = new ConcurrentLinkedQueue<>();
    }
    public WaitList(Collection<E> content)
    {
        this.content = new ConcurrentLinkedQueue<>(content);
    }

    public String toString()
    {
        return this.content.toString();
    }

    @Override
    public void add(E element)
    {
        this.content.add(element);
    }

    @Override
    public E remove()
    {
        return this.content.poll();
    }

    @Override
    public boolean contains(E element)
    {
        return this.content.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> collection)
    {
        return this.content.contains(collection);
    }

    @Override
    public boolean isEmpty()
    {
        return this.content.isEmpty();
    }
}
