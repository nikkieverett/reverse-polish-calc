import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up...");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Tearing down...");
    }

    @Test
    public void testBasicCase() throws Exception {
        System.out.println("Running basic test...");

    }

}