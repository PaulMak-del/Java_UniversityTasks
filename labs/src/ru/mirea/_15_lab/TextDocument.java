package ru.mirea._15_lab;

import javax.swing.*;

public class TextDocument implements IDocument
{
    public JTextArea textArea = new JTextArea("", 40, 40);

    public void setText(String text)
    {
        this.textArea.setText(text);
    }

    public String getText()
    {
        return this.textArea.getText();
    }

    public void addTextArea(Frame frame)
    {
        frame.setTitle("Text Document");
        this.textArea.setText("VERY BIG STRING!!!!");
        frame.add(this.textArea);
    }
}
