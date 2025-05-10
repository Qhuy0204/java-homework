package Jav2;

import javax.swing.*;

public class b32 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JButton clearButton = new JButton("Clear");

        clearButton.addActionListener(e -> textArea.setText(""));

        frame.setLayout(new java.awt.BorderLayout());
        frame.add(new JScrollPane(textArea), "Center");
        frame.add(clearButton, "South");

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
