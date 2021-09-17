package ru.mirea._20_lab;

public abstract class Dish
{
    private String dishName;
    protected boolean isClear;
    protected boolean isEmpty;

    public Dish()
    {
        this.dishName = "unknown plate";
        this.isClear = true;
        this.isEmpty = true;
    }

    public Dish(String dishName, boolean isEmpty)
    {
        this.dishName = dishName;
        this.isEmpty = isEmpty;
    }

    public boolean isEmpty()
    {
        return isEmpty;
    }

    public boolean isClear()
    {
        return isClear;
    }

    public void washDish()
    {
        this.isClear = true;
    }

    public String getDishName()
    {
        return this.dishName;
    }

    abstract public String toString();
}
