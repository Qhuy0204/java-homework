package Jav;

import javax.swing.*;

public class b14 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Option Dialog");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel resultLabel = new JLabel("Your choice will appear here", SwingConstants.CENTER);

        JButton showButton = new JButton("Show Message");
        showButton.addActionListener(e -> {
            int result = JOptionPane.showConfirmDialog(frame, "Choose an option", "Message",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            switch (result) {
                case JOptionPane.YES_OPTION:
                    resultLabel.setText("You chose: Yes");
                    break;
                case JOptionPane.NO_OPTION:
                    resultLabel.setText("You chose: No");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    resultLabel.setText("You chose: Cancel");
                    break;
                default:
                    resultLabel.setText("No selection");
            }
        });

        frame.setLayout(new java.awt.BorderLayout());
        frame.add(showButton, java.awt.BorderLayout.NORTH);
        frame.add(resultLabel, java.awt.BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
