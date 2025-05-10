package Jav2;

import javax.swing.*;

public class b21 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("City List");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] cities = {"Hanoi", "Saigon", "Da Nang", "Hue", "Can Tho", "Nha Trang", "Vung Tau", "Ha Long", "Hai Phong", "Quy Nhon"};
        JList<String> cityList = new JList<>(cities);
        JScrollPane scrollPane = new JScrollPane(cityList);
        JLabel countLabel = new JLabel("Total: " + cities.length);

        frame.add(scrollPane, "Center");
        frame.add(countLabel, "South");

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
