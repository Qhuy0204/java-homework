package Jav;

import javax.swing.*;

public class b4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Thay đổi đường dẫn ảnh nếu cần
        ImageIcon icon = new ImageIcon("your_image.jpg"); // thay bằng tên file ảnh
        JLabel label = new JLabel(icon);
        frame.add(label);
        frame.pack(); // Kích thước theo ảnh
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
