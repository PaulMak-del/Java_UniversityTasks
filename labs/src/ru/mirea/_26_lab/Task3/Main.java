package ru.mirea._26_lab.Task3;

import ru.mirea._26_lab.Task2.Exception2;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("----Task_3----");
        Exception3 ex3 = new Exception3();
        try
        {
            ex3.exceptionDemo();
        } catch (Exception e)
        {
            System.out.println("General exception");
        }
        /*catch (NumberFormatException e)
        {
            System.out.println("Not an integer");
        } catch (ArithmeticException e)
        {
            System.out.println("Attempted division by zero");
        }
         */
    }
}
