package Jav;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class b5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Digital Clock");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String time = now.format(formatter);

        JLabel label = new JLabel(time, SwingConstants.CENTER);
        frame.add(label);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

