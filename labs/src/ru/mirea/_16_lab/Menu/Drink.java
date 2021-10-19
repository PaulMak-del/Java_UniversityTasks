package ru.mirea._16_lab.Menu;

public class Drink implements Item
{
    private double cost;
    private String name;
    private String description;

    public Drink(String name, String description)
    {
        if (name.equals("") || description.equals(""))
            throw new IllegalArgumentException();

        this.name = name;
        this.description = description;
    }

    public Drink(double cost, String name, String description)
    {
        if (cost <= 0 || name.equals("") || description.equals(""))
            throw new IllegalArgumentException("Cost must be bigger than 0");

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
        return this.name;
    }

}
