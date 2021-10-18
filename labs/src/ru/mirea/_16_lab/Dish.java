package ru.mirea._16_lab;

public class Dish implements Item
{
    private double cost;
    private String name;
    private String description;

    public Dish(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public Dish(int cost, String name, String description)
    {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public double getCost()
    {
        return this.cost;
    }

    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String getDescription()
    {
        return this.description;
    }

    public String toString()
    {
        return this.name;
    }
}
