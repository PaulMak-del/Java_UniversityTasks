package ru.mirea._16_lab;

public class Drink implements Item
{
    private double cost;
    private String name;
    private String description;

    public Drink(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public Drink(int cost, String name, String description)
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
}
