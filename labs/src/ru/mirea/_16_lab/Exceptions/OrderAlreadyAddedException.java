package ru.mirea._16_lab.Exceptions;

public class OrderAlreadyAddedException extends Exception
{
    public OrderAlreadyAddedException()
    {
        super("Order already added");
    }
}
