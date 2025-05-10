package Jav2;

import javax.swing.*;
import java.awt.*;

public class b18 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Chess Board");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(8, 8));

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                JPanel square = new JPanel();
                if ((row + col) % 2 == 0) {
                    square.setBackground(Color.WHITE);
                } else {
                    square.setBackground(Color.BLACK);
                }
                frame.add(square);
            }
        }

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
