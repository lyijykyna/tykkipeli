/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tykkipeli.fysiikka;

import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;
import tykkipeli.model.Ammus;

/**
 *
 * @author
 */
public class LentorataTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPUTOAMISKIIHTYVYYS method, of class Lentorata.
     */
    @Test
    public void testGetPUTOAMISKIIHTYVYYS() {
	System.out.println("getPUTOAMISKIIHTYVYYS");
	double expResult = 10.0; //TODO: static jutut selväksi
	double result = Lentorata.getPUTOAMISKIIHTYVYYS();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPUTOAMISKIIHTYVYYS method, of class Lentorata.
     */
    @Test
    public void testSetPUTOAMISKIIHTYVYYS() {
	System.out.println("setPUTOAMISKIIHTYVYYS");
	double PUTOAMISKIIHTYVYYS = 0.0;
	Lentorata.setPUTOAMISKIIHTYVYYS(PUTOAMISKIIHTYVYYS);
	assertEquals(PUTOAMISKIIHTYVYYS, Lentorata.getPUTOAMISKIIHTYVYYS(), 0.0);
    }

    /**
     * Test of getAikaAskel method, of class Lentorata.
     */
    @Test
    public void testGetAikaAskel() {
	System.out.println("getAikaAskel");
	double expResult = 0.1;
	double result = Lentorata.getAikaAskel();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setAikaAskel method, of class Lentorata.
     */
    @Test
    public void testSetAikaAskel() {
	System.out.println("setAikaAskel");
	double aikaAskel = 0.0;
	Lentorata.setAikaAskel(aikaAskel);
	assertEquals(aikaAskel, Lentorata.getAikaAskel(), 0.0);
    }

    /**
     * Test of getDt method, of class Lentorata.
     */
    @Test
    public void testGetDt() {
	System.out.println("getDt");
	Lentorata instance = new Lentorata(0,0,0,0,0);
	double expResult = 0.0;
	double result = instance.getDt();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setDt method, of class Lentorata.
     */
    @Test
    public void testSetDt() {
	System.out.println("setDt");
	int dt = 700;
	Lentorata instance = new Lentorata(0,0,0,0,0);
	instance.setDt(dt);
	assertEquals(dt, instance.getDt(), 0.0);
    }

    /**
     * Test of getT0 method, of class Lentorata.
     */
    @Test
    public void testGetT0() {
	System.out.println("getT0");
	int aikaNolla = 111;
	Lentorata instance = new Lentorata(0, 0, 0, 0, aikaNolla);
	int expResult = aikaNolla;
	int result = instance.getT0();
	assertEquals(expResult, result);
    }

    /**
     * Test of setT0 method, of class Lentorata.
     */
    @Test
    public void testSetT0() {
	System.out.println("setT0");
	int t0 = 6;
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	instance.setT0(t0);
	assertEquals(t0, instance.getT0());
    }

    /**
     * Test of getV0x method, of class Lentorata.
     */
    @Test
    public void testGetV0x() {
	System.out.println("getV0x");
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	double expResult = 0.0;
	double result = instance.getV0x();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setV0x method, of class Lentorata.
     */
    @Test
    public void testSetV0x() {
	System.out.println("setV0x");
	double v0 = 3;
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	instance.setV0x(v0);
	assertEquals(v0, instance.getV0x(), 0.0);
    }

    /**
     * Test of getX0 method, of class Lentorata.
     */
    @Test
    public void testGetX0() {
	System.out.println("getX0");
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	int expResult = 0;
	int result = instance.getX0();
	assertEquals(expResult, result);
    }

    /**
     * Test of getV0y method, of class Lentorata.
     */
    @Test
    public void testGetV0y() {
	System.out.println("getV0y");
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	double expResult = 0.0;
	double result = instance.getV0y();
	assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setV0y method, of class Lentorata.
     */
    @Test
    public void testSetV0y() {
	System.out.println("setV0y");
	double v0y = 300;
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	instance.setV0y(v0y);
	assertEquals(v0y, instance.getV0y(), 0.0);
    }

    /**
     * Test of setX0 method, of class Lentorata.
     */
    @Test
    public void testSetX0() {
	System.out.println("setX0");
	int x0 = -71;
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	instance.setX0(x0);
	assertEquals(x0, instance.getX0());
    }

    /**
     * Test of getY0 method, of class Lentorata.
     */
    @Test
    public void testGetY0() {
	System.out.println("getY0");
	Lentorata instance = new Lentorata(0, 100, 0, 0, 0);
	int expResult = 100;
	int result = instance.getY0();
	assertEquals(expResult, result);
    }

    /**
     * Test of setY0 method, of class Lentorata.
     */
    @Test
    public void testSetY0() {
	System.out.println("setY0");
	int y0 = 99;
	Lentorata instance = new Lentorata(0, 0, 0, 0, 0);
	instance.setY0(y0);
	assertEquals(y0, instance.getY0());
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
	instance.iteroiRata(ammus);
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
    public void testIteroiRata() {
	fail("tarvitsee testejä");
    }
}
