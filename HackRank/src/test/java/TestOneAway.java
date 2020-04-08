import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestOneAway {

	private OneAway oneAway;
	
	@Before
	public void setUp() throws Exception {
		oneAway = new OneAway();
	}
	
	@Test
	public void testIsOneAway() {
		Assert.assertFalse(oneAway.isOneAway("abc", "a"));
		Assert.assertTrue(oneAway.isOneAway("abc", "acc"));
		Assert.assertFalse(oneAway.isOneAway("abc", "ccc"));
		
		Assert.assertTrue(oneAway.isOneAway("abc", "abdc"));
		Assert.assertTrue(oneAway.isOneAway("abc", "abcd"));
		Assert.assertTrue(oneAway.isOneAway("abc", "dabc"));
		
		Assert.assertTrue(oneAway.isOneAway("abc", "ab"));
		
		Assert.assertFalse(oneAway.isOneAway("abc", "act"));
	}

}
