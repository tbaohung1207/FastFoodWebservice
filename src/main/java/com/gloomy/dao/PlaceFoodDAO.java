package com.gloomy.dao;

import com.gloomy.beans.PlaceFood;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

/**
 * Copyright © 2017 Gloomy
 * Created by Gloomy on 25-Apr-17.
 */
@Transactional
public interface PlaceFoodDAO extends JpaRepository<PlaceFood, Integer> {

    Page<PlaceFood> findAllByPlacePlaceId(int placeId, Pageable pageable);
}