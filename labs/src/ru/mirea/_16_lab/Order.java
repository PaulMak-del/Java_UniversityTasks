package ru.mirea._16_lab;

public class Order
{
    private int size;
    private Item[] items = new Item[5];

    public boolean add(Item item)
    {
        if (items.length >= size)
        {
            Item[] copy_dishes = new Item[size+5];
            for (int i = 0; i < size; i++)
            {
                copy_dishes[i] = items[i];
            }

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
                for (int j = i; j < size - 1; j++)
                {
                    items[j] = items[j+1];
                }
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
                for (int j = i; j < size - 1; j++)
                {
                    items[j] = items[j+1];
                }
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

        for (Item item : items)
        {
            if ((item.getName()).equals(itemName))
                count++;
        }

        return count;
    }

    public Item[] getItems()
    {
        return items;
    }

    public double costTotal()
    {
        double cost = 0;

        for (Item item : items)
            cost += item.getCost();

        return cost;
    }

    public String[] itemsNames()
    {
        String[] itemsNames = new String[size];

        for (int i = 0; i < size; i++)
            itemsNames[i] = items[i].getName();

        return itemsNames;
    }

    public Item[] sortedItemsByCostDesc()
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
            Item temp = items[min];
            items[min] = items[index];
            items[index] = temp;
        }

        return items;
    }
}
