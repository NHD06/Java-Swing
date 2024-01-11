package Demo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GIU {
    
    private static ImageIcon icon = new ImageIcon("congnhat.jpg");

    public static void main(String[] args) {
        // Tạo một frame (cửa sổ) cho ứng dụng
        JFrame frame = new JFrame("Simple GUI App");

        // Tạo một nút
        JButton button = new JButton("Click Me!");

        // Thêm sự kiện lắng nghe cho nút
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Xử lý sự kiện khi nút được nhấp vào
                showMessageDialog();
                showImage();
            }
        });

        // Thêm nút vào frame
        frame.getContentPane().add(button);

        // Cấu hình frame
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Hiển thị frame ở giữa màn hình
        frame.setVisible(true);
    }

    // Phương thức hiển thị thông báo đơn giản
    private static void showMessageDialog() {
        JOptionPane.showMessageDialog(null, "Bạn đã nhấp vào nút!", "Thông báo", JOptionPane.INFORMATION_MESSAGE, icon);

    }
    private static void showImage(){
        JFrame imagFrame = new JFrame("Nhat Yeu Trinh");
        JLabel label = new JLabel(icon);
        imagFrame.getContentPane().add(label);
        imagFrame.setSize(800, 800);
        imagFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        imagFrame.setLocationRelativeTo(null);
        imagFrame.setVisible(true);
    }
}
