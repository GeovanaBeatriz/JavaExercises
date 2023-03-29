package com.geovanabeatriz.domain;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Weather implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	private String cityname;
	private String temp;
	private Double humidity;
	private Double wind;
	
	public Weather() {
		
	}

	public Weather(Long id, String cityname, String temp, Double humidity, Double wind) {
		super();
		this.id = id;
		this.setCityname(cityname);
		this.temp = temp;
		this.humidity = humidity;
		this.wind = wind;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public Double getHumidity() {
		return humidity;
	}

	public void setHumidity(Double humidity) {
		this.humidity = humidity;
	}

	public Double getWind() {
		return wind;
	}

	public void setWind(Double wind) {
		this.wind = wind;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Weather other = (Weather) obj;
		return Objects.equals(id, other.id);
	}

	
	
	
	
}
