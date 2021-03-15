package com.conversions.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class AreaService {
	static final double AREA_CONSTANT = 0.386102;
	DecimalFormat df = new DecimalFormat("###.######");
	public double squarekilometerstosquaremiles(double squarekilometers){
		return Double.parseDouble(df.format(squarekilometers * AREA_CONSTANT));
	}
	
	public double squaremilestosquarekilometers(double squaremiles){	
		return Double.parseDouble(df.format(squaremiles / AREA_CONSTANT));
	}
}
