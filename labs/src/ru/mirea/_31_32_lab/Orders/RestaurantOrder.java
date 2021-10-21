package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Menu.MenuItem;

import java.util.Arrays;

public class RestaurantOrder implements Order
{
    private int size;
    private MenuItem[] items = new MenuItem[5];

    public boolean add(MenuItem item)
    {
        if (items.length >= size)
        {
            MenuItem[] copy_dishes = new MenuItem[size+5];
            System.arraycopy(items, 0, copy_dishes, 0, size);

            items = copy_dishes;
        }

        items[size++] = item;
        return true;
    }

    public boolean remove(String itemName)
    {
        if (size == 0)
        {
            System.out.println("Order is empty");
            return false;
        }

        for (int i = 0; i < size; i++)
        {
            if ((items[i].getName()).equals(itemName))
            {
                System.arraycopy(items, i + 1, items, i, size - 1 - i);
                items[size - 1] = null;
                size--;
                return true;
            }
        }

        System.out.println("Can't find the dish/drink");
        return false;
    }

    public int removeAll(String itemName)
    {
        int count = 0;
        int copy_size = size;

        if (size == 0)
        {
            System.out.println("Order is empty");
            return 0;
        }

        for (int i = 0; i < size; i++)
        {
            if ((items[i].getName()).equals(itemName))
            {
                System.arraycopy(items, i + 1, items, i, size - 1 - i);
                items[size - 1] = null;
                copy_size--;
                count++;
            }
        }

        size = copy_size;
        return count;
    }

    public int itemQuantity()
    {
        return size;
    }

    public int itemQuantity(String itemName)
    {
        int count = 0;

        for (MenuItem item : items)
        {
            if ((item.getName()).equals(itemName))
                count++;
        }

        return count;
    }

    public MenuItem[] getItems()
    {
        MenuItem[] copy_items = new MenuItem[size];

        System.arraycopy(items, 0, copy_items, 0, size);

        return copy_items;
    }

    public double getTotalCost()
    {
        double cost = 0;

        for (int i = 0; i < size; i++)
            cost += items[i].getCost();

        return cost;
    }

    public String[] itemsNames()
    {
        String[] itemsNames = new String[size];

        for (int i = 0; i < size; i++)
            itemsNames[i] = items[i].getName();

        return itemsNames;
    }

    public MenuItem[] sortItems()
    {
        int min;

        for (int index = 0; index < size - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < size; scan++)
            {
                if (items[scan].getCost() < items[min].getCost())
                    min = scan;
            }
            MenuItem temp = items[min];
            items[min] = items[index];
            items[index] = temp;
        }

        return items;
    }

    public String toString()
    {
        return Arrays.toString(getItems());
    }
}
