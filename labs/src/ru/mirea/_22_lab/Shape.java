package ru.mirea._22_lab;

import java.awt.*;

abstract public class Shape
{
    protected Color color;
    protected int posX;
    protected int posY;

    public Shape(Color color, int posX, int posY)
    {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public Color getColor()
    {
        return color;
    }

    public int getPosX()
    {
        return posX;
    }

    public int getPosY()
    {
        return posY;
    }

    abstract public void draw(Graphics g);
}
