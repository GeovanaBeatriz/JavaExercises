package com.geovanabeatriz.resources;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.geovanabeatriz.services.WeatherService;

@RestController
@RequestMapping(value = "/weather")
public class WeatherResource {
	
@Autowired
private WeatherService weatherService;

}
