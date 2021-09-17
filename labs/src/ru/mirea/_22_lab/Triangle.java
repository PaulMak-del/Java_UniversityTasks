package ru.mirea._22_lab;

import java.awt.*;

public class Triangle extends Shape
{
    private int width;
    private int height;

    public Triangle(Color color, int posX, int posY, int width, int height)
    {
        super(color, posX, posY);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(this.color);

        int posX1 = this.posX - this.width;
        int posY1 = this.posY;
        int posX2 = this.posX + this.width;
        int posY2 = this.posY;
        int posX3 = this.posX;
        int posY3 = this.posY + height;

        int[] X = {posX1, posX2, posX3};
        int[] Y = {posY1, posY2, posY3};
        g.fillPolygon(X, Y, 3);
    }
}
