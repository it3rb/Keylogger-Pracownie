package App;
import App.keyLoggerLogic.ActiveAppMainLogic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AppBody extends JFrame {
    // JFrame
    static JFrame f;

    // JButton
    static JButton b, b1, b2,b3;



    // Main class
    public static void aplicationBody()
    {
        // Creating a new frame to store text field and
        // button
        f = new JFrame("panel");



        // Creating a new buttons
        b = new JButton("Start");
        b1 = new JButton("Hide");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b1)
                {
                    f.setVisible(false);
                }
            }
        });
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if (e.getSource() == b)
                {
                    ActiveAppMainLogic start = new ActiveAppMainLogic();
                    start.startMainLogic();
                }
            }

        });

        b2 = new JButton("Exit");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b2)
                {
                    f.dispatchEvent(new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
                    System.exit(0);
                }
            }
        });
        b3 = new JButton("ShowLogs");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b3)
                {
                    ActiveAppMainLogic openFolder = new ActiveAppMainLogic();
                    openFolder.startOpenFolderLogic();
                }
            }
        });
        // Creating a panel to add buttons
        JPanel p = new JPanel();

        // Adding buttons and textfield to panel
        // using add() method
        p.add(b);
        p.add(b1);
        p.add(b2);
        p.add(b3);


        // setbackground of panel
        p.setBackground(Color.white);

        // Adding panel to frame
        f.add(p);

        // Setting the size of frame
        f.setSize(300, 300);

        f.show();
    }


}
