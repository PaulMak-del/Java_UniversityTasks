package ru.mirea._5_lab.Task12;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        calc(num);
    }

    public static void calc(String str)
    {
        if (str.length() <= 1 || str.charAt(0) == '0')
        {
            return;
        }
        else if ((int)str.charAt(0) % 2 != 0)
        {
            System.out.print(str.charAt(0));
            calc(str.substring(1));
        }
        else
        {
            calc(str.substring(1));
        }
    }
}
