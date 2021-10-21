package ru.mirea._31_32_lab.Exceptions;

public class OrderAlreadyAddedException extends Exception
{
    public OrderAlreadyAddedException()
    {
        super("Order already added");
    }
}
