package tykkipeli.gui;

import com.sun.org.apache.xalan.internal.xsltc.dom.AbsoluteIterator;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author 
 */
public class Ikkuna extends JFrame {

    public Ikkuna(String title) throws HeadlessException {
	super(title);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void naytaIkkuna() {
	this.setVisible(true);
    }
    
    public void lisaaTeksti(String mjono) {
	JLabel teksti = new JLabel(mjono);
	this.getContentPane().add(teksti,BorderLayout.PAGE_START);
    }
    
    public void lisaaTeksti(String mjono, int x, int y) {
	JLabel teksti = new JLabel(mjono);
	this.getContentPane().add(teksti,BorderLayout.SOUTH);
    }
    
    public void lisaaPelialue(JPanel alue) {
	this.getContentPane().add(alue);
    }
    
    public void pakkaaIkkuna() {
	this.pack();
    }

    @Override
    public void paint(Graphics g) {
	super.paint(g);
	g.drawRect(10,440, 40, 40);
	g.drawLine(0, 480, 640, 480);
	g.drawRect(0, 0, 640, 480);
    }
    
}
