package com.gloomy.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

/**
 * Copyright © 2017 Gloomy
 * Created by Gloomy on 03-Apr-17.
 */
@Entity
@Table(name = "place")
@Setter
@Getter
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "place_id")
    private int placeId;

    @Column(name = "place_name")
    private String placeName;

    @Column(name = "description")
    private String description;

    @Column(name = "open_time")
    private Time openTime;

    @Column(name = "close_time")
    private Time closeTime;

    @Column(name = "main_image")
    private String mainImage;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Set<PlaceImage> placeImages;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    private Set<PlaceRating> placeRatings;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_type_id")
    private PlaceType placeType;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "place_id")
    private PlaceAddress placeAddress;

    @ManyToMany(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinTable(name = "user_favorite", joinColumns = {@JoinColumn(name = "place_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private Set<User> users;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    @JsonIgnore
    private Set<FoodPrice> prices;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    @JsonIgnore
    private Set<PlaceComment> comments;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "place_id")
    @JsonIgnore
    private Set<PlaceFood> foods;

    @Transient
    private float averageRating;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Place) {
            return placeId == ((Place) obj).getPlaceId();
        }
        return super.equals(obj);
    }

    public float getAverageRating() {
        float point = 0;
        for (PlaceRating placeRating : placeRatings) {
            point += placeRating.getStar();
        }
        return point / placeRatings.size();
    }
}
