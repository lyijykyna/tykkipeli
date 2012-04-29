package tykkipeli;

import java.awt.FlowLayout;
import javax.swing.*;
import tykkipeli.controller.Maailma;
import tykkipeli.controller.Tykkipeli;
import tykkipeli.gui.Ikkuna;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.Tykki;

/**
 *
 * @author
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	
        //TODO nämä johonkin olioon?
	Tykkipeli tykkipeli = new Tykkipeli();
        tykkipeli.alusta();
        Ikkuna ikkuna = new Ikkuna(tykkipeli);
        SwingUtilities.invokeLater(ikkuna);
    }
}
