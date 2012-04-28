package tykkipeli.controller;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import tykkipeli.model.Ammus;
import tykkipeli.model.PeliObjekti;
import tykkipeli.model.Tykki;

/**
 *
 * @author
 */
public class MaailmaTest {
    
    Maailma testiMaailma;
    
    public MaailmaTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        testiMaailma = new Maailma();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getObjektit method, of class Maailma.
     */
    @Test
    public void testGetObjektitTyhja() {
	System.out.println("getObjektitTyhja");
	List expResult = new ArrayList();
        List result = testiMaailma.getObjektit();
	assertEquals(expResult, result);
    }
    
    /**
     * Test of lisaaObjekti method, of class Maailma.
     */
    @Test
    public void testLisaaObjektiAmmus() {
	System.out.println("lisaaObjekti");
	PeliObjekti o = new Ammus();
	Ammus a = new Ammus();
	boolean testitulos = false;
	testiMaailma.lisaaObjekti(o);
	testiMaailma.lisaaObjekti(a);
	if(testiMaailma.getObjektit().get(0).equals(o) && testiMaailma.getObjektit().get(1).equals(a))
	    testitulos = true;
	assertTrue(testitulos);
    }
    
    @Test
    public void testLisaaObjektiTykki() {
	System.out.println("lisaaObjekti");
	PeliObjekti o = new Tykki();
	Tykki a = new Tykki();
	boolean testitulos = false;
	testiMaailma.lisaaObjekti(o);
	testiMaailma.lisaaObjekti(a);
	if(testiMaailma.getObjektit().get(0).equals(o) && testiMaailma.getObjektit().get(1).equals(a))
	    testitulos = true;
	assertTrue(testitulos);
    }
    
    @Test
    public void testLisaaObjektiTykkijaAmmus() {
	System.out.println("lisaaObjekti");
	PeliObjekti o = new Tykki();
	Ammus a = new Ammus();
	boolean testitulos = false;
	testiMaailma.lisaaObjekti(o);
	testiMaailma.lisaaObjekti(a);
	if(testiMaailma.getObjektit().get(0).equals(o) && testiMaailma.getObjektit().get(1).equals(a))
	    testitulos = true;
	assertTrue(testitulos);
    }
    
    /**
     * Test of getObjektit method, of class Maailma.
     */
    @Test
    public void testGetObjektit() {
	System.out.println("getObjektit");
	List<PeliObjekti> testilista = new ArrayList();
	Ammus a = new Ammus();
	Tykki t = new Tykki();
	testilista.add(t);
	testilista.add(a);
	//muista lisätä Maailma-instanssiinkin samassa järjestyksessä, ellei lisätä
	//jotain sorttia
	testiMaailma.lisaaObjekti(t);
	testiMaailma.lisaaObjekti(a);
	List expResult = testilista;
	List result = testiMaailma.getObjektit();
	assertEquals(expResult, result);
    }

    /**
     * Test of setObjektit method, of class Maailma.
     */
    @Test
    public void testSetObjektit() {
	System.out.println("setObjektit");
	List<PeliObjekti> objektit = null;
	List<PeliObjekti> testilista = new ArrayList();
	Ammus a = new Ammus();
	Tykki t = new Tykki();
	testilista.add(t);
	testilista.add(a);
	objektit=testilista;
	testiMaailma.setObjektit(objektit);
        assertEquals(testilista, testiMaailma.getObjektit());
    }

    /**
     * Test of getKORKEUS method, of class Maailma.
     */
    @Test
    public void testGetKORKEUS() {
	System.out.println("getKORKEUS");
	int expResult = 480; //tai mikä ikinä laitetaankaan pelimaailman korkeudeksi
	int result = Maailma.getKORKEUS();
	assertEquals(expResult, result);
    }

    /**
     * Test of setKORKEUS method, of class Maailma.
     */
    @Test
    public void testSetKORKEUS() {
	System.out.println("setKORKEUS");
	int KORKEUS = 0;
	Maailma.setKORKEUS(KORKEUS);
	assertEquals(KORKEUS,Maailma.getKORKEUS());
    }

    /**
     * Test of getLEVEYS method, of class Maailma.
     */
    @Test
    public void testGetLEVEYS() {
	System.out.println("getLEVEYS");
	int expResult = 640;
	int result = Maailma.getLEVEYS();
	assertEquals(expResult, result);
    }

    /**
     * Test of setLEVEYS method, of class Maailma.
     */
    @Test
    public void testSetLEVEYS() {
	System.out.println("setLEVEYS");
	int LEVEYS = 666;
	Maailma.setLEVEYS(LEVEYS);
        assertEquals(LEVEYS,Maailma.getLEVEYS());
    }

    /**
     * Test of tormaysTarkistus method, of class Maailma.
     */
    @Test
    public void testTormaysTarkistusSamaSijainti() {
	System.out.println("tormaysTarkistus");
	PeliObjekti o1 = new Ammus(0,0);
	PeliObjekti o2 = new Tykki(0,0);
	boolean expResult = true;
	boolean result = testiMaailma.tormaysTarkistus(o1, o2);
	assertEquals(expResult, result);
    }
    
    @Test
    public void testTormaysTarkistusEriSijainti() {
	System.out.println("tormaysTarkistus");
	PeliObjekti o1 = new Ammus(0,0);
	PeliObjekti o2 = new Tykki(666,-111);
	boolean expResult = false;
	boolean result = testiMaailma.tormaysTarkistus(o1, o2);
	assertEquals(expResult, result);
    }
}
