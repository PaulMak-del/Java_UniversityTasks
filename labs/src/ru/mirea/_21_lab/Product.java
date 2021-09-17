package ru.mirea._21_lab;

public class Product implements Priceable
{
    private String name;
    private double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice()
    {
        return this.price;
    }
}
