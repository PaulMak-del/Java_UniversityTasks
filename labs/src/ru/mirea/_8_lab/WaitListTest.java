package ru.mirea._8_lab;

public class WaitListTest
{
    public static void main(String[] args)
    {
        BoundedWaitList<Integer> bList = new BoundedWaitList<>(3);

        for (int i = 0; i < 3; i++)
        {
            bList.add(i);
        }

        System.out.println(bList);

        bList.add(4);
        System.out.println(bList.getCapacity());

        UnfairWaitList<Integer> uList = new UnfairWaitList<>();

        for (int i = 0; i < 6; i++)
        {
            uList.add(i);
        }

        System.out.println(uList);
        uList.remove(3);
        System.out.println(uList);
        uList.moveToBack(2);
        System.out.println(uList);
    }
}
