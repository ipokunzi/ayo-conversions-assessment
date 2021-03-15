package com.conversions.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class MassService {
	static final double MASS_CONSTANT = 2.20462;
	DecimalFormat df = new DecimalFormat("###.######");
	public double kilogramstopounds(double kilograms){
		return Double.parseDouble(df.format(kilograms * MASS_CONSTANT));
	}
	
	public double poundstokilograms(double pounds){	
		double result = Double.parseDouble(df.format(pounds / MASS_CONSTANT));
		return result;
	}
}
