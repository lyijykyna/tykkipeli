package tykkipeli.gui;

import java.awt.Graphics;
import javax.swing.JPanel;


public class MaanPiirrin extends JPanel {

    @Override
    public void paint(Graphics g) {
	super.paint(g);
	g.drawLine(0, 400, 640, 400);
    }
    
    
}
