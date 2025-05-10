package Jav2;

import javax.swing.*;
import java.awt.*;

public class b23 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        JTextField display = new JTextField();
        display.setEditable(false);
        display.setPreferredSize(new Dimension(250, 40));

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(display, gbc);

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+", "C"
        };

        gbc.gridwidth = 1;
        for (int i = 0; i < buttons.length; i++) {
            JButton btn = new JButton(buttons[i]);
            gbc.gridx = i % 4;
            gbc.gridy = 1 + i / 4;
            frame.add(btn, gbc);
        }

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
