package Jav3;

import java.awt.BorderLayout;

import javax.swing.*;

public class b45
{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Toggle");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox = new JCheckBox("Show Image");
        ImageIcon icon = new ImageIcon("your_image.jpg"); // chỉnh lại đường dẫn ảnh
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setVisible(false);

        checkBox.addActionListener(e -> imageLabel.setVisible(checkBox.isSelected()));

        frame.setLayout(new BorderLayout());
        frame.add(checkBox, BorderLayout.NORTH);
        frame.add(imageLabel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
