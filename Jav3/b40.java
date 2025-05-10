package Jav3;

import javax.swing.*;

public class b40{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click Counter");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Count: 0", SwingConstants.CENTER);
        JButton button = new JButton("Click Me");

        final int[] count = {0};
        button.addActionListener(e -> label.setText("Count: " + ++count[0]));

        frame.setLayout(new java.awt.BorderLayout());
        frame.add(button, "North");
        frame.add(label, "Center");

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
