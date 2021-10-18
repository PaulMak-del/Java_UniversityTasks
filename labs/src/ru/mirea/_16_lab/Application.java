package ru.mirea._16_lab;

import java.util.Arrays;

public class Application
{
    public static void main(String[] args)
    {
        Item item_1 = new Dish(1, "Name_1", "wfiw");
        Item item_2 = new Dish(2, "Name_2", "wfiw");
        Item item_3 = new Dish(3, "Name_3", "wfiw");
        Item item_4 = new Dish(4, "Name_4", "wfiw");
        Item item_5 = new Dish(5, "Name_5", "wfiw");
        Item item_6 = new Dish(6, "Name_6", "wfiw");
        DoublyLinkList list = new DoublyLinkList();

        list.insert(item_1);
        list.insert(item_3);
        list.insert(item_5);
        list.insert(item_2);
        list.insert(item_4);

        list.display();

        Order order_1 = new InternetOrder();
        Order order_2 = new InternetOrder();
        Order order_3 = new InternetOrder();
        order_1.add(item_1);
        order_1.add(item_6);
        order_2.add(item_2);
        order_2.add(item_5);
        order_3.add(item_3);
        order_3.add(item_4);

        OrderManager orderManager = new OrderManager();

        orderManager.add("address_1", order_1);
        orderManager.add("address_2", order_2);
        orderManager.add("address_3", order_3);


    }
}
