package Jav3;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class b55 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Background");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton stopButton = new JButton("Stop");
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(stopButton, BorderLayout.SOUTH);

        frame.setContentPane(panel);

        Random rand = new Random();
        Timer timer = new Timer(1000, e -> {
            Color randomColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            panel.setBackground(randomColor);
        });
        timer.start();

        stopButton.addActionListener(e -> timer.stop());

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
