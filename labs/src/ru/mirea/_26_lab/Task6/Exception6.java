package ru.mirea._26_lab.Task6;

import java.util.Scanner;

public class Exception6
{
    public void getKey()
    {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.nextLine();
        try
        {
            printDetails(key);
        } catch (Exception e)
        {
            System.out.println("Key is empty");;
        }
    }

    public void printDetails(String key) throws Exception
    {
        try
        {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e)
        {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception
    {
        if (key.equals(""))
        {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

}
