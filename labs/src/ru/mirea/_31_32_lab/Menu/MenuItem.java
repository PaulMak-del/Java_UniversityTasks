package ru.mirea._31_32_lab.Menu;

public class MenuItem
{
    private double cost;
    private String name;
    private String description;

    public MenuItem(double cost, String name, String description)
    {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public double getCost()
    {
        return this.cost;
    }
    public String getName()
    {
        return this.name;
    }
    public String getDescription()
    {
        return this.description;
    }

    public String toString()
    {
        return "Name: " + this.name + "  Cost: " + this.cost + "  Description: " + this.description;
    }
}
