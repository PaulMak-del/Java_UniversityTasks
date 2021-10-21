package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Menu.MenuItem;

public interface OrderManager
{
    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    double ordersCostSummary();
    int ordersQuantity();
}
