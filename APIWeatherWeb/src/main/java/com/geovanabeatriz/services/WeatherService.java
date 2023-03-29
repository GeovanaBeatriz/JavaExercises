package com.geovanabeatriz.services;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import org.springframework.stereotype.Service;

import com.geovanabeatriz.domain.Weather;

@Service
public class WeatherService {

	public void getWeather(String cityname) throws IOException, InterruptedException {
		
		String url = "https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=93f331ad020a817e4ed1b289b6ce867a";
		URI endereco = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
		String body = response.body();
		System.out.println(body);
	}
	
	
}
