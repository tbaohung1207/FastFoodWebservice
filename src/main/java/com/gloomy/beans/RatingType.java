package com.gloomy.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

/**
 * Copyright © 2017 Gloomy
 * Created by Gloomy on 03-Apr-17.
 */
@Entity
@Table(name = "rating_type")
@Getter
@Setter
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class RatingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rating_type_id")
    @JsonProperty("rating_type_id")
    private int ratingTypeId;

    @Column(name = "rating_type_name")
    @JsonProperty("rating_type_name")
    private String ratingTypeName;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinTable(name = "place_rating_type", joinColumns = {@JoinColumn(name = "rating_type_id")},
            inverseJoinColumns = {@JoinColumn(name = "place_type_id")})
    private Set<PlaceType> placeTypes;
}
