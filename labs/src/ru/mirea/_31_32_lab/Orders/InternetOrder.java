package ru.mirea._31_32_lab.Orders;

import ru.mirea._31_32_lab.Collection.DoublyLinkList;
import ru.mirea._31_32_lab.Comparator.ItemCostComparator;
import ru.mirea._31_32_lab.Customer;
import ru.mirea._31_32_lab.Menu.MenuItem;

import java.util.Arrays;

public class InternetOrder implements Order
{
    private final DoublyLinkList orderList = new DoublyLinkList();
    private Customer customer;

    public boolean add(MenuItem item)
    {
        return orderList.insert(item);
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

    public int itemQuantity()
    {
        return orderList.size();
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

    public int itemQuantity(MenuItem menuItem)
    {
        int count = 0;

        for (int i = 0; i < orderList.size(); i++)
        {
            if (orderList.get(i).getName().equals(menuItem.getName()))
                count++;
        }

        return count;
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

    public boolean remove(String itemName)
    {
        return orderList.deleteItem(itemName);
    }

    public boolean remove(MenuItem menuItem)
    {
        return orderList.deleteItem(menuItem.getName());
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

    public int removeAll(MenuItem menuItem)
    {
        boolean flag = orderList.deleteItem(menuItem.getName());
        int count = 0;

        while (flag)
        {
            flag = orderList.deleteItem(menuItem.getName());
            count++;
        }

        return count;
    }

    public MenuItem[] sortedItemsByCostDesc()
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

    public double costTotal()
    {
        double totalCost = 0;

        for (int i = 0; i < orderList.size(); i++)
        {
            totalCost += orderList.get(i).getCost();
        }

        return totalCost;
    }

    public Customer getCustomer()
    {
        return this.customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public String toString()
    {
        return Arrays.toString(getItems());
    }
}
