package Jav;

import javax.swing.*;

public class b7{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Resizable Window");
        frame.setSize(400, 300);
        frame.setMinimumSize(new java.awt.Dimension(200, 150));
        frame.setMaximumSize(new java.awt.Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Resizable Window", SwingConstants.CENTER);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
