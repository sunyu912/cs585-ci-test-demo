package edu.csupomona.cs585;

import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.UrlResponse;

public class BigStringTableImpl implements BigStringTable {

	private ShortenUrlService urlService;
	
	public BigStringTableImpl(ShortenUrlService urlService) {
		super();
		this.urlService = urlService;
	}

	public String putString(String value) {
		UrlResponse urlResponse = urlService.getShortUrl("http://" + value);
		return urlResponse.getId().substring(14);
	}

	public String getString(String key) {
		UrlResponse urlResponse = urlService.expandShortUrl("https://goo.gl/" + key);
		return urlResponse.getLongUrl().substring(
				7, urlResponse.getLongUrl().length() - 1);
	}

}
