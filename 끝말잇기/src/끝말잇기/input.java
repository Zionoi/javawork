package 끝말잇기;
import javax.swing.*;   
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;

public class input {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("HelloWorld GUI");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 300));

                JLabel label = new JLabel("Hello World!!", SwingConstants.LEFT);
                JTextField textField = new JTextField(20);
                JButton button = new JButton("Submit");

                // JPanel to hold the text field and button
                JPanel panel = new JPanel();
                panel.add(textField);
                panel.add(button);

                // Add components to the frame
                frame.getContentPane().add(label, BorderLayout.NORTH);
                frame.getContentPane().add(panel, BorderLayout.SOUTH);

                // Center the frame on the screen
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation(dim.width / 2 - 400 / 2, dim.height / 2 - 300 / 2);

                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
