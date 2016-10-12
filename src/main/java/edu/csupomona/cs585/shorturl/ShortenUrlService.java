package edu.csupomona.cs585.shorturl;

public interface ShortenUrlService {

	public UrlResponse getShortUrl(String longUrl);

	public UrlResponse expandShortUrl(String shortUrl);

}