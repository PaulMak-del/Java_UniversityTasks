package ru.mirea._21_lab;

public class PriceTest
{
    public static void main(String[] args)
    {
        Priceable book = new Book("Fight Club", "Chuck Palahniuk", 12.90);
        Priceable waterBottle = new Product("water", 4.99);
        Priceable ticket = new Ticket("Joker", "12:35", 6.50);

        System.out.println("Book price equals " + book.getPrice());
        System.out.println("Water bottle price equals " + waterBottle.getPrice());
        System.out.println("Ticket price equals " + ticket.getPrice());
    }
}
