package edu.csupomona.cs585;

import edu.csupomona.cs585.shorturl.ShortenUrlService;
import edu.csupomona.cs585.shorturl.ShortenUrlServiceImpl;
import edu.csupomona.cs585.shorturl.UrlResponse;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		ShortenUrlService urlService = new ShortenUrlServiceImpl();		
		BigStringTable bigStringTable = new BigStringTableImpl(urlService);
		
		String key = bigStringTable.putString("cs585-software-v-v");
		System.out.println("Received global key: " + key);
		
		System.out.println("Fetching the string value: " + bigStringTable.getString(key));
	}

}
