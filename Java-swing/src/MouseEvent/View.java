package MouseEvent;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class View extends JFrame {
    private Model model;
    private JPanel Mousepanel;
    private JLabel position, x, y, count, countValue, empty1, empty2, checkin, checkinValue;

    public View() throws HeadlessException{
        this.model = new Model();
        this.init();
        // ImageIcon icon = new ImageIcon("cuto.jpg");
        // JLabel label = new JLabel(icon);
        // JPanel panel = new JPanel();
        // panel.add(label);

    }

    private void init(){
        this.setSize(800, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        Mousepanel = new JPanel();
        Mousepanel.setBackground(Color.ORANGE);
        JPanel Infopanel = new JPanel();
        Infopanel.setLayout(new GridLayout(3, 3));
        Infopanel.setBackground(Color.BLUE);
        Controll controll = new Controll(this);
        Mousepanel.addMouseListener(controll);

        position = new JLabel("Position: ");
        x = new JLabel("x = ");
        y = new JLabel("y = ");
        count = new JLabel("Number of click: ");
        countValue = new JLabel("n");
        empty1 = new JLabel();
        checkin = new JLabel("Mouse it is componenrt: ");
        checkinValue = new JLabel("no");
        empty2 = new JLabel();
        Infopanel.add(position);
        Infopanel.add(x);
        Infopanel.add(y);
        Infopanel.add(count);
        Infopanel.add(countValue);
        Infopanel.add(empty1);
        Infopanel.add(checkin);
        Infopanel.add(checkinValue);
        Infopanel.add(empty2);

        this.setLayout(new BorderLayout());
        this.add(Infopanel, BorderLayout.CENTER);
        this.add(Infopanel, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    public void click(){
        // this.model.addClick();
        // this.countValue.setText(this.model.getCount() + "");
    }
    public void enter(){
        this.model.enter();
        this.checkinValue.setText(this.model.getCheckIn() + "");
    }
    public void exit(){
        this.model.exit();
        this.checkinValue.setText(this.model.getCheckIn() + "");
    }
}
