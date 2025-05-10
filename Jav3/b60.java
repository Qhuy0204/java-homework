package Jav3;

import javax.swing.*;

public class b60 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Download");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JProgressBar progressBar = new JProgressBar(0, 100);
        JButton downloadButton = new JButton("Download");
        JLabel statusLabel = new JLabel("Status: Idle");

        downloadButton.addActionListener(e -> {
            SwingWorker<Void, Integer> worker = new SwingWorker<>() {
                protected Void doInBackground() throws Exception {
                    for (int i = 0; i <= 100; i++) {
                        Thread.sleep(50);
                        publish(i);
                    }
                    return null;
                }

                protected void process(java.util.List<Integer> chunks) {
                    int val = chunks.get(chunks.size() - 1);
                    progressBar.setValue(val);
                }

                protected void done() {
                    statusLabel.setText("Download Complete");
                }
            };
            worker.execute();
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(progressBar);
        frame.add(downloadButton);
        frame.add(statusLabel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
