package ru.mirea._31_32_lab.Comparator;

import ru.mirea._31_32_lab.Menu.MenuItem;

import java.util.Comparator;

public class ItemCostComparator implements Comparator<MenuItem>
{
    @Override
    public int compare(MenuItem o1, MenuItem o2)
    {
        return (int)(o1.getCost() - o2.getCost());
    }
}
