package com.cinenexa.cinenexabackend.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtensionDTO {
    private long id;
    private String name;
    private String description = "";
    private String endpoint;
    private String devName;
    private String devEmail;

    private String devUrl = "";
    private double rating = 0;
    private int ratingCount = 0;
    private boolean providesMovie = false;
    private boolean providesShow = false;
    private boolean providesAnime = false;
    private String configJson;
    private String domainId;
    private Date createdAt;
}
