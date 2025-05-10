package Jav2;

import javax.swing.*;
import java.awt.event.*;

public class b27 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progress Demo");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar(0, 100);
        JButton startButton = new JButton("Start");

        startButton.addActionListener(e -> {
            Timer timer = new Timer(50, new ActionListener() {
                int value = 0;
                public void actionPerformed(ActionEvent evt) {
                    progressBar.setValue(value++);
                    if (value > 100) ((Timer)evt.getSource()).stop();
                }
            });
            timer.start();
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(progressBar);
        frame.add(startButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
