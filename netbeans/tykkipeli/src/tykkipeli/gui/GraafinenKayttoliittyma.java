package tykkipeli.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * 
 */
public class GraafinenKayttoliittyma extends JDialog {
    
    public GraafinenKayttoliittyma() {
	setTitle("Tykkipeli");
	setSize(640, 480);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	MaanPiirrin maa = new MaanPiirrin();
	getContentPane().add(maa);
	pack();
	setVisible(true);
    }
}
