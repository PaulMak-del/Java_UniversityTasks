package ru.mirea._8_lab;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UnfairWaitList<E> extends WaitList<E>
{
    public UnfairWaitList()
    {
        this.content = new ConcurrentLinkedQueue<>();
    }

    public void remove(E element)
    {
        this.content.remove(element);
    }

    public void moveToBack(E element)
    {
        Iterator<E> it = this.content.iterator();
        while (it.hasNext())
        {
            E elementIn = it.next();
            if (elementIn.equals(element))
            {
                it.remove();
                this.content.add(elementIn);
            }
        }
    }
}
