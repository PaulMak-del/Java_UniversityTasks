package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Collection.DoublyLinkList;
import ru.mirea._31_32_lab.Comparator.ItemCostComparator;
import ru.mirea._31_32_lab.Menu.MenuItem;

import java.util.Arrays;

public class InternetOrder implements Order
{
    private final DoublyLinkList orderList;

    public InternetOrder()
    {
        orderList = new DoublyLinkList();
    }

    public boolean add(MenuItem item)
    {
        return orderList.insert(item);
    }

    public boolean remove(String itemName)
    {
        return orderList.deleteItem(itemName);
    }

    public int removeAll(String itemName)
    {
        boolean flag = orderList.deleteItem(itemName);
        int count = 0;

        while (flag)
        {
            flag = orderList.deleteItem(itemName);
            count++;
        }

        return count;
    }

    public int itemQuantity()
    {
        return orderList.size();
    }

    public MenuItem[] getItems()
    {
        MenuItem[] items = new MenuItem[orderList.size()];

        for (int i = 0; i < orderList.size(); i++)
        {
            items[i] = orderList.get(i);
        }

        return items;
    }

    public double getTotalCost()
    {
        double totalCost = 0;

        for (int i = 0; i < orderList.size(); i++)
        {
            totalCost += orderList.get(i).getCost();
        }

        return totalCost;
    }

    public int itemQuantity(String itemName)
    {
        int count = 0;

        for (int i = 0; i < orderList.size(); i++)
        {
            if (orderList.get(i).getName().equals(itemName))
                count++;
        }

        return count;
    }

    public String[] itemsNames()
    {
        String[] itemNames = new String[orderList.size()];
        itemNames[0] = orderList.get(0).getName();

        for (int i = 1; i < orderList.size(); i++)
        {
            for (int j = 0; j < i + 1; j++)
            {
                String currentName = orderList.get(i).getName();

                if (itemNames[j].equals(currentName))
                    break;

                if (j == i - 1)
                    itemNames[i] = currentName;
            }
        }

        return itemNames;
    }

    public MenuItem[] sortItems()
    {
        MenuItem[] items = new MenuItem[orderList.size()];
        ItemCostComparator comp = new ItemCostComparator();

        for (int i = 0; i < orderList.size(); i++)
        {
            items[i] = orderList.get(i);
        }

        int min;
        for (int index = 0; index < items.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < items.length; scan++)
            {
                if (comp.compare(items[scan], items[min]) < 0)
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
