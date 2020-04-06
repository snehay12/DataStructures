import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



/**
 * 
 */

/**
 * @author Sne
 *
 */
public class TestPermutationDetector {

	private PermutationDetector perm;
	@Before
	public void setUp() throws Exception {
		perm = new PermutationDetector();
	}

	@Test
	public void testIsPermutation() {
		Assert.assertTrue(perm.isPermutation("abc", "cba"));
		Assert.assertTrue(perm.isPermutation("ABC", "cba"));
		Assert.assertFalse(perm.isPermutation("zcv", "cba"));
	}

}
