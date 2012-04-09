/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tykkipeli.model;

import java.awt.Point;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author
 */
public class PeliObjektiTest {
    
    public PeliObjektiTest() {
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
     * Test of getSijainti method, of class PeliObjekti.
     */
    @Test
    public void testGetSijainti() {
	System.out.println("getSijainti");
	PeliObjekti instance = new PeliObjektiImpl();
	instance.setSijainti(new Point(13,13));
	Point expResult = new Point(13,13);
	Point result = instance.getSijainti();
	assertEquals(expResult, result);
    }

    /**
     * Test of setSijainti method, of class PeliObjekti.
     */
    @Test
    public void testSetSijainti() {
	System.out.println("setSijainti");
	Point sijainti = new Point(300,-111);
	PeliObjekti instance = new PeliObjektiImpl();
	instance.setSijainti(sijainti);
	assertEquals(sijainti, instance.getSijainti());
    }

    public class PeliObjektiImpl extends PeliObjekti {
    }
}
