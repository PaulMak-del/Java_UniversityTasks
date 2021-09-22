package ru.mirea._23_lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuessApp extends JFrame
{
    private JTextField guessPane = new JTextField(10);
    private JButton ok = new JButton("Ok");
    private final int randomNum;
    private int count;

    public GuessApp()
    {
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        randomNum = (int)(Math.random() * 20);
        count = 0;

        init();

        setVisible(true);
    }

    public void init()
    {
        setLayout(new FlowLayout());
        add(guessPane);
        add(ok);

        ok.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (Integer.parseInt(guessPane.getText()) == randomNum)
                {
                    JOptionPane.showMessageDialog(null, "Congratulation!!\nYou win!");
                    dispose();
                    return;
                }
                else if (Integer.parseInt(guessPane.getText()) > randomNum)
                {
                    JOptionPane.showMessageDialog(null, "The num less than your");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "The num is bigger than yours");
                }

                if (++count >= 3)
                {
                    JOptionPane.showMessageDialog(null, "You lose(");
                    dispose();
                }
            }
        });
    }
}
