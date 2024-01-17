package MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class imageEx {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("C:\\Git\\Java-Swing\\Java-swing\\src\\MouseEvent/cuto.jpg");
        ImageIcon iconSize = new ImageIcon(icon.getImage().getScaledInstance(150, 200, java.awt.Image.SCALE_SMOOTH));
        JLabel label = new JLabel(iconSize);

        JPanel panel = new JPanel();
        panel.add(label);
        JFrame frame = new JFrame("Image Example");
        frame.setSize(900, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}

