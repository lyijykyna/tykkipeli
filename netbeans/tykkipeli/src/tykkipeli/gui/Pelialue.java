package tykkipeli.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import tykkipeli.controller.Tykkipeli;

/**
 *
 * @author 
 */
public class Pelialue extends JPanel {
    
    private Tykkipeli tykkipeli;
    
    public Pelialue(Tykkipeli tykkipeli) {
        this.tykkipeli = tykkipeli;
        this.setPreferredSize(new Dimension(640,480));
        this.setBackground(Color.red);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
    }
    
    
}
