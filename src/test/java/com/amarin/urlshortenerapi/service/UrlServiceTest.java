package com.amarin.urlshortenerapi.service;

import com.amarin.urlshortenerapi.dto.UrlLongRequest;
import com.amarin.urlshortenerapi.entity.Url;
import com.amarin.urlshortenerapi.repository.UrlRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class UrlServiceTest {


    public void convertToShortUrlTest() {
        var url = new Url();
        url.setLongUrl("https://github.com/Example/UrlShortener-API");
        url.setCreatedDate(new Date());
        url.setId(5);

    }

    public void getOriginalUrlTest() {

        var url = new Url();
        url.setLongUrl("https://github.com/Example/UrlShortener-API");
        url.setCreatedDate(new Date());
        url.setId(7);


    }
}
