package ru.mirea._28_lab;

import java.io.File;
import java.util.ArrayList;

public class Generics2
{
    private static final String PATH = "G:\\Study\\Java\\UniversityLabs\\labs\\src\\ru\\mirea";
    public static void main(String[] args)
    {
        File folder = new File(PATH);

        saveAndShowFiles(folder.listFiles());
    }

    public static ArrayList<File> saveAndShowFiles(File[] filesArray)
    {
        ArrayList<File> list = new ArrayList<>();

        int i = 0;
        for (File f : filesArray)
        {
            list.add(f);
            if (i++ < 5)
                System.out.println(f.getName());

        }

        return list;
    }
}
