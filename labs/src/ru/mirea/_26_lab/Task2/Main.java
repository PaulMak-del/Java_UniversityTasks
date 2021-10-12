package ru.mirea._26_lab.Task2;

import ru.mirea._26_lab.Task1.Exception1;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("----Task_2----");
        Exception2 ex2 = new Exception2();
        try
        {
            ex2.exceptionDemo();
        } catch(NumberFormatException e)
        {
            System.out.println("Not an integer");
        } catch (ArithmeticException e)
        {
            System.out.println("Attempted division by zero");
        }
    }
}
