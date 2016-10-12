package edu.csupomona.cs585.shorturl;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;
import retrofit.http.Query;

public interface GoogleService {

    @Headers({ "Content-type: application/json" })
    @POST("/urlshortener/v1/url?key=AIzaSyDB3AYd6-4km3JKfIQWTHAMYJYIgIl5BZA")
    public UrlResponse getShortUrl(@Body LongUrl longUrl);

    @GET("/urlshortener/v1/url?key=AIzaSyDB3AYd6-4km3JKfIQWTHAMYJYIgIl5BZA")
    public UrlResponse expandShortUrl(@Query("shortUrl") String shortUrl);
}
