package ru.mirea._16_lab;

import java.util.Comparator;

public class ItemCostComparator implements Comparator<Item>
{
    @Override
    public int compare(Item o1, Item o2)
    {
        return (int)(o1.getCost() - o2.getCost());
    }
}
