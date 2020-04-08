import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEliminateDuplicate {

	private EliminateDuplicate duplicate;
	@Before
	public void setUp() throws Exception {
		duplicate= new EliminateDuplicate();
	}

	@Test
	public void testDuplicateRemoval() {
		duplicate.add(1);
		duplicate.add(2);
		duplicate.add(1);
		duplicate.removeDuplicate();
		Assert.assertEquals(duplicate.size(), 2);
		
		duplicate.clearAll();
		
		duplicate.add(1);
		duplicate.add(1);
		duplicate.add(1);
		duplicate.removeDuplicate();
		Assert.assertEquals(duplicate.size(), 1);
	}

}
