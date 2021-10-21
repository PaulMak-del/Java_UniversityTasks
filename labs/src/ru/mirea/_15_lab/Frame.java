package ru.mirea._15_lab;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Frame extends JFrame
{
    private HashMap<String, String> documents = new HashMap<>();

    public Frame()
    {
        super("Практическая работа№15");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem newFile = new JMenuItem("New");
        JMenuItem open = new JMenuItem("Open");
        JMenuItem save = new JMenuItem("Save");
        JMenuItem exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);
        setJMenuBar(menuBar);

        CreateTextDocument factory = new CreateTextDocument();

        IDocument document = factory.createNew();
        TextArea textArea = new TextArea("", 40, 40);
        add(textArea);

        newFile.addActionListener(e ->
        {
            System.out.println("New file");
            if (document instanceof TextDocument)
            {
                textArea.setText("");
            }
            else
            {
                System.out.println("Some strange document");
            }
        });

        save.addActionListener(e ->
        {
            if (document instanceof TextDocument)
            {
                System.out.println("Под каким именем созранить файл?");
                Scanner sc = new Scanner(System.in);
                String name = sc.next();

                documents.put(name, textArea.getText());
            }
            else
            {
                System.out.println("Some strange document");
            }
        });

        open.addActionListener(e ->
        {
            if (document instanceof TextDocument)
            {
                System.out.println("Какой файл хотите открыть?");
                System.out.println(documents.keySet());

                Scanner sc = new Scanner(System.in);
                String name = sc.next();

                textArea.setText(documents.get(name));
            }
            else
            {
                System.out.println("Some strange file");
            }
        });

        exit.addActionListener(e ->
        {
            dispose();
        });

        setVisible(true);
    }
}
