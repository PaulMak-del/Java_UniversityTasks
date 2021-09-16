package ru.mirea.lab5.Task15;

import java.util.Scanner;

public class ReverseNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        calc(num);
    }

    public static void calc(String str)
    {
        if (str.length() <= 0)
        {
            System.out.print('\b');
            return;
        }

        System.out.print(str.charAt(str.length() - 1) + "_");
        calc(str.substring(0, str.length() - 1));
    }
}

