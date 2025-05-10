package Jav2;

import javax.swing.*;
import java.awt.*;

public class b35 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mixed Layout");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridLayout(3, 3));
        for (int i = 1; i <= 9; i++) {
            centerPanel.add(new JButton("Button " + i));
        }

        JButton resetButton = new JButton("Reset");

        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(resetButton, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
