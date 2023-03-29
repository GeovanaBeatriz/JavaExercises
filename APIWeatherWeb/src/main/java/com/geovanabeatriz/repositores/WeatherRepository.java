package com.geovanabeatriz.repositores;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.geovanabeatriz.domain.Weather;

@Repository
public interface WeatherRepository extends MongoRepository<Weather, String> {

}
