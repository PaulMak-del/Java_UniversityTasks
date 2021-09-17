package ru.mirea._3_lab.ShapeStuff;

public class Square extends Rectangle
{
    public Square()
    {
        super();
    }

    public Square(double side)
    {
        super(side, side);
    }

    public Square(double side, String color, boolean filled)
    {
        super(side, side, color, filled);
    }

    public double getSide()
    {
        return super.getWidth();
    }

    public void setSide(double side)
    {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    public String toString()
    {
        return "Square Arena: " + super.getArea() + "\nSquare Perimeter: " + super.getPerimeter();
    }
}
