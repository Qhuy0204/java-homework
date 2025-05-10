package Jav2;

import javax.swing.*;
import java.awt.*;

public class b17 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        frame.add(new JLabel("Username:"));
        frame.add(new JTextField(15));

        frame.add(new JLabel("Password:"));
        frame.add(new JPasswordField(15));

        frame.add(new JButton("Login"));

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
