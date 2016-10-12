package edu.csupomona.cs585;

import static org.mockito.Mockito.*;

import org.junit.Test;

import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.UrlResponse;
import org.junit.*;

public class BigStringTableImplTest {
	
	@Test
	public void testPutString() {
		ShortenUrlService urlService = mock(ShortenUrlService.class);
		BigStringTable bigStringTable = new BigStringTableImpl(urlService);
		
		UrlResponse urlResponse = new UrlResponse();
		urlResponse.setId("https://goo.gl/fhgkdi");
		urlResponse.setLongUrl("http://cs58585/");		
		when(urlService.getShortUrl("http://cs58585")).thenReturn(urlResponse);
				
		String key = bigStringTable.putString("cs58585");
		Assert.assertEquals("fhgkdi", key);
		verify(urlService).getShortUrl("http://cs58585");
	}

}
