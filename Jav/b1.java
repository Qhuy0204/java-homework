package Jav;

import javax.swing.*;

public class b1 {
    public static void main(String[] args) {
        // Tạo cửa sổ JFrame
        JFrame frame = new JFrame("My First Swing App");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tạo JLabel và căn giữa
        JLabel label = new JLabel("Hello World", SwingConstants.CENTER);
        frame.add(label);

        // Căn giữa cửa sổ trên màn hình
        frame.setLocationRelativeTo(null);
        
        // Hiển thị cửa sổ
        frame.setVisible(true);
    }
}
