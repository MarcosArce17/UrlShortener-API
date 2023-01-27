package com.amarin.urlshortenerapi.entity;

import javax.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "url")
@Getter
@Setter
public class Url {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @Column(nullable = false)
  private String longUrl;

  @Column(nullable = false)
  private Date createdDate;

  private Date expiresDate;
}
