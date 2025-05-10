package Jav;

import javax.swing.*;

public class b9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Window");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Open Dialog");
        button.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Dialog", true);
            dialog.setSize(200, 150);
            dialog.add(new JLabel("This is a dialog", SwingConstants.CENTER));
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
