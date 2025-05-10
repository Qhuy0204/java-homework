package Jav3;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class b48 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Only");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField field = new JTextField(10);
        JLabel label = new JLabel("Number: ");

        field.getDocument().addDocumentListener(new DocumentListener() {
            public void update() {
                String text = field.getText();
                if (!text.matches("\\d*")) {
                    field.setText(text.replaceAll("[^\\d]", ""));
                }
                label.setText("Number: " + field.getText());
            }

            public void insertUpdate(DocumentEvent e) { update(); }
            public void removeUpdate(DocumentEvent e) { update(); }
            public void changedUpdate(DocumentEvent e) {}
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(field);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
