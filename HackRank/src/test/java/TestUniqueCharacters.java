import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestUniqueCharacters {

	private UniqueCharacters uniqueChar ;
	@Before
	public void setUp() throws Exception {
		uniqueChar = new UniqueCharacters();
	}

	@Test
	public void testIsUnique() {
		Assert.assertTrue(uniqueChar.isStringUnique("ab"));
		Assert.assertFalse(uniqueChar.isStringUnique(""));
		Assert.assertFalse(uniqueChar.isStringUnique("abadfasdfasdfwerwrewsdcxzcsdqwer"));
		Assert.assertTrue(uniqueChar.isStringUnique("z"));
		Assert.assertTrue(uniqueChar.isStringUnique("zurepnmbvwqaxcdfthyi"));
		Assert.assertFalse(uniqueChar.isStringUnique("abABebt"));
	}
	
	@Test
	public void testIsUniqueUsingSet() {
		Assert.assertTrue(uniqueChar.isStringUniqueUsingSet("ab"));
		Assert.assertFalse(uniqueChar.isStringUniqueUsingSet(""));
		Assert.assertFalse(uniqueChar.isStringUniqueUsingSet("abadfasdfasdfwerwrewsdcxzcsdqwer"));
		Assert.assertTrue(uniqueChar.isStringUniqueUsingSet("z"));
		Assert.assertTrue(uniqueChar.isStringUniqueUsingSet("zurepnmbvwqaxcdfthyi"));
		Assert.assertFalse(uniqueChar.isStringUniqueUsingSet("abABebt"));
	}

}
