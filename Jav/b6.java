package Jav;

import javax.swing.*;

public class b6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Icon");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Đặt biểu tượng cửa sổ
        ImageIcon icon = new ImageIcon("logo.png"); // Thay bằng tên file ảnh của bạn
        frame.setIconImage(icon.getImage());

        JLabel label = new JLabel("Custom Icon Window", SwingConstants.CENTER);
        frame.add(label);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
