package ru.mirea.lab18;

import java.util.Scanner;

public class HarmonicRow
{
    public static void main(String[] args) {
        double row = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");

        int n;

        if (sc.hasNextInt())
        {
            n = sc.nextInt();

            for (int i = 1; i < 10; i++) {
                row += 1 / (Math.pow(n, i));
                System.out.println(row);
            }
        }
        else
        {
            System.out.println("Вы ввели не верное число");
        }

    }
}
