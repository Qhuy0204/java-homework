package Jav2;

import javax.swing.*;
import java.awt.*;

public class b29 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cl = new CardLayout();
        JPanel cards = new JPanel(cl);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Page 1"));

        JPanel card2 = new JPanel();
        card2.add(new JButton("Click"));

        cards.add(card1, "card1");
        cards.add(card2, "card2");

        JButton switchBtn = new JButton("Switch");
        switchBtn.addActionListener(e -> cl.next(cards));

        frame.add(cards, BorderLayout.CENTER);
        frame.add(switchBtn, BorderLayout.SOUTH);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
