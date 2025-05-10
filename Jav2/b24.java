package Jav2;

import javax.swing.*;
import java.awt.*;

public class b24 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Checkbox Background");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox = new JCheckBox("Enable Background");
        JPanel panel = new JPanel();
        panel.add(checkBox);

        checkBox.addActionListener(e -> {
            if (checkBox.isSelected()) {
                frame.getContentPane().setBackground(Color.GREEN);
            } else {
                frame.getContentPane().setBackground(null);
            }
        });

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
