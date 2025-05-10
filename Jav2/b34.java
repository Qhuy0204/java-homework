package Jav2;

import javax.swing.*;

public class b34 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Spinner Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
        JLabel label = new JLabel("Value: 1");

        spinner.addChangeListener(e -> label.setText("Value: " + spinner.getValue()));

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(spinner);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
