package ru.mirea._15_lab;

import java.util.HashMap;

public class TextDocument implements IDocument
{
    private HashMap<String, Frame> frames = new HashMap<>();

    public void info()
    {
        System.out.println("Text Document");
    }

    public void save(String name, Frame document)
    {
        frames.put(name, document);
    }

    public Frame open(String name)
    {
        return frames.get(name);
    }
}
