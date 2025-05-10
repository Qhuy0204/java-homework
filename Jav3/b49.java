package Jav3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class b49{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Color");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Sample", SwingConstants.CENTER);

        JRadioButton red = new JRadioButton("Red");
        JRadioButton blue = new JRadioButton("Blue");
        JRadioButton green = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(red); group.add(blue); group.add(green);

        ItemListener listener = e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String cmd = e.getItem().toString();
                switch (cmd) {
                    case "Red": label.setForeground(Color.RED); break;
                    case "Blue": label.setForeground(Color.BLUE); break;
                    case "Green": label.setForeground(Color.GREEN); break;
                }
            }
        };

        red.addItemListener(listener);
        blue.addItemListener(listener);
        green.addItemListener(listener);

        JPanel panel = new JPanel();
        panel.add(red); panel.add(blue); panel.add(green);

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(panel, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
