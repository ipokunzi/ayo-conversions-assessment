package com.conversions.service;

import java.text.DecimalFormat;

import org.springframework.stereotype.Service;

@Service
public class VolumeService {
	static final double VOLUME_CONSTANT = 1000;
	DecimalFormat df = new DecimalFormat("###.######");
	public double milliliterstoliters(double milliliters){
		return Double.parseDouble(df.format(milliliters / VOLUME_CONSTANT));
	}
	
	public double literstomilliliters(double liters){	
		return Double.parseDouble(df.format(liters * VOLUME_CONSTANT));
	}
}
