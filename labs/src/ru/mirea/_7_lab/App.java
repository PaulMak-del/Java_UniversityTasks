package ru.mirea._7_lab;

import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Check correct input

        String str_1 = sc.nextLine();
        String str_2 = sc.nextLine();

        Queue<String> playerOne = new LinkedList<String>(Arrays.asList(str_1.split(" ")));
        Queue<String> playerTwo = new LinkedList<String>(Arrays.asList(str_2.split(" ")));

        int count = 0;

        while (count <= 106)
        {
            int playersOneCard = Integer.parseInt(playerOne.remove());
            int playersTwoCard = Integer.parseInt(playerTwo.remove());

            if (playersOneCard > playersTwoCard) {
                playerOne.add(Integer.toString(playersOneCard));
                playerOne.add(Integer.toString(playersTwoCard));
            } else {
                playerTwo.add(Integer.toString(playersTwoCard));
                playerTwo.add(Integer.toString(playersOneCard));
            }

            if (playerOne.isEmpty()) {
                System.out.println("Player two win at " + count + " move");
                break;
            }
            if (playerTwo.isEmpty()) {
                System.out.println("Player one win at " + count + " move");
                break;
            }

            count++;
        }

    }
}
