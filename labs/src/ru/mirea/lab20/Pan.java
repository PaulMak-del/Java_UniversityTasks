package ru.mirea.lab20;

public class Pan extends Dish
{
    public Pan()
    {
        super("Pan", true);
    }

    public void cook()
    {
        this.isClear = false;
    }

    @Override
    public String toString()
    {
        return "This is a " + getDishName();
    }
}
