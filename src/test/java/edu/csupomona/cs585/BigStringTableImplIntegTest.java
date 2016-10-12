package edu.csupomona.cs585;

import org.junit.Test;

import edu.csupomona.cs585.shorturl.ShortenUrlServiceImpl;
import org.junit.*;

public class BigStringTableImplIntegTest {

	@Test
	public void testPutString() {
		BigStringTable bigStringTable = new BigStringTableImpl(
				new ShortenUrlServiceImpl());
		String key = bigStringTable.putString("fhsdjfhdsjfdsf");
		Assert.assertEquals("fhsdjfhdsjfdsf", bigStringTable.getString(key));
	}
}
