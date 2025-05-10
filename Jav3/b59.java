package Jav3;

import javax.swing.*;
import java.util.Random;

public class b59 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Numbers");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DefaultListModel<Integer> model = new DefaultListModel<>();
        JList<Integer> list = new JList<>(model);
        JButton generate = new JButton("Generate");

        generate.addActionListener(e -> {
            new Thread(() -> {
                Random rand = new Random();
                for (int i = 0; i < 10; i++) {
                    int number = rand.nextInt(100);
                    SwingUtilities.invokeLater(() -> model.addElement(number));
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ignored) {}
                }
            }).start();
        });

        frame.add(new JScrollPane(list), "Center");
        frame.add(generate, "South");

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
