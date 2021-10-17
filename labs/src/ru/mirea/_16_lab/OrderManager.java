package ru.mirea._16_lab;

// Предположим что наше заведение имеет только 20 столиков
public class OrderManager
{
    private Order[] orders = new Order[20];

    public void add(Order order, int tableNumber)
    {
        orders[tableNumber] = order;
    }

    public Order getOrder(int tableNumber)
    {
        return orders[tableNumber];
    }

    public void addItem(Item item, int tableNumber)
    {
        orders[tableNumber].add(item);
    }

    public void removeOrder(int tableNumber)
    {
        orders[tableNumber] = null;
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

    public Order[] getOrders()
    {
        return orders;
    }

    public double ordersCostSummary()
    {
        double costSummary = 0;

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] != null)
                costSummary += orders[i].costTotal();
        }

        return costSummary;
    }

    public int dishQuantity(String itemName)
    {
        int count = 0;

        for (int i = 0; i < orders.length; i++)
        {
            if (orders[i] != null)
                count += orders[i].itemQuantity(itemName);
        }

        return count;
    }

}
















