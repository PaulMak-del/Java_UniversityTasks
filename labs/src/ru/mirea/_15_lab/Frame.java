package ru.mirea._15_lab;

import javax.swing.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Frame extends JFrame
{
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

        CreateTextDocument factory = new CreateTextDocument(); // Меняется только эта строка

        IDocument document = factory.createNew();

        newFile.addActionListener(e ->
        {
            System.out.println("New File");
            if (document instanceof TextDocument)
            {
                Frame frame = new Frame();
                ((TextDocument) document).addTextArea(frame);
            }
            else
            {
                System.err.println("ERROR: Problem file");
            }
        });

        open.addActionListener(e ->
        {
            System.out.println("Open File");

            if (document instanceof TextDocument)
            {
                Frame frame = new Frame();
                frame.setTitle("Text Document");

                try
                {
                    FileReader reader = new FileReader("G:\\Study\\Java\\UniversityLabs\\labs\\src\\ru\\mirea\\_15_lab\\documents.txt");

                    StringBuffer textInFile = new StringBuffer(" ");
                    int ch = reader.read();
                    while (ch != -1)
                    {
                        textInFile.append((char)ch);
                        ch = reader.read();
                    }

                    System.out.println(textInFile);

                    ((TextDocument) document).setText(textInFile.toString());

                    frame.add(((TextDocument) document).textArea);
                    frame.setVisible(true);

                    reader.close();
                } catch (IOException fileNotFoundException)
                {
                    fileNotFoundException.printStackTrace();
                }
            }
            else
            {
                System.err.println("ERROR: Problem file");
            }
        });

        save.addActionListener(e ->
        {
            System.out.println("Save File");
            if (document instanceof TextDocument)
            {
                String textInArea = ((TextDocument) document).getText();

                try
                {
                    FileWriter writer = new FileWriter("G:\\Study\\Java\\UniversityLabs\\labs\\src\\ru\\mirea\\_15_lab\\documents.txt", false);
                    writer.write(textInArea);
                    writer.flush();
                    writer.close();
                } catch (IOException ioException)
                {
                    System.out.println("Can't open file with documents");
                }
            }
            else
            {
                System.err.println("ERROR: Problem file");
            }

        });

        exit.addActionListener(e ->
        {
            System.out.println("Exit File");
            setVisible(false);
        });

        setVisible(true);
    }
}
