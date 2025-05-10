package Jav;

import javax.swing.*;

public class b15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Non-Closable Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));

        frame.add(exitButton);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
