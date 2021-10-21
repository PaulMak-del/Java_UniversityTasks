package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Exceptions.IllegalTableNumberException;
import ru.mirea._31_32_lab.Exceptions.OrderAlreadyAddedException;
import ru.mirea._31_32_lab.Menu.MenuItem;

// Предположим что наше заведение имеет только 5 столиков
public class TableOrderManager implements OrderManager
{
    private Order[] orders = new Order[5];

    //Добавляет заказ столу с заданым номером
    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException, IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        if (orders[tableNumber] != null)
            throw new OrderAlreadyAddedException();

        orders[tableNumber] = order;
    }

    //Возвращает заказ заданного столика
    public Order getOrder(int tableNumber) throws IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        return orders[tableNumber];
    }

    //Добавляет блюдо в заказ заданному столику
    public void addItem(MenuItem item, int tableNumber) throws IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        orders[tableNumber].add(item);
    }

    //Удаляет заказ у заданного столика
    public void remove(int tableNumber) throws IllegalTableNumberException
    {
        if (tableNumber < 0 || tableNumber > 19)
            throw new IllegalTableNumberException();

        orders[tableNumber] = null;
    }

    //Удаляет заданный заказ
    public int remove(Order order) throws OrderAlreadyAddedException
    {
        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i].equals(order))
            {
                orders[i] = null;
                return i;
            }
        }

        throw new OrderAlreadyAddedException();
    }

    //Удаляет все заданные заказы
    public int removeAll(Order order)
    {
        int count = 0;

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i].equals(order))
            {
                orders[i] = null;
                count++;
            }
        }

        return count;
    }

    //Воозвращает номер свободного столика
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

    //Возвращает массив со всеми свободными столиками
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
        System.arraycopy(numbers, 0, copy_numbers, 0, count);

        return copy_numbers;
    }

    //Возвращает массив заказов
    @Override
    public Order[] getOrders()
    {
        int count = 0;

        for (Order restaurantOrder : orders)
        {
            if (restaurantOrder != null)
                count++;
        }
        Order[] copy_restOrders = new Order[count];
        int index = 0;
        for (Order restaurantOrder : orders)
        {
            if (restaurantOrder != null)
                copy_restOrders[index++] = restaurantOrder;
        }

        return copy_restOrders;
    }

    //Возвращает общую сумму заказов
    @Override
    public double ordersCostSummary()
    {
        double costSummary = 0;

        for (Order restaurantOrder : orders)
        {
            if (restaurantOrder != null)
                costSummary += restaurantOrder.getTotalCost();
        }

        return costSummary;
    }

    //Возвращает количество заказов
    @Override
    public int ordersQuantity()
    {
        return orders.length;
    }

    //Возвращает количество блюд в заказах (принимает на вход блюдо)
    @Override
    public int itemsQuantity(MenuItem item)
    {
        int count = 0;

        for (Order order : orders)
        {
            if (order != null)
                count += order.itemQuantity(item.getName());
        }

        return count;
    }

    //Возвращает количество блюд в заказах (принимает на вход название блюда)
    @Override
    public int itemsQuantity(String itemName)
    {
        int count = 0;

        for (Order restaurantOrder : orders)
        {
            if (restaurantOrder != null)
                count += restaurantOrder.itemQuantity(itemName);
        }

        return count;
    }
}
