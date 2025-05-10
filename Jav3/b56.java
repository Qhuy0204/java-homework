package Jav3;

import javax.swing.*;

public class b56 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Countdown");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Time: 10", SwingConstants.CENTER);
        JButton start = new JButton("Start");

        start.addActionListener(e -> {
            SwingWorker<Void, Integer> worker = new SwingWorker<>() {
                protected Void doInBackground() throws Exception {
                    for (int i = 10; i >= 0; i--) {
                        publish(i);
                        Thread.sleep(1000);
                    }
                    return null;
                }

                protected void process(java.util.List<Integer> chunks) {
                    int val = chunks.get(chunks.size() - 1);
                    label.setText("Time: " + val);
                }

                protected void done() {
                    label.setText("Finished");
                }
            };
            worker.execute();
        });

        frame.setLayout(new java.awt.BorderLayout());
        frame.add(label, "Center");
        frame.add(start, "South");

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
