package Game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlappyBird extends JFrame implements ActionListener, KeyListener {

    private Timer timer;
    private int birdY;
    private int birdVelocity;
    private int gravity;
    private boolean isJumping;
    private List<Obstacle> obstacles;

    public FlappyBird() {
        setTitle("Flappy Bird");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        birdY = 300;
        birdVelocity = 0;
        gravity = 2;
        isJumping = false;
        obstacles = new ArrayList<>();

        timer = new Timer(20, this);
        timer.start();

        addKeyListener(this);
        setFocusable(true);
        generateObstacle(); // Tạo chướng ngại vật ban đầu
    }

    public void generateObstacle() {
        Random rand = new Random();
        int obstacleHeight = rand.nextInt(300) + 50;
        Obstacle obstacle = new Obstacle(getWidth(), getHeight() - obstacleHeight - 20, 50, obstacleHeight);
        obstacles.add(obstacle);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        birdVelocity += gravity;
        birdY += birdVelocity;

        if (birdY > getHeight() - 30) {
            birdY = getHeight() - 30;
            birdVelocity = 0;
            isJumping = false;
        }

        for (Obstacle obstacle : obstacles) {
            obstacle.move();
        }

        if (obstacles.get(0).getX() < -obstacles.get(0).getWidth()) {
            obstacles.remove(0);
            generateObstacle();
        }

        for (Obstacle obstacle : obstacles) {
            if (obstacle.collidesWith(birdY)) {
                timer.stop();
                JOptionPane.showMessageDialog(this, "Game Over!");
                System.exit(0);
            }
        }

        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(100, birdY, 30, 30);

        g.setColor(Color.GREEN);
        g.fillRect(0, getHeight() - 20, getWidth(), 20);

        for (Obstacle obstacle : obstacles) {
            obstacle.draw(g);
        }
    }

    public void jump() {
        if (!isJumping) {
            birdVelocity = -20;
            isJumping = true;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            jump();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    private static class Obstacle {
        private int x, y, width, height;

        public Obstacle(int x, int y, int width, int height) {
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
        }

        public int getX() {
            return x;
        }

        public int getWidth() {
            return width;
        }

        public void move() {
            x -= 5;
        }

        public void draw(Graphics g) {
            g.setColor(Color.RED);
            g.fillRect(x, y, width, height);
        }

        public boolean collidesWith(int birdY) {
            return (birdY < y || birdY > y + height) && (x < 130 && x + width > 100);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlappyBird().setVisible(true));
    }
}
