package ru.mirea._19_lab;

public class Circle
{
    private double radius;

    public Circle()
    {
        this.radius = 1;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getPerimeter()
    {
        return 2 + Math.PI * this.radius;
    }

    public double getArea()
    {
        return Math.PI * this.radius * this.radius;
    }

    public String toString()
    {
        return "Radius: " + this.radius +
                "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();
    }
}
