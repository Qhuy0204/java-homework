package Jav2;

import javax.swing.*;
import java.awt.*;

public class b26 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Brightness Adjuster");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider slider = new JSlider(0, 255, 128);
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(slider, BorderLayout.NORTH);

        slider.addChangeListener(e -> {
            int value = slider.getValue();
            frame.getContentPane().setBackground(new Color(value, value, value));
        });

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
