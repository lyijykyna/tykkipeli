package tykkipeli;

import java.awt.FlowLayout;
import javax.swing.*;
import tykkipeli.controller.Maailma;
import tykkipeli.controller.Tykkipeli;
import tykkipeli.gui.Ikkuna;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.Tykki;

/**
 *Tykkipelin alustava ja graafisen käyttöliittymän käynnistävä pääluokka.
 *
 */
public class Main {

    public static void main(String[] args) {
	
        //TODO nämä johonkin olioon?
	Tykkipeli tykkipeli = new Tykkipeli();
        tykkipeli.alusta();
        Ikkuna ikkuna = new Ikkuna(tykkipeli);
        SwingUtilities.invokeLater(ikkuna);
    }
}
