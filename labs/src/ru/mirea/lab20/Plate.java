package ru.mirea.lab20;

public class Plate extends Dish
{
    private String food;

    public Plate()
    {
        super("Plate", true);
        this.food = "space";
    }

    public Plate(String food)
    {
        super("Plate", false);
        this.food = food;
    }

    public void put(String food)
    {
        this.food = food;
        this.isEmpty = false;
        this.isClear = false;
    }

    public void eat()
    {
        if (this.isEmpty())
        {
            System.out.println("Plate empty");
        }
        else
        {
            this.isEmpty = true;
            this.food = "space";
        }
    }

    public String getFood()
    {
        return this.food;
    }

    @Override
    public String toString()
    {
        return "This is a " + getDishName() + " with " + getFood();
    }
}
