package ru.mirea._16_17_lab.Comparator;

import ru.mirea._16_17_lab.Menu.Item;

import java.util.Comparator;

public class ItemCostComparator implements Comparator<Item>
{
    @Override
    public int compare(Item o1, Item o2)
    {
        return (int)(o1.getCost() - o2.getCost());
    }
}
