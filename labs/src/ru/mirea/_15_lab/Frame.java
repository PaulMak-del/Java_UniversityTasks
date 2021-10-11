package ru.mirea._15_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame
{
    private JMenuBar menuBar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenuItem newFile = new JMenuItem("New");
    private JMenuItem open = new JMenuItem("Open");
    private JMenuItem save = new JMenuItem("Save");
    private JMenuItem exit = new JMenuItem("Exit");

    public Frame()
    {
        super("Практическая работа№15");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addMenu();

        CreateTextDocument textFactory = new CreateTextDocument();
        doAction(textFactory.createNew());

        setVisible(true);
    }

    public void addMenu()
    {
        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);
        menuBar.add(file);
        setJMenuBar(menuBar);
    }

    public void doAction(IDocument document)
    {
        newFile.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (document instanceof TextDocument)
                {
                    TextDocument textDocument = (TextDocument) document;
                    textDocument.info();

                    Frame frame = new Frame();
                    frame.setTitle("Text Document");
                    frame.setSize(600, 200);
                    JTextArea text = new JTextArea("", 40, 40);
                    frame.add(text);
                }
                else if (document instanceof ImageDocument)
                {
                    ImageDocument imageDocument = (ImageDocument) document;
                    imageDocument.info();

                    Frame frame = new Frame();
                    frame.setTitle("Image Document");
                    frame.setSize(400, 400);
                }
            }
        });

        exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                setVisible(false);
            }
        });

        save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("I can't save it!!");
            }
        });
    }

}
