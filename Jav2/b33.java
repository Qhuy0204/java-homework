package Jav2;

import javax.swing.*;
import java.awt.*;

public class b33{
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag Form");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0; gbc.gridy = 0;
        frame.add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        frame.add(new JTextField(15), gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        frame.add(new JLabel("Age:"), gbc);

        gbc.gridx = 1;
        frame.add(new JSpinner(new SpinnerNumberModel(20, 0, 100, 1)), gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        frame.add(new JButton("Submit"), gbc);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
