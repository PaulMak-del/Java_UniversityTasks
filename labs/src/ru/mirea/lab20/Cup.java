package ru.mirea.lab20;

public class Cup extends Dish
{
    public Cup()
    {
        super("Tee Cup", true);
    }

    public void pourTea()
    {
        super.isEmpty = false;
    }

    public void drinkTea()
    {
        if (this.isEmpty())
        {
            System.out.println("Cup is empty");
        }
        else
        {
            this.isClear = false;
        }
    }

    @Override
    public String toString()
    {
        return "This is a " + super.getDishName();
    }
}
