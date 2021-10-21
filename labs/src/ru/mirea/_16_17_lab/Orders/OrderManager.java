package ru.mirea._16_17_lab.Orders;

import ru.mirea._16_17_lab.Exceptions.IllegalTableNumberException;
import ru.mirea._16_17_lab.Exceptions.OrderAlreadyAddedException;
import ru.mirea._16_17_lab.Menu.Item;

import java.util.HashMap;

// Предположим что наше заведение имеет только 20 столиков
public class OrderManager
{
    private Order[] restaurantOrders = new RestaurantOrder[20];
    private final HashMap<String, Order> internetOrders = new HashMap<>();

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException, IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        if (restaurantOrders[tableNumber] != null)
            throw new OrderAlreadyAddedException();

        restaurantOrders[tableNumber] = order;
    }

    public void add(String address, Order order) throws OrderAlreadyAddedException
    {
        if (internetOrders.get(address) != null)
            throw new OrderAlreadyAddedException();

        internetOrders.put(address, order);
    }

    public Order getOrder(int tableNumber) throws IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        return restaurantOrders[tableNumber];
    }

    public Order getOrder(String address)
    {
        return internetOrders.get(address);
    }

    public void addItem(Item item, int tableNumber) throws IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        restaurantOrders[tableNumber].add(item);
    }

    public void addItem(String address, Item item)
    {
        internetOrders.get(address).add(item);
    }

    public void removeOrder(int tableNumber) throws IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        restaurantOrders[tableNumber] = null;
    }

    public void removeOrder(String address)
    {
        internetOrders.remove(address);
    }

    public int freeTableNumber()
    {
        for (int i = 0; i < 20; i++)
        {
            if (restaurantOrders[i] == null)
                return i;
        }

        System.out.println("No free tables");
        return -1;
    }

    public int[] freeTableNumbers()
    {
        int[] numbers = new int[20];
        int count = 0;

        for (int i = 0; i < restaurantOrders.length; i++)
        {
            if (restaurantOrders[i] == null)
            {
                numbers[count++] = i;
            }
        }

        int[] copy_numbers = new int[count];
        System.arraycopy(numbers, 0, copy_numbers, 0, count);

        return copy_numbers;
    }

    public Order[] getRestaurantOrders()
    {
        int count = 0;

        for (Order restaurantOrder : restaurantOrders)
        {
            if (restaurantOrder != null)
                count++;
        }
        Order[] copy_restOrders = new Order[count];
        int index = 0;
        for (Order restaurantOrder : restaurantOrders)
        {
            if (restaurantOrder != null)
                copy_restOrders[index++] = restaurantOrder;
        }

        return copy_restOrders;
    }

    public Order[] getInternetOrders()
    {
        return restaurantOrders = internetOrders.values().toArray(new Order[0]);
    }

    public double restaurantOrdersCostSummary()
    {
        double costSummary = 0;

        for (Order restaurantOrder : restaurantOrders)
        {
            if (restaurantOrder != null)
                costSummary += restaurantOrder.getTotalCost();
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

        for (Order restaurantOrder : restaurantOrders)
        {
            if (restaurantOrder != null)
                count += restaurantOrder.itemQuantity(itemName);
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
















