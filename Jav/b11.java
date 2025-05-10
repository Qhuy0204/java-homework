package Jav;

import javax.swing.*;

public class b11 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("System Info");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String os = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("OS: " + os));
        panel.add(new JLabel("Java Version: " + javaVersion));

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
