package com.cinenexa.cinenexabackend.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "extensions")
public class Extension {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty
    @Size(min = 5, max = 255)
    @NotNull
    private String name;

    @NotNull
    private String description = "";

    @NotNull
    @NotEmpty
    private String endpoint;

    @NotNull
    @NotEmpty
    private String devName;

    @NotNull
    @NotEmpty
    private String devEmail;

    @Column(nullable = false, updatable = false, insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    private String devUrl = "";
    private double rating = 0;
    private int ratingCount = 0;
    private boolean providesMovie = false;
    private boolean providesShow = false;
    private boolean providesAnime = false;
    private String configJson;
    private String domainId;
}
