package ru.mirea._25_lab;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("E:\\Учёба\\UniversityLabs\\File.txt", true))
        {
            String text;
            Scanner sc = new Scanner(System.in);
            text = sc.nextLine();

            writer.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
