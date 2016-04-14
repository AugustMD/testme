package teamtwenty.aid;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

public class AppTest {
	private static Gold gold;
	
	@BeforeClass
	public static void initAppTest() {
		gold = new Gold();
	}
	
	@Test
	public void testGold() {
		assertEquals(gold.getBasicMontlyRate(),49.95,0.01);
	}

}
