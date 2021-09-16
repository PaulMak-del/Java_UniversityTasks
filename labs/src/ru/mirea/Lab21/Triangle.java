package ru.mirea.Lab21;

import java.awt.*;

public class Triangle extends Shape
{
    private int posX2;
    private int posX3;
    private int posY2;
    private int posY3;

    public Triangle(Color color, int posX, int posY, int posX2, int posY2, int posX3, int posY3)
    {
        super(color, posX, posY);
        this.posX2 = posX2;
        this.posX3 = posX3;
        this.posY2 = posY2;
        this.posY3 = posY3;
    }

    @Override
    public void draw(Graphics g)
    {
        g.setColor(this.color);
        int[] X = {this.posX, this.posX2, this.posX3};
        int[] Y = {this.posY, this.posY2, this.posY3};
        g.fillPolygon(X, Y, 3);
    }
}
