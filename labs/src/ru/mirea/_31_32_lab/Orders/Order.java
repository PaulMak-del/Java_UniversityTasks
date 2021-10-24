package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Customer;
import ru.mirea._31_32_lab.Menu.MenuItem;

public interface Order
{
    boolean add(MenuItem item);
    String[] itemsNames();
    int itemQuantity();
    int itemQuantity(String itemName);
    int itemQuantity(MenuItem menuItem);
    MenuItem[] getItems();
    boolean remove(String itemName);
    boolean remove(MenuItem menuItem);
    int removeAll(String itemName);
    int removeAll(MenuItem menuItem);
    MenuItem[] sortedItemsByCostDesc();
    double costTotal();
    Customer getCustomer();
    void setCustomer(Customer customer);
    String toString();
}
