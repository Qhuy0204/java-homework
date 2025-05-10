package Jav3;

import javax.swing.*;

public class b41 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Open Dialog");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Open Dialog");
        button.addActionListener(e -> {
            JDialog dialog = new JDialog(frame, "Dialog", true);
            dialog.setSize(200, 150);
            dialog.add(new JLabel("Dialog Opened", SwingConstants.CENTER));
            dialog.setLocationRelativeTo(frame);
            dialog.setVisible(true);
        });

        frame.add(button);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
