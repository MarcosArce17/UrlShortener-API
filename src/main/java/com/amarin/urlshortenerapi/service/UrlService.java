package com.amarin.urlshortenerapi.service;

import com.amarin.urlshortenerapi.dto.UrlLongRequest;
import com.amarin.urlshortenerapi.entity.Url;
import com.amarin.urlshortenerapi.repository.UrlRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

public class UrlService {

    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public void convertToShortUrl() {

//        var entity = urlRepository.save();

        return ;
    }

    public void getOriginalUrl() {

//        var entity = urlRepository.findById();

        return ;
    }
}
