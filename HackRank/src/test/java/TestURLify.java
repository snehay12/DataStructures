import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestURLify {

	private URLify urlify;
	@Before
	public void setUp() throws Exception {
		urlify = new URLify();
	}

	@Test
	public void testURLify() {
		Assert.assertEquals(urlify.URLify("Amazon grass seed", 22), "Amazon%20%grass%20%seed");
	}

}
