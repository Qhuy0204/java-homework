package Jav;

import javax.swing.*;
import java.awt.event.*;

public class b3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exit App");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        frame.add(exitButton);

        frame.setVisible(true);
    }
}
