package ru.mirea._31_32_lab.Menu;

public class Dish implements MenuItem
{
    private double cost;
    private final String name;
    private final String description;

    public Dish(String name, String description)
    {
        if (name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.name = name;
        this.description = description;
    }

    public Dish(double cost, String name, String description)
    {
        if (cost <= 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException("Cost must be bigger than 0");

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
