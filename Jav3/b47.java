package Jav3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class b47 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Follow Me");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Follow Me");
        label.setBounds(50, 50, 100, 30);
        frame.add(label);

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                label.setLocation(e.getX(), e.getY());
            }
        });

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
