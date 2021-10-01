package ru.mirea._12_lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChangeWordPlaces
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  // Hello Yellow Open Lazy World Nail

        // Check for correct input
        String fileName = sc.nextLine();
        ArrayList<String> wordsArray = new ArrayList<String>(Arrays.asList(fileName.split(" ")));

        System.out.println(getLine(wordsArray));
    }

    public static StringBuilder getLine(ArrayList<String> array)
    {
        StringBuilder result = new StringBuilder();
        ArrayList<String> words;

        if (array.isEmpty())
            return result;
        else
            words = array;

        result.append(words.get(0));

        for (int i = 0; i < words.size(); i++)
        {
            for (int j = 1; j < words.size(); j++)
            {
                if (words.get(j).length() == 0)
                    continue;

                if ( result.toString().toLowerCase().charAt(result.length() - 1) == words.get(j).toLowerCase().charAt(0) )
                {
                    result.append(" " + words.get(j));
                    words.set(j, "");
                }
                else if (result.toString().toLowerCase().charAt(0) == words.get(j).toLowerCase().charAt(words.get(j).length() - 1))
                {
                    result.insert(0, " " + words.get(j));
                    words.set(j, "");
                }
            }
        }

        return result;
    }
}
