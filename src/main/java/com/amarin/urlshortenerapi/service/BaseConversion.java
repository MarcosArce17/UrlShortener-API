package com.amarin.urlshortenerapi.service;

import org.springframework.stereotype.Service;

@Service
public class BaseConversion {

  private static final String ALLOWED_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
  private static final char[] allowedCharacters = ALLOWED_STRING.toCharArray();
  private static final int BASE = allowedCharacters.length;

  public String encode(long input) {
    var encodedString = new StringBuilder();

    if (input == 0) {
      return String.valueOf(allowedCharacters[0]);
    }

    while (input > 0) {
      encodedString.append(allowedCharacters[(int) (input % BASE)]);
      input = input / BASE;
    }

    return encodedString.reverse().toString();
  }

  public long decode(String input) {
    var characters = input.toCharArray();
    var length = characters.length;

    var decoded = 0;

    //counter is used to avoid reversing input string
    var counter = 1;
    for (char character : characters) {
      decoded += ALLOWED_STRING.indexOf(character) * Math.pow(BASE, length - counter);
      counter++;
    }
    return decoded;
  }
}
