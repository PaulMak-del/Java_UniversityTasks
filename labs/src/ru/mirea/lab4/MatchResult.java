package ru.mirea.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MatchResult extends JFrame
{
    JButton milanButton = new JButton("AC Milan");
    JButton madridButton = new JButton("Real Madrid");
    JLabel resultLabel = new JLabel("");
    JLabel lastScorerLabel = new JLabel("");
    JLabel winnerLabel = new JLabel("");
    JPanel[] panels = new JPanel[4];

    private int milanScore = 0;
    private int madridScore = 0;
    private String milanTeam = "AC Milan";
    private String madridTeam = "Real Madrid";
    private String lastScorer = "N/A";
    private String winner = "DRAW";

    public MatchResult()
    {
        super("Match Result");
        setLayout(new GridLayout(5, 1));
        setSize(400, 300);

        for (int i = 0; i < panels.length; i++)
        {
            panels[i] = new JPanel();
            add(panels[i]);
        }

        panels[0].setLayout(new BorderLayout());
        panels[0].add(milanButton, BorderLayout.WEST);
        panels[0].add(madridButton, BorderLayout.EAST);
        panels[1].add(resultLabel);
        panels[2].add(lastScorerLabel);
        panels[3].add(winnerLabel);

        update();

        milanButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                milanScore++;
                lastScorer = milanTeam;

                update();
            }
        });

        madridButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                madridScore++;
                lastScorer = madridTeam;

                update();
            }
        });

    }

    public void update()
    {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore)
            winner = milanTeam;
        else if (milanScore < madridScore)
            winner = madridTeam;
        else
            winner = "N/A";

        winnerLabel.setText("Winner: " + winner);
    }
}
