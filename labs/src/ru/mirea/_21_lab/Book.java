package ru.mirea._21_lab;

public class Book implements Priceable
{
    private double price;
    private String name;
    private String author;

    public Book(String name, String author, double price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public double getPrice()
    {
        return this.price;
    }
}
