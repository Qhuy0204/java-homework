package Jav2;

import javax.swing.*;

public class b31 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SplitPane Example");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        JTextArea textArea = new JTextArea();

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                new JScrollPane(list), new JScrollPane(textArea));
        splitPane.setDividerLocation(200);

        frame.add(splitPane);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
