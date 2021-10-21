package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Exceptions.OrderAlreadyAddedException;
import ru.mirea._31_32_lab.Menu.MenuItem;

import java.util.HashMap;

public class InternetOrderManager implements OrderManager
{
    private final HashMap<String, Order> orders = new HashMap<>();

    public void add(String address, Order order) throws OrderAlreadyAddedException
    {
        if (orders.get(address) != null)
            throw new OrderAlreadyAddedException();

        orders.put(address, order);
    }

    public Order order(String address)
    {
        return orders.get(address);
    }

    public void remove(String address)
    {
        orders.remove(address);
    }

    @Override
    public int itemsQuantity(String itemName)
    {
        int count = 0;

        for (Order order : orders.values())
        {
            count += order.itemQuantity();
        }

        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item)
    {
        int count = 0;

        for (Order order : orders.values())
        {
            count += order.itemQuantity(item.getName());
        }

        return count;
    }

    @Override
    public Order[] getOrders()
    {
        return orders.values().toArray(new Order[0]);
    }

    @Override
    public double ordersCostSummary()
    {
        double costSummary = 0;

        for (Order order : orders.values())
        {
            costSummary += order.getTotalCost();
        }

        return costSummary;
    }

    @Override
    public int ordersQuantity()
    {
        return orders.size();
    }
}
















