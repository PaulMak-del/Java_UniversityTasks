package ru.mirea._16_lab.Orders;

import ru.mirea._16_lab.Menu.Item;

public interface Order
{
    boolean add(Item item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int itemQuantity();
    Item[] getItems();
    double getTotalCost();
    int itemQuantity(String itemName);
    String[] itemsNames();
    Item[] sortItems();
    String toString();
}
