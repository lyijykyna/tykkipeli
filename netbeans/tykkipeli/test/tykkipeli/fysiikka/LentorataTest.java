package tykkipeli.fysiikka;

import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;
import tykkipeli.controller.Maailma;
import tykkipeli.model.Ammus;

/**
 *
 * @author
 */
public class LentorataTest {
    
    Lentorata testiRata;
    
    public LentorataTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        testiRata = new Lentorata(0, 0, 0, 0, 0);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPutoamiskiihtyvyys method, of class Lentorata.
     */
    @Test
    public void testGetPutoamiskiihtyvyys() {
	System.out.println("getPutoamiskiihtyvyys");
	double expResult = 10.0;
	double result = testiRata.getPutoamiskiihtyvyys();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPutoamiskiihtyvyys method, of class Lentorata.
     */
    @Test
    public void testSetPutoamiskiihtyvyys() {
	System.out.println("setPutoamiskiihtyvyys");
	double putoamiskiihtyvyys = 0.0;
	testiRata.setPutoamiskiihtyvyys(putoamiskiihtyvyys);
	assertEquals(putoamiskiihtyvyys, testiRata.getPutoamiskiihtyvyys(), 0.0);
    }

    /**
     * Test of getAikaAskel method, of class Lentorata.
     */
    @Test
    public void testGetAikaAskel() {
	System.out.println("getAikaAskel");
	double expResult = 0.1;
	double result = testiRata.getAikaAskel();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAikaAskel method, of class Lentorata.
     */
    @Test
    public void testSetAikaAskel() {
	System.out.println("setAikaAskel");
	double aikaAskel = 0.0;
	testiRata.setAikaAskel(aikaAskel);
	assertEquals(aikaAskel, testiRata.getAikaAskel(), 0.0);
    }

    /**
     * Test of getAjanMuutos method, of class Lentorata.
     */
    @Test
    public void testGetDt() {
	System.out.println("getDt");
        Maailma testimaailma = new Maailma();
	double expResult = 0.0;
	double result = testiRata.getAjanMuutos();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAjanMuutos method, of class Lentorata.
     */
    @Test
    public void testSetDt() {
	System.out.println("setDt");
	int dt = 700;
	testiRata.setAjanMuutos(dt);
	assertEquals(dt, testiRata.getAjanMuutos(), 0.0);
    }

    /**
     * Test of getT0 method, of class Lentorata.
     */
    @Test
    public void testGetAlkuAika() {
	System.out.println("getAlkuAika");
	int aikaNolla = 0;
	int expResult = aikaNolla;
	int result = testiRata.getAlkuAika();
	assertEquals(expResult, result);
    }

    /**
     * Test of setT0 method, of class Lentorata.
     */
    @Test
    public void testSetAlkuAika() {
	System.out.println("setAlkuAika");
	int t0 = 6;
	testiRata.setAlkuAika(t0);
	assertEquals(t0, testiRata.getAlkuAika());
    }

    /**
     * Test of getV0x method, of class Lentorata.
     */
    @Test
    public void testGetAlkuNopeusX() {
	System.out.println("getAlkuNopeusX");
	double expResult = 0.0;
	double result = testiRata.getAlkuNopeusX();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setV0x method, of class Lentorata.
     */
    @Test
    public void testSetAlkuNopeusX() {
	System.out.println("setAlkuNopeusX");
	double v0 = 3;
	testiRata.setAlkuNopeusX(v0);
	assertEquals(v0, testiRata.getAlkuNopeusX(), 0.0);
    }

    /**
     * Test of getX0 method, of class Lentorata.
     */
    @Test
    public void testGetAlkuX() {
	System.out.println("getAlkuX");
	int expResult = 0;
	int result = testiRata.getAlkuX();
	assertEquals(expResult, result);
    }

    /**
     * Test of getV0y method, of class Lentorata.
     */
    @Test
    public void testGeAlkuNopeusY() {
	System.out.println("getAlkuNopeusY");
	double expResult = 0.0;
	double result = testiRata.getAlkuNopeusY();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setV0y method, of class Lentorata.
     */
    @Test
    public void testSetAlkuNopeusY() {
	System.out.println("setAlkuNopeusY");
	double v0y = 300;
	testiRata.setAlkuNopeusY(v0y);
	assertEquals(v0y, testiRata.getAlkuNopeusY(), 0.0);
    }

    /**
     * Test of setX0 method, of class Lentorata.
     */
    @Test
    public void testSetAlkuX() {
	System.out.println("setAlkuX");
	int x0 = -71;
	testiRata.setAlkuX(x0);
	assertEquals(x0, testiRata.getAlkuX());
    }

    /**
     * Test of getY0 method, of class Lentorata.
     */
    @Test
    public void testGetAlkuY() {
	System.out.println("getAlkuY");
	int expResult = 0;
	int result = testiRata.getAlkuY();
	assertEquals(expResult, result);
    }

    /**
     * Test of setY0 method, of class Lentorata.
     */
    @Test
    public void testSetAlkuY() {
	System.out.println("setAlkuY");
	int y0 = 99;
	testiRata.setAlkuY(y0);
	assertEquals(y0, testiRata.getAlkuY());
    }

    /**
     * Test of getAmmus method, of class Lentorata.
     */
    @Test
    public void testGetAmmus() {
	System.out.println("getAmmus");
	Lentorata instance = new Lentorata(13, 13, 0, 0, 0);
	Ammus expResult =  null;
	Ammus result = instance.getAmmus();
	assertEquals(expResult, result);
    }
    
    @Test
    public void testGetAmmusIteroinninJalkeen() {
	System.out.println("getAmmusIteroinninJalkeen");
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	Ammus ammus = new Ammus(13, 13);
	instance.setAmmus(ammus);
	instance.iteroiRata();
	Ammus expResult =  ammus;
	Ammus result = instance.getAmmus();
	assertEquals(expResult, result);
    }

    /**
     * Test of setAmmus method, of class Lentorata.
     */
    @Test
    public void testSetAmmus() {
	System.out.println("setAmmus");
	Ammus ammus = new Ammus();
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	instance.setAmmus(ammus);
	assertEquals(ammus,instance.getAmmus());
    }

    /**
     * Test of iteroiRata method, of class Lentorata.
     */
    @Test
    public void testIteroiRataAikaKuluuOikein() {
	int kierroksia = 13;
        testiRata.setAmmus(new Ammus());
        double testiAika = testiRata.getAikaAskel()*kierroksia;
        for(int i=0;i<kierroksia;i++) {
            testiRata.iteroiRata();
        }
        assertEquals(testiAika, testiRata.getAjanMuutos(),0.01);
    }
}
