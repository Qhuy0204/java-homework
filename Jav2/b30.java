package Jav2;

import javax.swing.*;

public class b30 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toolbar Example");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar toolBar = new JToolBar();
        String[] buttons = {"New", "Save", "Open"};

        for (String name : buttons) {
            JButton btn = new JButton(name);
            btn.addActionListener(e -> JOptionPane.showMessageDialog(frame, name + " clicked"));
            toolBar.add(btn);
        }

        frame.add(toolBar, "North");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
