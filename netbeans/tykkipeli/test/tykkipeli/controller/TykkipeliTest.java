/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tykkipeli.controller;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import tykkipeli.fysiikka.Lentorata;
import tykkipeli.model.Pelaaja;

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
    public void testGetPelaajienLukumaara() {
	System.out.println("getPelaajienLukumaara");
	Tykkipeli instance = new Tykkipeli();
	int expResult = 0;
	int result = instance.getPelaajienLukumaara();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setPelaajienLukumaara method, of class Tykkipeli.
     */
    @Test
    public void testSetPelaajienLukumaara() {
	System.out.println("setPelaajienLukumaara");
	int pelaajienLukumaara = 0;
	Tykkipeli instance = new Tykkipeli();
	instance.setPelaajienLukumaara(pelaajienLukumaara);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getPelaajat method, of class Tykkipeli.
     */
    @Test
    public void testGetPelaajat() {
	System.out.println("getPelaajat");
	Tykkipeli instance = new Tykkipeli();
	List expResult = null;
	List result = instance.getPelaajat();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setPelaajat method, of class Tykkipeli.
     */
    @Test
    public void testSetPelaajat() {
	System.out.println("setPelaajat");
	List<Pelaaja> pelaajat = null;
	Tykkipeli instance = new Tykkipeli();
	instance.setPelaajat(pelaajat);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of getPeliMaailma method, of class Tykkipeli.
     */
    @Test
    public void testGetPeliMaailma() {
	System.out.println("getPeliMaailma");
	Tykkipeli instance = new Tykkipeli();
	Maailma expResult = null;
	Maailma result = instance.getPeliMaailma();
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of setPeliMaailma method, of class Tykkipeli.
     */
    @Test
    public void testSetPeliMaailma() {
	System.out.println("setPeliMaailma");
	Maailma peliMaailma = null;
	Tykkipeli instance = new Tykkipeli();
	instance.setPeliMaailma(peliMaailma);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of lisaaPelaaja method, of class Tykkipeli.
     */
    @Test
    public void testLisaaPelaaja() {
	System.out.println("lisaaPelaaja");
	Pelaaja pelaaja = null;
	Tykkipeli instance = new Tykkipeli();
	instance.lisaaPelaaja(pelaaja);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of arvoPelaajienPaikat method, of class Tykkipeli.
     */
    @Test
    public void testArvoPelaajienPaikat() {
	System.out.println("arvoPelaajienPaikat");
	Tykkipeli instance = new Tykkipeli();
	instance.arvoPelaajienPaikat();
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }

    /**
     * Test of pelaajaAmpuu method, of class Tykkipeli.
     */
    @Test
    public void testPelaajaAmpuu() {
	System.out.println("pelaajaAmpuu");
	Pelaaja pelaaja = null;
	double koro = 0.0;
	int teho = 0;
	Tykkipeli instance = new Tykkipeli();
	Lentorata expResult = null;
	Lentorata result = instance.pelaajaAmpuu(pelaaja, koro, teho);
	assertEquals(expResult, result);
	// TODO review the generated test code and remove the default call to fail.
	fail("The test case is a prototype.");
    }
}
