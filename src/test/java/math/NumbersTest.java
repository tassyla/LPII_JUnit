package math;

import junit.framework.TestCase;
import org.junit.*;

public class NumbersTest extends TestCase {

    private Numbers n;

    public NumbersTest(){
    }

    @BeforeClass
    public static void setUpClass(){
    }

    @AfterClass
    public static void tearDownClass(){
    }

    @Before
    public void setUp(){
        n = new Numbers();
    }

    @After
    public void tearDown(){
    }

    @Test
    public void testQuadradoPerfeito() {
        assertTrue(n.quadradoPerfeito(25));
    }

    @Test
    public void testAreaRetangulo() {
        assertEquals(100, n.areaRetangulo(20,  5));
    }

    @Test
    public void testDivisivel(){
        assertTrue(n.divisivel(32, 2));
    }
}