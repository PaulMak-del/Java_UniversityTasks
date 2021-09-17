package ru.mirea._5_lab.Task14;

import java.util.Scanner;

public class JustNumbers
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

        System.out.print(str.charAt(0) + "_");
        calc(str.substring(1));
    }
}
