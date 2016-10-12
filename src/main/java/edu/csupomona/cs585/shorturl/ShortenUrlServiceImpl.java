package edu.csupomona.cs585.shorturl;

import retrofit.RestAdapter;
import retrofit.converter.JacksonConverter;

public class ShortenUrlServiceImpl implements ShortenUrlService {

	private RestAdapter restAdapter = new RestAdapter.Builder()
		    .setEndpoint("https://www.googleapis.com")
		    .setConverter(new JacksonConverter())
		    .build();

	private GoogleService googleService = restAdapter.create(GoogleService.class);

	public UrlResponse getShortUrl(String longUrl) {
		return googleService.getShortUrl(new LongUrl(longUrl));
	}

	public UrlResponse expandShortUrl(String shortUrl) {
		return googleService.expandShortUrl(shortUrl);
	}
}
