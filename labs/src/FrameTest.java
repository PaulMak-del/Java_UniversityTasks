import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTest extends JFrame
{
    public FrameTest()
    {
        super("Frame Test");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setLayout(new BorderLayout());
        JTextArea textArea = new JTextArea("qwe", 40, 40);

        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenuItem button = new JMenuItem("Button_get");
        file.add(button);
        menuBar.add(file);
        setJMenuBar(menuBar);
        add(textArea);

        Doc doc = new Doc();
        add(doc.textArea);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println(doc.textArea.getText());
            }
        });


        setVisible(true);
    }
}
