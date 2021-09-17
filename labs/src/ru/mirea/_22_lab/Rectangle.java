package ru.mirea._22_lab;

import java.awt.*;

public class Rectangle extends Shape
{
    private int width;
    private int height;

    public Rectangle(Color color, int posX, int posY, int width, int height)
    {
        super(color, posX, posY);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(this.color);
        g.fillRect(this.posX, this.posY, this.width, this.height);
    }
}
