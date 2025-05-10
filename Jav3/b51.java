package Jav3;

import javax.swing.*;

public class b51{
    public static void main(String[] args) {
        JFrame frame = new JFrame("SwingWorker Progress");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar bar = new JProgressBar(0, 100);
        JButton startButton = new JButton("Start");

        startButton.addActionListener(e -> {
            SwingWorker<Void, Integer> worker = new SwingWorker<>() {
                protected Void doInBackground() throws Exception {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(100); // 10 giây
                        publish(i);
                    }
                    return null;
                }

                protected void process(java.util.List<Integer> chunks) {
                    int value = chunks.get(chunks.size() - 1);
                    bar.setValue(value);
                }
            };
            worker.execute();
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(bar);
        frame.add(startButton);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
