package Jav2;

import javax.swing.*;

public class b25 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Gender Selection");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        JLabel label = new JLabel("Selected: ");

        male.addActionListener(e -> label.setText("Selected: Male"));
        female.addActionListener(e -> label.setText("Selected: Female"));

        JPanel panel = new JPanel();
        panel.add(male);
        panel.add(female);
        panel.add(label);

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
