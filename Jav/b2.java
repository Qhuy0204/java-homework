package Jav;

import javax.swing.*;

public class b2 {
    public static void main(String[] args) {
        // Tạo JFrame
        JFrame frame = new JFrame("Welcome");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Căn giữa

        // Hiển thị hộp thoại chào mừng
        JOptionPane.showMessageDialog(frame, "Welcome to Java Swing");

        // Thoát ứng dụng sau khi nhấn OK
        System.exit(0);
    }
}
