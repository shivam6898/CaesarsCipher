package caesars.cipher;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarsCipherTest {
	
	private CaesarsCipher caesarsCipher =new CaesarsCipher();

	@Test
	public void testCipheredMessageWithOffsetOf12() {
		//assertEquals(Object expected, Object actual)
	assertEquals("tu tai mdq kag pauzs",caesarsCipher.cipher("hi how are you doing", 12));
	}
	
	
	@Test
	public void testEmptyCipheredMessage() {
		//assertEquals(Object expected, Object actual)
	assertEquals("",caesarsCipher.cipher("", 12));
	}
	
	/*
	 * @Test public void testFailingCipheredMessage() { //assertEquals(Object
	 * expected, Object actual)
	 * assertEquals("",caesarsCipher.cipher("fail the test", 12)); }
	 */
	

}

//run as JunitTest
