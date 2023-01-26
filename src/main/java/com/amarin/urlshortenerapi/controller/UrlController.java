package com.amarin.urlshortenerapi.controller;

import com.amarin.urlshortenerapi.dto.UrlLongRequest;
import com.amarin.urlshortenerapi.service.UrlService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

public class UrlController {


    public UrlController() {

    }

    public void convertToShortUrl() {
        return ;
    }

    public void getAndRedirect() {
        return ;
    }
}
