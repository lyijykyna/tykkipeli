/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tykkipeli.controller;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import tykkipeli.fysiikka.Lentorata;
import tykkipeli.model.Ammus;
import tykkipeli.model.Pelaaja;
import tykkipeli.model.Tykki;

/**
 *
 * @author
 */
public class TykkipeliTest {
    
    public TykkipeliTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPelaajienLukumaara method, of class Tykkipeli.
     */
    @Test
    public void testGetPelaajienLukumaaraTyhja() {
	System.out.println("getPelaajienLukumaara");
	Tykkipeli instance = new Tykkipeli();
	int expResult = 0;
	int result = instance.getPelaajienLukumaara();
	assertEquals(expResult, result);
    }
    
    @Test
    public void testGetPelaajienLukumaara() {
	System.out.println("getPelaajienLukumaara");
	Tykkipeli instance = new Tykkipeli();
	int expResult = 30;
	for (int i=0;i<30;i++)
	    instance.lisaaPelaaja(new Pelaaja("nimi"));
	int result = instance.getPelaajienLukumaara();
	assertEquals(expResult, result);
    }

    //poistetaan, koska ei ole enää olemassa metodiakaan
//    /**
//     * Test of setPelaajienLukumaara method, of class Tykkipeli.
//     */
//    @Test
//    public void testSetPelaajienLukumaara() {
//	System.out.println("setPelaajienLukumaara");
//	int pelaajienLukumaara = 700;
//	Tykkipeli instance = new Tykkipeli();
//	instance.setPelaajienLukumaara(pelaajienLukumaara);
//	//mikä on tämä assertjuttu? lisätään assert tähän nyt
//	assertEquals(pelaajienLukumaara, instance.getPelaajienLukumaara());
//    }

    /**
     * Test of getPelaajat method, of class Tykkipeli.
     */
    @Test
    public void testGetPelaajat() {
	System.out.println("getPelaajat");
	Tykkipeli instance = new Tykkipeli();
	Pelaaja p1 = new Pelaaja("p1");
	Pelaaja p2 = new Pelaaja("p2");
	List<Pelaaja> testilista = new ArrayList();
	testilista.add(p1);
	testilista.add(p2);
	instance.lisaaPelaaja(p1);
	instance.lisaaPelaaja(p2);
	List expResult = testilista;
	List result = instance.getPelaajat();
	assertEquals(expResult, result);
    }

    /**
     * Test of setPelaajat method, of class Tykkipeli.
     */
    @Test
    public void testSetPelaajat() {
	System.out.println("setPelaajat");
	List<Pelaaja> pelaajat = null;
	Pelaaja p1 = new Pelaaja("p1");
	Pelaaja p2 = new Pelaaja("p2");
	List<Pelaaja> testilista = new ArrayList();
	testilista.add(p1);
	testilista.add(p2);
	pelaajat = testilista;
	Tykkipeli instance = new Tykkipeli();
	instance.setPelaajat(pelaajat);
	assertArrayEquals(testilista.toArray(), instance.getPelaajat().toArray());
    }

    /**
     * Test of getPeliMaailma method, of class Tykkipeli.
     */
    @Test
    public void testGetPeliMaailma() {
	System.out.println("getPeliMaailma");
	Tykkipeli instance = new Tykkipeli();
	Maailma expResult = new Maailma();
	instance.setPeliMaailma(expResult);
	Maailma result = instance.getPeliMaailma();
	assertEquals(expResult, result);
    }

    //TODO: Luo Tykkipeli:lle konstruktori joka ottaa parametrina pelimaailman
    //	    ja testaa se
    
    /**
     * Test of setPeliMaailma method, of class Tykkipeli.
     */
    @Test
    public void testSetPeliMaailma() {
	System.out.println("setPeliMaailma");
	Maailma peliMaailma = new Maailma();
	Tykkipeli instance = new Tykkipeli();
	instance.setPeliMaailma(peliMaailma);
	assertEquals(peliMaailma, instance.getPeliMaailma());
    }

    /**
     * Test of lisaaPelaaja method, of class Tykkipeli.
     */
    @Test
    public void testLisaaPelaaja() {
	System.out.println("lisaaPelaaja");
	String nimi = "Pelaajan nimi";
	Pelaaja pelaaja = new Pelaaja(nimi);
	Tykkipeli instance = new Tykkipeli();
	instance.lisaaPelaaja(pelaaja);
	assertEquals(nimi, instance.getPelaajat().get(0).getNimi());
    }

    /**
     * Test of arvoPelaajienPaikat method, of class Tykkipeli.
     */
    @Test
    public void testArvoPelaajienPaikat2Pelaaja() {
	System.out.println("arvoPelaajienPaikat");
	Tykkipeli instance = new Tykkipeli();
	instance.lisaaPelaaja(new Pelaaja("p1"));
	instance.lisaaPelaaja(new Pelaaja("p2"));
	instance.arvoPelaajienPaikat();
	Pelaaja p1 = instance.getPelaajat().get(0);
	Pelaaja p2 = instance.getPelaajat().get(1);
	boolean tulos = true;
	for(int i=0;i<100;i++) {
	    if(p1.getSijainti().x >= p2.getSijainti().x) {
		tulos = false;
	    }
	}
	assertTrue(tulos);
    }

    /**
     * Test of pelaajaAmpuu method, of class Tykkipeli.
     */
    
    //nämä testit vaativat enemmän syventymistä, sillä tässä on ehkä koko pelin
    //tärkein asia
    //TODO: KUNNON TESTIT AMPUMISELLE
    @Test
    public void testPelaajaAmpuu() {
	//kaava vikipediasta: kantama
	//       v_0^2*sin(2*korokulma)
	//  R = ---------------------------
	//         putoamiskiihtyvyys
	//
	Pelaaja p1 = new Pelaaja("p1");
	Tykki t1 = new Tykki(0, 0);
	p1.setTykki(t1);
	System.out.println("Tykin sijainti "+p1.getTykki().getSijainti());
	Tykki t2 = new Tykki(100,0);
	//etäisyydelle 100:
	//v_0=Math.sqrt(1000);
	//koro=45°
	Tykkipeli peli = new Tykkipeli();
	Maailma maa = new Maailma();
	peli.setPeliMaailma(maa);
	peli.lisaaPelaaja(p1);
	Lentorata rata = peli.pelaajaAmpuu(p1, 45, Math.sqrt(1000));
	while (rata.getAmmus().getSijainti().y >= 0 && rata.getAmmus().getSijainti().x < 200) {
	    System.out.println(rata.getAmmus().getSijainti());
	    rata.iteroiRata();
	}
	//nykyisellä aika-askeleella ammus lentää maan alle ja x=102 ==> 3 tarkkuus
	assertEquals(t2.getSijainti().x, rata.getAmmus().getSijainti().x,3);
    }
}
