package ru.mirea._22_lab;

import java.awt.*;

public class Circle extends Shape
{
    private int width;
    private int height;
    public Circle(Color color, int posX, int posY, int width, int height)
    {
        super(color, posX, posY);
        this.height = height;
        this.width = width;
    }

    public void draw(Graphics g)
    {
        g.setColor(this.color);
        g.fillOval(this.posX, this.posY, this.width, this.height);
    }
}
