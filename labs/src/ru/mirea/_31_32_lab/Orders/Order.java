package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Menu.MenuItem;

public interface Order
{
    boolean add(MenuItem item);
    boolean remove(String itemName);
    int removeAll(String itemName);
    int itemQuantity();
    MenuItem[] getItems();
    double getTotalCost();
    int itemQuantity(String itemName);
    String[] itemsNames();
    MenuItem[] sortItems();
    String toString();
}
