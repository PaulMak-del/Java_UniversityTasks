package ru.mirea._9_lab;

public class StudentNotFoundException extends Exception
{
    public StudentNotFoundException(String errorMessage, Throwable err)
    {
        super(errorMessage, err);
    }

    public StudentNotFoundException()
    {
        super();
    }
}
