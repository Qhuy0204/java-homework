package Jav2;

import javax.swing.*;

public class b28 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Table");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {"Name", "Age", "Score"};
        Object[][] data = {
            {"An", 20, 8.5},
            {"Binh", 21, 7.8},
            {"Chi", 19, 9.1},
            {"Dung", 22, 6.4},
            {"Em", 20, 7.0}
        };

        JTable table = new JTable(data, columnNames);
        frame.add(new JScrollPane(table));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
