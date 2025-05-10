package Jav2;

import javax.swing.*;

public class b22{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Fruit Selector");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        JComboBox<String> comboBox = new JComboBox<>(fruits);
        JLabel label = new JLabel("Selected: ");

        comboBox.addActionListener(e -> label.setText("Selected: " + comboBox.getSelectedItem()));

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(comboBox);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
