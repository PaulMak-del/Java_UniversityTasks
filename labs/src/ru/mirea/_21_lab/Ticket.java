package ru.mirea._21_lab;

public class Ticket implements Priceable
{
    private double price;
    private String name;
    private String time;

    public Ticket(String name, String time, double price)
    {
        this.price = price;
        this.name = name;
        this.time = time;
    }

    @Override
    public double getPrice()
    {
        return this.price;
    }
}
