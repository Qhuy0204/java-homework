package Jav2;

import javax.swing.*;

public class b20 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TabbedPane Demo");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Home", new JLabel("This is the Home tab", SwingConstants.CENTER));
        tabbedPane.addTab("Profile", new JLabel("This is the Profile tab", SwingConstants.CENTER));
        tabbedPane.addTab("Settings", new JLabel("This is the Settings tab", SwingConstants.CENTER));

        frame.add(tabbedPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
