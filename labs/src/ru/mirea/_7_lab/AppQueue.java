package ru.mirea._7_lab;

import java.util.*;

public class AppQueue
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

        java.util.Queue<String> playerOneQueue = new LinkedList<String>(Arrays.asList(str_1.split(" ")));
        java.util.Queue<String> playerTwoQueue = new LinkedList<String>(Arrays.asList(str_2.split(" ")));

        int count = 0;

        while (count++ <= 106)
        {
            int playersOneCard = Integer.parseInt(playerOneQueue.remove());
            int playersTwoCard = Integer.parseInt(playerTwoQueue.remove());

            if (playersOneCard > playersTwoCard && !(playersOneCard == 9 && playersTwoCard == 0) || (playersOneCard == 0 && playersTwoCard == 9 )) {
                playerOneQueue.add(Integer.toString(playersOneCard));
                playerOneQueue.add(Integer.toString(playersTwoCard));
            } else {
                playerTwoQueue.add(Integer.toString(playersOneCard));
                playerTwoQueue.add(Integer.toString(playersTwoCard));
            }

            if (playerOneQueue.isEmpty()) {
                System.out.println("Player two win at " + count + " move");
                break;
            }
            if (playerTwoQueue.isEmpty()) {
                System.out.println("Player one win at " + count + " move");
                break;
            }
        }

        if (count >= 106)
        {
            System.out.println("botva");
        }

    }
}
