package ru.mirea._7_lab;

import java.util.*;

public class AppStack
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext())
        {
            System.out.println("Incorrect input");
            System.exit(0);
        }

        String str_1 = sc.nextLine();
        String str_2 = sc.nextLine();

        Stack<Integer> playerOneStack = new Stack<Integer>();
        Stack<Integer> playerTwoStack = new Stack<Integer>();
        for (String str : str_1.split(" "))
        {
            playerOneStack.push(Integer.parseInt(str));
        }
        for (String str : str_2.split(" "))
        {
            playerTwoStack.push(Integer.parseInt(str));
        }

        int count = 0;

        while (count++ <= 106)
        {
            int playersOneCard = playerOneStack.pop();
            int playersTwoCard = playerTwoStack.pop();

            if (playersOneCard > playersTwoCard && !(playersOneCard == 9 && playersTwoCard == 0) || playersOneCard == 0 && playersTwoCard == 9)
            {
                playerOneStack.push(playersOneCard);
                playerOneStack.push(playersTwoCard);
            } else
            {
                playerTwoStack.push(playersOneCard);
                playerTwoStack.push(playersTwoCard);
            }

            if (playerOneStack.isEmpty())
            {
                System.out.println("Player One win at " + count + " steps");
                break;
            }
            if (playerTwoStack.isEmpty())
            {
                System.out.println("Player Two win at " + count + " steps");
                break;
            }
        }

        if (count >= 106)
        {
            System.out.println("botva");
        }

    }
}

