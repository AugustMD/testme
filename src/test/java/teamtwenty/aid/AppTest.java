package teamtwenty.aid;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class GoldTest
    extends TestCase
{
    /**
     * Set value of each object type
     */
    Gold gold;
    
    
    /**
     * Create the gold plan test case
     */
    @Before
    public void initAppTest() {
        gold = new Gold();
    }

    /**
     * test gold plan
     */
    @Test
    public void testgetGold() {
        assertEquals(gold.getBasicMontlyRate(), 49.95);
    }

    /**
     * test silver plan
     */
    @Test
    public void testgetSilver()
    {
        assertEquals(silver.getBasicMontlyRate(), 49.95);
    }
}
