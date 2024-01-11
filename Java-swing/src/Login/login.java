package Login;

import javax.swing.JFrame;

import javax.swing.*;

public class login extends JFrame {

    public void OverlappingComponentsExample() {
        setLayout(null);

        JLabel label1 = new JLabel("Label 1");
        label1.setBounds(50, 50, 100, 30); // Set vị trí và kích thước

        JLabel label2 = new JLabel("Label 2");
        label2.setBounds(50, 50, 100, 30); // Cùng vị trí với label1

        add(label1);
        add(label2);

        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OverlappingComponentsExample());
    }
}

