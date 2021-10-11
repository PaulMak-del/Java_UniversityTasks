package ru.mirea._15_lab;

public class CreateTextDocument implements ICreateDocument
{
    @Override
    public IDocument createNew()
    {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen()
    {
        return new TextDocument();
    }
}
