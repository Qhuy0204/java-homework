package Jav;

import javax.swing.*;
import java.awt.*;

public class b8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Colored Background");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Colored Background", SwingConstants.CENTER);
        frame.getContentPane().setBackground(Color.GREEN);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
