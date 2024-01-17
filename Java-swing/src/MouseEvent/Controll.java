package MouseEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Controll implements MouseListener {
    private View view = new View();
    public Controll(View view){
        super();
        this.view = view;
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // this.view.click();
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }   

    @Override
    public void mousePressed(MouseEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.view.enter();
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.view.exit();
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

}
