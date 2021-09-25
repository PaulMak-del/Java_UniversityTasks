package ru.mirea._8_lab;

import java.util.Collection;

public interface IWaitList<E>
{
    void add(E element);
    E remove();
    boolean contains(E element);
    boolean containsAll(Collection<E> collection);
    boolean isEmpty();
}
