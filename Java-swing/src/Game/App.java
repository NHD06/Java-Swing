package Game;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

class App extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Vẽ hình chữ nhật đỏ
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        // Vẽ đường viền xanh cho hình chữ nhật
        g.setColor(Color.BLUE);
        g.drawRect(50, 50, 100, 100);

        // Vẽ hình tròn xanh lá cây
        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);

        // Vẽ đường viền đen cho hình tròn
        g.setColor(Color.BLACK);
        g.drawOval(200, 50, 100, 100);

        // Vẽ dòng chữ
        g.setColor(Color.BLACK);
        g.drawString("Hello, Graphics!", 50, 200);
    }
}
public class APP2 extends JFrame {

    public GraphicsExample() {
        setTitle("Graphics Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new GraphicsExample().setVisible(true);
        });
    }
}

