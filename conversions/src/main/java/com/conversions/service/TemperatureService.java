package com.conversions.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class TemperatureService {
	static final double TEMPERATURE_CONSTANT = 273.15;
	DecimalFormat df = new DecimalFormat("###.######");
	public double kelvintocelsius(double kelvin){
		return Double.parseDouble(df.format(kelvin - TEMPERATURE_CONSTANT));
	}
	
	public double celsiustokelvin(double celsius){
		return Double.parseDouble(df.format(celsius + TEMPERATURE_CONSTANT));
	}
}
