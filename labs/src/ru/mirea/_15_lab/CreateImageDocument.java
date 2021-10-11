package ru.mirea._15_lab;

public class CreateImageDocument implements ICreateDocument
{

    @Override
    public IDocument createNew()
    {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen()
    {
        return new ImageDocument();
    }
}
