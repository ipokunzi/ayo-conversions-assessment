package com.conversions.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class LengthService {
	static final double LENGTH_CONSTANT = 0.621371;
	DecimalFormat df = new DecimalFormat("###.######");
	public double milestokilometers(double miles){
		return Double.parseDouble(df.format(miles / LENGTH_CONSTANT));
	}
	
	public double kilometerstomiles(double kilometers){	
		return Double.parseDouble(df.format(kilometers * LENGTH_CONSTANT));
	}
}
