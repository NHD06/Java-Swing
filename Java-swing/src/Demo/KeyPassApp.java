package Demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyPassApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Pass App");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addKeyListener(new MyKeylistener());
        frame.setFocusable(true);
        frame.requestFocusInWindow();
    }
    static class MyKeylistener implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            if(keycode == KeyEvent.VK_ALL_CANDIDATES){
                JOptionPane.showMessageDialog(null, "Bạn đã nhấn phím: " + KeyEvent.getKeyText(keycode), "Nhấn phím", JOptionPane.INFORMATION_MESSAGE);
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
            throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
        }
    }
}
