package ru.mirea._31_32_lab.Exceptions;

public class IllegalTableNumberException extends Exception
{
    public IllegalTableNumberException()
    {
        super("Table with that number not exist");
    }
}
