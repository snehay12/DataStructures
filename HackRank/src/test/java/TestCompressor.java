import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCompressor {

	private Compressor compressor;
	@Before
	public void setUp() throws Exception {
		compressor=new Compressor();
	}

	@Test
	public void test() {
		Assert.assertEquals(compressor.compressString("abc"), "1a1b1c");
		Assert.assertEquals(compressor.compressString("aaabbc"), "3a2b1c");
		Assert.assertEquals(compressor.compressString("aaabbcccaa"), "3a2b3c2a");
		Assert.assertEquals(compressor.compressString("a"), "1a");
		Assert.assertEquals(compressor.compressString("zzzz"), "4z");
	}

}
