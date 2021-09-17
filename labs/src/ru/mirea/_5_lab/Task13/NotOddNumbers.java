package ru.mirea._5_lab.Task13;

import java.util.Scanner;

public class NotOddNumbers {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        calc(num);
    }

    public static void calc(String str)
    {
        if (str.length() <= 1 || str.charAt(0) == '0' || str.charAt(1) == '0')
        {
            return;
        }

        System.out.print(str.charAt(0));
        calc(str.substring(2));
    }
}

