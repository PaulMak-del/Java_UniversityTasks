package ru.mirea.lab5.Task11;

import java.util.Scanner;

public class AmountOfNumbersOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        System.out.println(calc(num));
    }

    public static int calc(String row)
    {
        if (row.length() <= 2 || row.charAt(0) == '0' && row.charAt(1) == '0')
        {
            return 0;
        }
        else if (row.charAt(0) == '1')
        {
            return 1 + calc(row.substring(1));
        }
        else
        {
            return calc(row.substring(1));
        }
    }
}
