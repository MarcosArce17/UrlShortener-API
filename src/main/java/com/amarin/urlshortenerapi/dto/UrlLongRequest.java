package com.amarin.urlshortenerapi.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import lombok.Data;

@Data
@ApiModel(description = "Request object for POST method")
public class UrlLongRequest {

  @ApiModelProperty(required = true, notes = "Url to convert to short")
  private String longUrl;

  @ApiModelProperty(notes = "Expiration datetime of url")
  private Date expiresDate;

}