package ru.mirea._16_17_lab.Exceptions;

public class IllegalTableNumberException extends Exception
{
    public IllegalTableNumberException()
    {
        super("Table with that number not exist");
    }
}
