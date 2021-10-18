package ru.mirea._16_lab;

import java.util.HashMap;

// Предположим что наше заведение имеет только 20 столиков
public class OrderManager
{
    private Order[] orders = new RestaurantOrder[20];
    private HashMap<String, Order> internetOrders = new HashMap<>();

    public void add(RestaurantOrder order, int tableNumber)
    {
        orders[tableNumber] = order;
    }

    public void add(String address, Order order)
    {
        internetOrders.put(address, order);
    }

    public Order getOrder(int tableNumber)
    {
        return orders[tableNumber];
    }

    public Order getOrder(String address)
    {
        return internetOrders.get(address);
    }

    public void addItem(Item item, int tableNumber)
    {
        orders[tableNumber].add(item);
    }

    public void addItem(String address, Item item)
    {
        internetOrders.get(address).add(item);
    }

    public void removeOrder(int tableNumber)
    {
        orders[tableNumber] = null;
    }

    public void removeOrder(String address)
    {
        internetOrders.remove(address);
    }

    public int freeTableNumber()
    {
        for (int i = 0; i < 20; i++)
        {
            if (orders[i] == null)
                return i;
        }

        System.out.println("No free tables");
        return -1;
    }

    public int[] freeTableNumbers()
    {
        int[] numbers = new int[20];
        int count = 0;

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] == null)
            {
                numbers[count++] = i;
            }
        }

        int[] copy_numbers = new int[count];
        for (int i = 0; i < count; i++)
        {
            copy_numbers[i] = numbers[i];
        }

        return copy_numbers;
    }

    public Order[] getRestaurantOrders()
    {
        return orders;
    }

    public Order[] getInternetOrders()
    {
        return orders = (Order[])(internetOrders.values().toArray(new Order[0]));
    }

    public double restaurantOrdersCostSummary()
    {
        double costSummary = 0;

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] != null)
                costSummary += orders[i].getTotalCost();
        }

        return costSummary;
    }

    public double internetOrderCostSummary()
    {
        double costSummary = 0;

        for (Order order : internetOrders.values())
        {
            costSummary += order.getTotalCost();
        }

        return costSummary;
    }

    public int dishRestaurantQuantity(String itemName)
    {
        int count = 0;

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] != null)
                count += orders[i].itemQuantity(itemName);
        }

        return count;
    }

    public int dishInternetQuantity(String itemName)
    {
        int count = 0;

        for (Order order : internetOrders.values())
        {
            count += order.itemQuantity(itemName);
        }

        return count;
    }

}
















