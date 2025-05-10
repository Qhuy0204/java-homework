package Jav;

import javax.swing.*;

public class b13 {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Main Window");
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton openButton = new JButton("Open Child Window");
        openButton.addActionListener(e -> {
            JFrame childFrame = new JFrame("Child Window");
            childFrame.setSize(200, 200);
            childFrame.add(new JLabel("Child Window", SwingConstants.CENTER));
            childFrame.setLocationRelativeTo(mainFrame);
            childFrame.setVisible(true);
        });

        mainFrame.add(openButton);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }
}
