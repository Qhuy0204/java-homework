package Jav2;

import javax.swing.*;
import java.awt.*;

public class b19 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nested BoxLayout");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        for (int i = 1; i <= 2; i++) {
            JPanel subPanel = new JPanel();
            subPanel.setLayout(new BoxLayout(subPanel, BoxLayout.X_AXIS));
            subPanel.add(new JLabel("Label " + (i*2 - 1)));
            subPanel.add(new JLabel("Label " + (i*2)));
            subPanel.add(new JButton("Button " + i));
            mainPanel.add(subPanel);
        }

        frame.add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
